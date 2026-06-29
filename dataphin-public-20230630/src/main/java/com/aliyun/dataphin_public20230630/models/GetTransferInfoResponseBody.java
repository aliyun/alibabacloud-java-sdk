// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTransferInfoResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public GetTransferInfoResponseBodyData data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTransferInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTransferInfoResponseBody self = new GetTransferInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTransferInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTransferInfoResponseBody setData(GetTransferInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTransferInfoResponseBodyData getData() {
        return this.data;
    }

    public GetTransferInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTransferInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTransferInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTransferInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTransferInfoResponseBodyDataCreator extends TeaModel {
        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000001</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetTransferInfoResponseBodyDataCreator build(java.util.Map<String, ?> map) throws Exception {
            GetTransferInfoResponseBodyDataCreator self = new GetTransferInfoResponseBodyDataCreator();
            return TeaModel.build(map, self);
        }

        public GetTransferInfoResponseBodyDataCreator setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTransferInfoResponseBodyDataCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetTransferInfoResponseBodyDataLastModifier extends TeaModel {
        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000001</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetTransferInfoResponseBodyDataLastModifier build(java.util.Map<String, ?> map) throws Exception {
            GetTransferInfoResponseBodyDataLastModifier self = new GetTransferInfoResponseBodyDataLastModifier();
            return TeaModel.build(map, self);
        }

        public GetTransferInfoResponseBodyDataLastModifier setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTransferInfoResponseBodyDataLastModifier setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetTransferInfoResponseBodyDataNewOwner extends TeaModel {
        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000001</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetTransferInfoResponseBodyDataNewOwner build(java.util.Map<String, ?> map) throws Exception {
            GetTransferInfoResponseBodyDataNewOwner self = new GetTransferInfoResponseBodyDataNewOwner();
            return TeaModel.build(map, self);
        }

        public GetTransferInfoResponseBodyDataNewOwner setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTransferInfoResponseBodyDataNewOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetTransferInfoResponseBodyDataOldOwner extends TeaModel {
        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000001</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetTransferInfoResponseBodyDataOldOwner build(java.util.Map<String, ?> map) throws Exception {
            GetTransferInfoResponseBodyDataOldOwner self = new GetTransferInfoResponseBodyDataOldOwner();
            return TeaModel.build(map, self);
        }

        public GetTransferInfoResponseBodyDataOldOwner setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTransferInfoResponseBodyDataOldOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>userId is error</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The name of the transfer module.</p>
         * 
         * <strong>example:</strong>
         * <p>table owner</p>
         */
        @NameInMap("PrivilegeDisplayName")
        public String privilegeDisplayName;

        /**
         * <p>The status of the transfer module.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries build(java.util.Map<String, ?> map) throws Exception {
            GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries self = new GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries();
            return TeaModel.build(map, self);
        }

        public GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries setPrivilegeDisplayName(String privilegeDisplayName) {
            this.privilegeDisplayName = privilegeDisplayName;
            return this;
        }
        public String getPrivilegeDisplayName() {
            return this.privilegeDisplayName;
        }

        public GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetTransferInfoResponseBodyData extends TeaModel {
        /**
         * <p>The creator.</p>
         */
        @NameInMap("Creator")
        public GetTransferInfoResponseBodyDataCreator creator;

        /**
         * <p>The approval flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1753669315426</p>
         */
        @NameInMap("FlowId")
        public Long flowId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1632036495973809</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1632036495973809</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The last modifier.</p>
         */
        @NameInMap("LastModifier")
        public GetTransferInfoResponseBodyDataLastModifier lastModifier;

        /**
         * <p>The new owner.</p>
         */
        @NameInMap("NewOwner")
        public GetTransferInfoResponseBodyDataNewOwner newOwner;

        /**
         * <p>The previous owner.</p>
         */
        @NameInMap("OldOwner")
        public GetTransferInfoResponseBodyDataOldOwner oldOwner;

        /**
         * <p>The transfer mode. Valid values:</p>
         * <ul>
         * <li>ONE_STOP: one-click transfer.</li>
         * <li>FUNCTION_MODULE_BASED: transfer by function module.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONE_STOP</p>
         */
        @NameInMap("PrivilegeTransferMode")
        public String privilegeTransferMode;

        /**
         * <p>The transfer details of function modules.</p>
         */
        @NameInMap("PrivilegeTransferResultEntries")
        public java.util.List<GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries> privilegeTransferResultEntries;

        /**
         * <p>The approval ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProposalId")
        public Long proposalId;

        /**
         * <p>The approval title.</p>
         * 
         * <strong>example:</strong>
         * <p>transefer title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The transfer description.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("TransferComment")
        public String transferComment;

        /**
         * <p>The transfer status.</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("TransferStatus")
        public String transferStatus;

        public static GetTransferInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTransferInfoResponseBodyData self = new GetTransferInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTransferInfoResponseBodyData setCreator(GetTransferInfoResponseBodyDataCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetTransferInfoResponseBodyDataCreator getCreator() {
            return this.creator;
        }

        public GetTransferInfoResponseBodyData setFlowId(Long flowId) {
            this.flowId = flowId;
            return this;
        }
        public Long getFlowId() {
            return this.flowId;
        }

        public GetTransferInfoResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTransferInfoResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTransferInfoResponseBodyData setLastModifier(GetTransferInfoResponseBodyDataLastModifier lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public GetTransferInfoResponseBodyDataLastModifier getLastModifier() {
            return this.lastModifier;
        }

        public GetTransferInfoResponseBodyData setNewOwner(GetTransferInfoResponseBodyDataNewOwner newOwner) {
            this.newOwner = newOwner;
            return this;
        }
        public GetTransferInfoResponseBodyDataNewOwner getNewOwner() {
            return this.newOwner;
        }

        public GetTransferInfoResponseBodyData setOldOwner(GetTransferInfoResponseBodyDataOldOwner oldOwner) {
            this.oldOwner = oldOwner;
            return this;
        }
        public GetTransferInfoResponseBodyDataOldOwner getOldOwner() {
            return this.oldOwner;
        }

        public GetTransferInfoResponseBodyData setPrivilegeTransferMode(String privilegeTransferMode) {
            this.privilegeTransferMode = privilegeTransferMode;
            return this;
        }
        public String getPrivilegeTransferMode() {
            return this.privilegeTransferMode;
        }

        public GetTransferInfoResponseBodyData setPrivilegeTransferResultEntries(java.util.List<GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries> privilegeTransferResultEntries) {
            this.privilegeTransferResultEntries = privilegeTransferResultEntries;
            return this;
        }
        public java.util.List<GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries> getPrivilegeTransferResultEntries() {
            return this.privilegeTransferResultEntries;
        }

        public GetTransferInfoResponseBodyData setProposalId(Long proposalId) {
            this.proposalId = proposalId;
            return this;
        }
        public Long getProposalId() {
            return this.proposalId;
        }

        public GetTransferInfoResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTransferInfoResponseBodyData setTransferComment(String transferComment) {
            this.transferComment = transferComment;
            return this;
        }
        public String getTransferComment() {
            return this.transferComment;
        }

        public GetTransferInfoResponseBodyData setTransferStatus(String transferStatus) {
            this.transferStatus = transferStatus;
            return this;
        }
        public String getTransferStatus() {
            return this.transferStatus;
        }

    }

}
