// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTransferInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTransferInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
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
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
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
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
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
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
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
         * <strong>example:</strong>
         * <p>userId is error</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <strong>example:</strong>
         * <p>table owner</p>
         */
        @NameInMap("PrivilegeDisplayName")
        public String privilegeDisplayName;

        /**
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
        @NameInMap("Creator")
        public GetTransferInfoResponseBodyDataCreator creator;

        /**
         * <strong>example:</strong>
         * <p>1753669315426</p>
         */
        @NameInMap("FlowId")
        public Long flowId;

        /**
         * <strong>example:</strong>
         * <p>1632036495973809</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1632036495973809</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("LastModifier")
        public GetTransferInfoResponseBodyDataLastModifier lastModifier;

        @NameInMap("NewOwner")
        public GetTransferInfoResponseBodyDataNewOwner newOwner;

        @NameInMap("OldOwner")
        public GetTransferInfoResponseBodyDataOldOwner oldOwner;

        /**
         * <strong>example:</strong>
         * <p>ONE_STOP</p>
         */
        @NameInMap("PrivilegeTransferMode")
        public String privilegeTransferMode;

        @NameInMap("PrivilegeTransferResultEntries")
        public java.util.List<GetTransferInfoResponseBodyDataPrivilegeTransferResultEntries> privilegeTransferResultEntries;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProposalId")
        public Long proposalId;

        /**
         * <strong>example:</strong>
         * <p>transefer title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("TransferComment")
        public String transferComment;

        /**
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
