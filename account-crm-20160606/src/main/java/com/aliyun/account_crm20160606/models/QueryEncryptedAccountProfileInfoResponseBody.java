// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryEncryptedAccountProfileInfoResponseBody extends TeaModel {
    @NameInMap("EncryptedProfileInfo")
    public QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo encryptedProfileInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryEncryptedAccountProfileInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEncryptedAccountProfileInfoResponseBody self = new QueryEncryptedAccountProfileInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEncryptedAccountProfileInfoResponseBody setEncryptedProfileInfo(QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo encryptedProfileInfo) {
        this.encryptedProfileInfo = encryptedProfileInfo;
        return this;
    }
    public QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo getEncryptedProfileInfo() {
        return this.encryptedProfileInfo;
    }

    public QueryEncryptedAccountProfileInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo extends TeaModel {
        @NameInMap("EncryptedAliyunID")
        public String encryptedAliyunID;

        @NameInMap("EncryptedEmail")
        public String encryptedEmail;

        @NameInMap("EncryptedMobile")
        public String encryptedMobile;

        @NameInMap("EncryptedSecurityMobile")
        public String encryptedSecurityMobile;

        @NameInMap("IsAliyunIdAnEmail")
        public Boolean isAliyunIdAnEmail;

        @NameInMap("pk")
        public String pk;

        public static QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo self = new QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo();
            return TeaModel.build(map, self);
        }

        public QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo setEncryptedAliyunID(String encryptedAliyunID) {
            this.encryptedAliyunID = encryptedAliyunID;
            return this;
        }
        public String getEncryptedAliyunID() {
            return this.encryptedAliyunID;
        }

        public QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo setEncryptedEmail(String encryptedEmail) {
            this.encryptedEmail = encryptedEmail;
            return this;
        }
        public String getEncryptedEmail() {
            return this.encryptedEmail;
        }

        public QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo setEncryptedMobile(String encryptedMobile) {
            this.encryptedMobile = encryptedMobile;
            return this;
        }
        public String getEncryptedMobile() {
            return this.encryptedMobile;
        }

        public QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo setEncryptedSecurityMobile(String encryptedSecurityMobile) {
            this.encryptedSecurityMobile = encryptedSecurityMobile;
            return this;
        }
        public String getEncryptedSecurityMobile() {
            return this.encryptedSecurityMobile;
        }

        public QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo setIsAliyunIdAnEmail(Boolean isAliyunIdAnEmail) {
            this.isAliyunIdAnEmail = isAliyunIdAnEmail;
            return this;
        }
        public Boolean getIsAliyunIdAnEmail() {
            return this.isAliyunIdAnEmail;
        }

        public QueryEncryptedAccountProfileInfoResponseBodyEncryptedProfileInfo setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
