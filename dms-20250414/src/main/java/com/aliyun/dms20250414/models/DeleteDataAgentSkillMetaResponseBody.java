// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentSkillMetaResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public DeleteDataAgentSkillMetaResponseBodyData data;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDataAgentSkillMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentSkillMetaResponseBody self = new DeleteDataAgentSkillMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentSkillMetaResponseBody setData(DeleteDataAgentSkillMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDataAgentSkillMetaResponseBodyData getData() {
        return this.data;
    }

    public DeleteDataAgentSkillMetaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteDataAgentSkillMetaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteDataAgentSkillMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataAgentSkillMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteDataAgentSkillMetaResponseBodyData extends TeaModel {
        /**
         * <p>The skill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ski-04pomiln*************j0</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The operation was successful.                                 </li>
         * <li><strong>false</strong>: The operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteDataAgentSkillMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataAgentSkillMetaResponseBodyData self = new DeleteDataAgentSkillMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDataAgentSkillMetaResponseBodyData setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public DeleteDataAgentSkillMetaResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
