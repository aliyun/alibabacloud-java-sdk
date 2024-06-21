// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusGlobalViewResponseBody extends TeaModel {
    /**
     * <p>Status code. 200 is success, other status codes are exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Success&quot;:true,&quot;Msg&quot;:&quot;OK&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Additional Message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>337B8F7E-0A64-5768-9225-E9B3CF******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusGlobalViewResponseBody self = new DeletePrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusGlobalViewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeletePrometheusGlobalViewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeletePrometheusGlobalViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
