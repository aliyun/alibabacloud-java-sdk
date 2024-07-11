// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PreviewWorkflowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("WorkflowDetail")
    public PreviewWorkflowResponseBodyWorkflowDetail workflowDetail;

    public static PreviewWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewWorkflowResponseBody self = new PreviewWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewWorkflowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PreviewWorkflowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PreviewWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PreviewWorkflowResponseBody setWorkflowDetail(PreviewWorkflowResponseBodyWorkflowDetail workflowDetail) {
        this.workflowDetail = workflowDetail;
        return this;
    }
    public PreviewWorkflowResponseBodyWorkflowDetail getWorkflowDetail() {
        return this.workflowDetail;
    }

    public static class PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Owner</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>db_test</p>
         */
        @NameInMap("RealName")
        public String realName;

        /**
         * <strong>example:</strong>
         * <p>16***</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser build(java.util.Map<String, ?> map) throws Exception {
            PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser self = new PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser();
            return TeaModel.build(map, self);
        }

        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserList extends TeaModel {
        @NameInMap("AuditUser")
        public java.util.List<PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser> auditUser;

        public static PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserList build(java.util.Map<String, ?> map) throws Exception {
            PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserList self = new PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserList();
            return TeaModel.build(map, self);
        }

        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserList setAuditUser(java.util.List<PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser> auditUser) {
            this.auditUser = auditUser;
            return this;
        }
        public java.util.List<PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserListAuditUser> getAuditUser() {
            return this.auditUser;
        }

    }

    public static class PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode extends TeaModel {
        @NameInMap("AuditUserList")
        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserList auditUserList;

        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>Owner</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>SYS</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode build(java.util.Map<String, ?> map) throws Exception {
            PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode self = new PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode();
            return TeaModel.build(map, self);
        }

        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode setAuditUserList(PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserList auditUserList) {
            this.auditUserList = auditUserList;
            return this;
        }
        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNodeAuditUserList getAuditUserList() {
            return this.auditUserList;
        }

        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeList extends TeaModel {
        @NameInMap("WorkflowNode")
        public java.util.List<PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode> workflowNode;

        public static PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeList build(java.util.Map<String, ?> map) throws Exception {
            PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeList self = new PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeList();
            return TeaModel.build(map, self);
        }

        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeList setWorkflowNode(java.util.List<PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode> workflowNode) {
            this.workflowNode = workflowNode;
            return this;
        }
        public java.util.List<PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeListWorkflowNode> getWorkflowNode() {
            return this.workflowNode;
        }

    }

    public static class PreviewWorkflowResponseBodyWorkflowDetail extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("WfCateName")
        public String wfCateName;

        @NameInMap("WorkflowNodeList")
        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeList workflowNodeList;

        public static PreviewWorkflowResponseBodyWorkflowDetail build(java.util.Map<String, ?> map) throws Exception {
            PreviewWorkflowResponseBodyWorkflowDetail self = new PreviewWorkflowResponseBodyWorkflowDetail();
            return TeaModel.build(map, self);
        }

        public PreviewWorkflowResponseBodyWorkflowDetail setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public PreviewWorkflowResponseBodyWorkflowDetail setWfCateName(String wfCateName) {
            this.wfCateName = wfCateName;
            return this;
        }
        public String getWfCateName() {
            return this.wfCateName;
        }

        public PreviewWorkflowResponseBodyWorkflowDetail setWorkflowNodeList(PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeList workflowNodeList) {
            this.workflowNodeList = workflowNodeList;
            return this;
        }
        public PreviewWorkflowResponseBodyWorkflowDetailWorkflowNodeList getWorkflowNodeList() {
            return this.workflowNodeList;
        }

    }

}
