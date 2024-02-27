// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetInviteStatusResponseBody extends TeaModel {
    /**
     * <p>Status Code. Error Code:</p>
     * <br>
     * <p>- 3057 InviteId is empty</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetInviteStatusResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, Alibaba Cloud will track errors with this.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInviteStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInviteStatusResponseBody self = new GetInviteStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInviteStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInviteStatusResponseBody setData(GetInviteStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInviteStatusResponseBodyData getData() {
        return this.data;
    }

    public GetInviteStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInviteStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInviteStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInviteStatusResponseBodyDataInviteStatusInviteStatusList extends TeaModel {
        /**
         * <p>The time that Distribution Customer successfully associated with Distributor.</br></p>
         * <p>This value will be empty if there is no existing association.</p>
         */
        @NameInMap("AssociationSuccessTime")
        public String associationSuccessTime;

        /**
         * <p>Distribution Customer\"s CID</p>
         */
        @NameInMap("Cid")
        public Long cid;

        /**
         * <p>The time of email been sent out.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The parent organization ID.</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>Invitation Status:</p>
         * <p>* 0 No visit on registration URL</p>
         * <p>* 1 Successful Registration</p>
         * <p>* 2 Unsuccessful Registration</p>
         * <p>* 3 Registration URL have been visited, but no submitted sheet/ticket.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Account Type:</p>
         * <p>- 1 Agency\"s End User</p>
         * <p>- 2 Reseller\"s End User</p>
         * <p>- 5 T2 Reseller Partner</p>
         */
        @NameInMap("SubAccountType")
        public String subAccountType;

        /**
         * <p>Distribution Customer\"s UID</p>
         */
        @NameInMap("Uid")
        public Long uid;

        public static GetInviteStatusResponseBodyDataInviteStatusInviteStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetInviteStatusResponseBodyDataInviteStatusInviteStatusList self = new GetInviteStatusResponseBodyDataInviteStatusInviteStatusList();
            return TeaModel.build(map, self);
        }

        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList setAssociationSuccessTime(String associationSuccessTime) {
            this.associationSuccessTime = associationSuccessTime;
            return this;
        }
        public String getAssociationSuccessTime() {
            return this.associationSuccessTime;
        }

        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList setSubAccountType(String subAccountType) {
            this.subAccountType = subAccountType;
            return this;
        }
        public String getSubAccountType() {
            return this.subAccountType;
        }

        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class GetInviteStatusResponseBodyDataInviteStatus extends TeaModel {
        /**
         * <p>Result Code. Value Range:</p>
         * <p>*   200 OK</p>
         * <p>*   1109 system error</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>List of Invitation Status result</p>
         */
        @NameInMap("InviteStatusList")
        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList inviteStatusList;

        /**
         * <p>The message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static GetInviteStatusResponseBodyDataInviteStatus build(java.util.Map<String, ?> map) throws Exception {
            GetInviteStatusResponseBodyDataInviteStatus self = new GetInviteStatusResponseBodyDataInviteStatus();
            return TeaModel.build(map, self);
        }

        public GetInviteStatusResponseBodyDataInviteStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetInviteStatusResponseBodyDataInviteStatus setInviteStatusList(GetInviteStatusResponseBodyDataInviteStatusInviteStatusList inviteStatusList) {
            this.inviteStatusList = inviteStatusList;
            return this;
        }
        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList getInviteStatusList() {
            return this.inviteStatusList;
        }

        public GetInviteStatusResponseBodyDataInviteStatus setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetInviteStatusResponseBodyDataInviteStatus setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class GetInviteStatusResponseBodyData extends TeaModel {
        @NameInMap("InviteStatus")
        public java.util.List<GetInviteStatusResponseBodyDataInviteStatus> inviteStatus;

        public static GetInviteStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInviteStatusResponseBodyData self = new GetInviteStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInviteStatusResponseBodyData setInviteStatus(java.util.List<GetInviteStatusResponseBodyDataInviteStatus> inviteStatus) {
            this.inviteStatus = inviteStatus;
            return this;
        }
        public java.util.List<GetInviteStatusResponseBodyDataInviteStatus> getInviteStatus() {
            return this.inviteStatus;
        }

    }

}
