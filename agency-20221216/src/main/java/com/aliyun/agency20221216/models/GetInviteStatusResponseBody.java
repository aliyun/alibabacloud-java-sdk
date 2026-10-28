// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetInviteStatusResponseBody extends TeaModel {
    /**
     * <p>The status code. Error code: 3057: InviteId is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInviteStatusResponseBodyData data;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud uses this ID for error tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values: true and false. This parameter does not indicate whether subsequent business operations are successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        @NameInMap("AssociationSuccessTime")
        public String associationSuccessTime;

        @NameInMap("Cid")
        public Long cid;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubAccountType")
        public String subAccountType;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("InviteStatusList")
        public GetInviteStatusResponseBodyDataInviteStatusInviteStatusList inviteStatusList;

        @NameInMap("Message")
        public String message;

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
