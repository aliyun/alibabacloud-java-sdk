// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentKnowledgeBaseResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDataAgentKnowledgeBaseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDataAgentKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentKnowledgeBaseResponseBody self = new DeleteDataAgentKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentKnowledgeBaseResponseBody setData(DeleteDataAgentKnowledgeBaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDataAgentKnowledgeBaseResponseBodyData getData() {
        return this.data;
    }

    public DeleteDataAgentKnowledgeBaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteDataAgentKnowledgeBaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteDataAgentKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataAgentKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteDataAgentKnowledgeBaseResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>kb-HZ-rtl5lwx********q32d3ux</p>
         */
        @NameInMap("KbUuid")
        public String kbUuid;

        public static DeleteDataAgentKnowledgeBaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataAgentKnowledgeBaseResponseBodyData self = new DeleteDataAgentKnowledgeBaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDataAgentKnowledgeBaseResponseBodyData setKbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }
        public String getKbUuid() {
            return this.kbUuid;
        }

    }

}
