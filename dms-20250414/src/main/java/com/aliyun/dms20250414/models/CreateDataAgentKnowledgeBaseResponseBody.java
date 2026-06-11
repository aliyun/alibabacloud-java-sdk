// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The data returned by the request.</p>
     */
    @NameInMap("Data")
    public CreateDataAgentKnowledgeBaseResponseBodyData data;

    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataAgentKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentKnowledgeBaseResponseBody self = new CreateDataAgentKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentKnowledgeBaseResponseBody setData(CreateDataAgentKnowledgeBaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataAgentKnowledgeBaseResponseBodyData getData() {
        return this.data;
    }

    public CreateDataAgentKnowledgeBaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataAgentKnowledgeBaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataAgentKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataAgentKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataAgentKnowledgeBaseResponseBodyData extends TeaModel {
        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-HZ-ra99akg0t*********1bku</p>
         */
        @NameInMap("KbUuid")
        public String kbUuid;

        public static CreateDataAgentKnowledgeBaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAgentKnowledgeBaseResponseBodyData self = new CreateDataAgentKnowledgeBaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataAgentKnowledgeBaseResponseBodyData setKbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }
        public String getKbUuid() {
            return this.kbUuid;
        }

    }

}
