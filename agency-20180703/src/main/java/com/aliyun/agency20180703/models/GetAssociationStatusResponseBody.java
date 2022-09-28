// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetAssociationStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAssociationStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static GetAssociationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssociationStatusResponseBody self = new GetAssociationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssociationStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAssociationStatusResponseBody setData(GetAssociationStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAssociationStatusResponseBodyData getData() {
        return this.data;
    }

    public GetAssociationStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAssociationStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAssociationStatusResponseBodyDataResultInviteStatusList extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubAccountType")
        public String subAccountType;

        @NameInMap("ValidTime")
        public String validTime;

        public static GetAssociationStatusResponseBodyDataResultInviteStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetAssociationStatusResponseBodyDataResultInviteStatusList self = new GetAssociationStatusResponseBodyDataResultInviteStatusList();
            return TeaModel.build(map, self);
        }

        public GetAssociationStatusResponseBodyDataResultInviteStatusList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAssociationStatusResponseBodyDataResultInviteStatusList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetAssociationStatusResponseBodyDataResultInviteStatusList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAssociationStatusResponseBodyDataResultInviteStatusList setSubAccountType(String subAccountType) {
            this.subAccountType = subAccountType;
            return this;
        }
        public String getSubAccountType() {
            return this.subAccountType;
        }

        public GetAssociationStatusResponseBodyDataResultInviteStatusList setValidTime(String validTime) {
            this.validTime = validTime;
            return this;
        }
        public String getValidTime() {
            return this.validTime;
        }

    }

    public static class GetAssociationStatusResponseBodyDataResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("InviteStatusList")
        public GetAssociationStatusResponseBodyDataResultInviteStatusList inviteStatusList;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static GetAssociationStatusResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetAssociationStatusResponseBodyDataResult self = new GetAssociationStatusResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetAssociationStatusResponseBodyDataResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAssociationStatusResponseBodyDataResult setInviteStatusList(GetAssociationStatusResponseBodyDataResultInviteStatusList inviteStatusList) {
            this.inviteStatusList = inviteStatusList;
            return this;
        }
        public GetAssociationStatusResponseBodyDataResultInviteStatusList getInviteStatusList() {
            return this.inviteStatusList;
        }

        public GetAssociationStatusResponseBodyDataResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAssociationStatusResponseBodyDataResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class GetAssociationStatusResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public java.util.List<GetAssociationStatusResponseBodyDataResult> result;

        public static GetAssociationStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAssociationStatusResponseBodyData self = new GetAssociationStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAssociationStatusResponseBodyData setResult(java.util.List<GetAssociationStatusResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetAssociationStatusResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
