// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeSmbAclResponseBody extends TeaModel {
    /**
     * <p>The information about the ACL feature.</p>
     */
    @NameInMap("Acl")
    public DescribeSmbAclResponseBodyAcl acl;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSmbAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmbAclResponseBody self = new DescribeSmbAclResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmbAclResponseBody setAcl(DescribeSmbAclResponseBodyAcl acl) {
        this.acl = acl;
        return this;
    }
    public DescribeSmbAclResponseBodyAcl getAcl() {
        return this.acl;
    }

    public DescribeSmbAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSmbAclResponseBodyAcl extends TeaModel {
        /**
         * <p>Indicates whether the file system allows anonymous access. Valid values:</p>
         * <br>
         * <p>*   true: The file system allows anonymous access.</p>
         * <p>*   false: The file system does not allow anonymous access.</p>
         */
        @NameInMap("EnableAnonymousAccess")
        public Boolean enableAnonymousAccess;

        /**
         * <p>Indicates whether the ACL feature is enabled. Valid values:</p>
         * <br>
         * <p>*   true: The ACL feature is enabled.</p>
         * <p>*   false: The ACL feature is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether encryption in transit is enabled. Valid values:</p>
         * <br>
         * <p>*   true: Encryption in transit is enabled.</p>
         * <p>*   false: Encryption in transit is disabled.</p>
         */
        @NameInMap("EncryptData")
        public Boolean encryptData;

        /**
         * <p>The home directory of each user.</p>
         */
        @NameInMap("HomeDirPath")
        public String homeDirPath;

        /**
         * <p>Indicates whether the file system denies access from non-encrypted clients. Valid values:</p>
         * <br>
         * <p>*   true: The file system denies access from non-encrypted clients.</p>
         * <p>*   false: The file system allows access from non-encrypted clients.</p>
         */
        @NameInMap("RejectUnencryptedAccess")
        public Boolean rejectUnencryptedAccess;

        /**
         * <p>The ID of a super admin.</p>
         */
        @NameInMap("SuperAdminSid")
        public String superAdminSid;

        public static DescribeSmbAclResponseBodyAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmbAclResponseBodyAcl self = new DescribeSmbAclResponseBodyAcl();
            return TeaModel.build(map, self);
        }

        public DescribeSmbAclResponseBodyAcl setEnableAnonymousAccess(Boolean enableAnonymousAccess) {
            this.enableAnonymousAccess = enableAnonymousAccess;
            return this;
        }
        public Boolean getEnableAnonymousAccess() {
            return this.enableAnonymousAccess;
        }

        public DescribeSmbAclResponseBodyAcl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeSmbAclResponseBodyAcl setEncryptData(Boolean encryptData) {
            this.encryptData = encryptData;
            return this;
        }
        public Boolean getEncryptData() {
            return this.encryptData;
        }

        public DescribeSmbAclResponseBodyAcl setHomeDirPath(String homeDirPath) {
            this.homeDirPath = homeDirPath;
            return this;
        }
        public String getHomeDirPath() {
            return this.homeDirPath;
        }

        public DescribeSmbAclResponseBodyAcl setRejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
            this.rejectUnencryptedAccess = rejectUnencryptedAccess;
            return this;
        }
        public Boolean getRejectUnencryptedAccess() {
            return this.rejectUnencryptedAccess;
        }

        public DescribeSmbAclResponseBodyAcl setSuperAdminSid(String superAdminSid) {
            this.superAdminSid = superAdminSid;
            return this;
        }
        public String getSuperAdminSid() {
            return this.superAdminSid;
        }

    }

}
