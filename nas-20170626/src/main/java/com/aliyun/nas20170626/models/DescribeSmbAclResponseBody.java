// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeSmbAclResponseBody extends TeaModel {
    /**
     * <p>The ACL information.</p>
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
         * <p>Indicates whether anonymous access is allowed. Valid values:</p>
         * <ul>
         * <li><p>true: Anonymous access is allowed.</p>
         * </li>
         * <li><p>false: Anonymous access is not allowed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAnonymousAccess")
        public Boolean enableAnonymousAccess;

        /**
         * <p>Indicates whether the SMB AD ACL feature is enabled.</p>
         * <ul>
         * <li><p>true: The SMB AD ACL feature is enabled.</p>
         * </li>
         * <li><p>false: The SMB AD ACL feature is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether encryption in transit is enabled.</p>
         * <ul>
         * <li><p>true: Encryption in transit is enabled.</p>
         * </li>
         * <li><p>false: Encryption in transit is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EncryptData")
        public Boolean encryptData;

        /**
         * <p>The home directory path for each user.</p>
         * 
         * <strong>example:</strong>
         * <p>/home</p>
         */
        @NameInMap("HomeDirPath")
        public String homeDirPath;

        /**
         * <p>Indicates whether unencrypted clients are rejected.</p>
         * <ul>
         * <li><p>true: Unencrypted clients are rejected.</p>
         * </li>
         * <li><p>false: Unencrypted clients are not rejected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RejectUnencryptedAccess")
        public Boolean rejectUnencryptedAccess;

        /**
         * <p>The ID of the superuser.</p>
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
