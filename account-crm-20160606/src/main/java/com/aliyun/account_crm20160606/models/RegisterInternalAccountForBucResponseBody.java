// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class RegisterInternalAccountForBucResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RegisterInternalAccountForBucResponseBodyData data;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static RegisterInternalAccountForBucResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterInternalAccountForBucResponseBody self = new RegisterInternalAccountForBucResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterInternalAccountForBucResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterInternalAccountForBucResponseBody setData(RegisterInternalAccountForBucResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RegisterInternalAccountForBucResponseBodyData getData() {
        return this.data;
    }

    public RegisterInternalAccountForBucResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public RegisterInternalAccountForBucResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterInternalAccountForBucResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public RegisterInternalAccountForBucResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RegisterInternalAccountForBucResponseBodyData extends TeaModel {
        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AccountStructure")
        public String accountStructure;

        @NameInMap("ExtendInfo")
        public String extendInfo;

        @NameInMap("HavanaId")
        public String havanaId;

        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        @NameInMap("OwnerBid")
        public String ownerBid;

        @NameInMap("ParentPk")
        public String parentPk;

        @NameInMap("PartnerPk")
        public String partnerPk;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("Site")
        public String site;

        public static RegisterInternalAccountForBucResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RegisterInternalAccountForBucResponseBodyData self = new RegisterInternalAccountForBucResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RegisterInternalAccountForBucResponseBodyData setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public RegisterInternalAccountForBucResponseBodyData setAccountStructure(String accountStructure) {
            this.accountStructure = accountStructure;
            return this;
        }
        public String getAccountStructure() {
            return this.accountStructure;
        }

        public RegisterInternalAccountForBucResponseBodyData setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public RegisterInternalAccountForBucResponseBodyData setHavanaId(String havanaId) {
            this.havanaId = havanaId;
            return this;
        }
        public String getHavanaId() {
            return this.havanaId;
        }

        public RegisterInternalAccountForBucResponseBodyData setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public RegisterInternalAccountForBucResponseBodyData setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public RegisterInternalAccountForBucResponseBodyData setParentPk(String parentPk) {
            this.parentPk = parentPk;
            return this;
        }
        public String getParentPk() {
            return this.parentPk;
        }

        public RegisterInternalAccountForBucResponseBodyData setPartnerPk(String partnerPk) {
            this.partnerPk = partnerPk;
            return this;
        }
        public String getPartnerPk() {
            return this.partnerPk;
        }

        public RegisterInternalAccountForBucResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public RegisterInternalAccountForBucResponseBodyData setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

    }

}
