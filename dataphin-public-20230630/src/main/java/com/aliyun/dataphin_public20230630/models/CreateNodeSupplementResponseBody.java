// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateNodeSupplementResponseBody extends TeaModel {
    /**
     * <p>Error code. A value of OK indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code returned by the backend</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <ul>
     * <li>Standard mode: the FlowId is returned.</li>
     * <li>Bulk mode: the submitted JobId is returned. You can call GetOperationSubmitStatus to query the task submission status. After the submission succeeds, the FlowId is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f_2264518792396800000_20210223_2329354897145659392</p>
     */
    @NameInMap("SubmitId")
    public String submitId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateNodeSupplementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeSupplementResponseBody self = new CreateNodeSupplementResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNodeSupplementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateNodeSupplementResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateNodeSupplementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNodeSupplementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNodeSupplementResponseBody setSubmitId(String submitId) {
        this.submitId = submitId;
        return this;
    }
    public String getSubmitId() {
        return this.submitId;
    }

    public CreateNodeSupplementResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
