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
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
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
         * <ul>
         * <li>true: The file system allows anonymous access.</li>
         * <li>false: The file system does not allow anonymous access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAnonymousAccess")
        public Boolean enableAnonymousAccess;

        /**
         * <p>Indicates whether the ACL feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: The ACL feature is enabled.</li>
         * <li>false: The ACL feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether encryption in transit is enabled. Valid values:</p>
         * <ul>
         * <li>true: Encryption in transit is enabled.</li>
         * <li>false: Encryption in transit is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EncryptData")
        public Boolean encryptData;

        /**
         * <p>The home directory of each user.</p>
         * 
         * <strong>example:</strong>
         * <p>/home</p>
         */
        @NameInMap("HomeDirPath")
        public String homeDirPath;

        /**
         * <p>Indicates whether the file system denies access from non-encrypted clients. Valid values:</p>
         * <ul>
         * <li>true: The file system denies access from non-encrypted clients.</li>
         * <li>false: The file system allows access from non-encrypted clients.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RejectUnencryptedAccess")
        public Boolean rejectUnencryptedAccess;

        /**
         * <p>The ID of a super admin.</p>
         * 
         * <strong>example:</strong>
         * <p>S-1-0-0</p>
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
