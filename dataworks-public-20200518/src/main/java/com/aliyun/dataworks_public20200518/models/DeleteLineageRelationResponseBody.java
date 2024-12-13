// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteLineageRelationResponseBody extends TeaModel {
    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>1010040007</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>qualifiedName should be in format as entity-table.entity-guid</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Request ID: used for locating logs and troubleshooting</p>
     * 
     * <strong>example:</strong>
     * <p>64B-587A-8CED-969E1973887FXXX-TT</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Operation result:</p>
     * <p>true: Success</p>
     * <p>false: Failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>Whether the call was successful. Values are as follows:</p>
     * <p>true: success</p>
     * <p>false: failed</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteLineageRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLineageRelationResponseBody self = new DeleteLineageRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLineageRelationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteLineageRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteLineageRelationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteLineageRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLineageRelationResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DeleteLineageRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
