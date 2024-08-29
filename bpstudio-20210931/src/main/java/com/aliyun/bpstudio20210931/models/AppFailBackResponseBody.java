// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class AppFailBackResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The disaster recovery switchback task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3309</p>
     */
    @NameInMap("Data")
    public Integer data;

    /**
     * <p>The returned message. If the request was successful, a success message is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>OKITHEVRQCN6ULQG</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7036DDBE-0ABA-52D7-A39D-75E511970F07</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AppFailBackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppFailBackResponseBody self = new AppFailBackResponseBody();
        return TeaModel.build(map, self);
    }

    public AppFailBackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppFailBackResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public AppFailBackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppFailBackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
