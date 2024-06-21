// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTraceAppResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The response in JSON format, including the HTTP status code, error code, response message, and trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\\&quot;code\\&quot;:200,\\&quot;data\\&quot;:\\&quot;{\\\\\&quot;code\\\\\&quot;:200,\\\\\&quot;data\\\\\&quot;:true,\\\\\&quot;errorCode\\\\\&quot;:\\\\\&quot;The application is deleted\\\\\&quot;,\\\\\&quot;message\\\\\&quot;:\\\\\&quot;The application is deleted\\\\\&quot;,\\\\\&quot;success\\\\\&quot;:true,\\\\\&quot;traceId\\\\\&quot;:\\\\\&quot;0bc0594d15954826692915817e\<em>\</em>\<em>\</em>\\\\\&quot;}\\&quot;,\\&quot;errorCode\\&quot;:\\&quot;The application is deleted\\&quot;,\\&quot;message\\&quot;:\\&quot;The application is deleted\\&quot;,\\&quot;success\\&quot;:true,\\&quot;traceId\\&quot;:\\&quot;0ab2646915954826692568137d\<em>\</em>\<em>\</em>\\&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error. Please try again. Contact the DingTalk service account if the issue                              persists after multiple retries.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>46355DD8-FC56-40C5-BFC6-269DE4F9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <p>true: The request was successful.</p>
     * <p>false: The request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteTraceAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraceAppResponseBody self = new DeleteTraceAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTraceAppResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DeleteTraceAppResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteTraceAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteTraceAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTraceAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
