// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopRtcAsrTaskResponseBody extends TeaModel {
    /**
     * <p>The result of the request. If success is returned, the request is successful. If an error message is returned, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3D208CC1-27C9-51E9-82B8-A6682D466421</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned HTTP status code. HTTP status code 2000 indicates that the request is successful. If another HTTP status code is returned, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("RetCode")
    public Long retCode;

    public static StopRtcAsrTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopRtcAsrTaskResponseBody self = new StopRtcAsrTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopRtcAsrTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StopRtcAsrTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopRtcAsrTaskResponseBody setRetCode(Long retCode) {
        this.retCode = retCode;
        return this;
    }
    public Long getRetCode() {
        return this.retCode;
    }

}
