// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifySmbAclRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow anonymous access. </p>
     * <ul>
     * <li><p>true: Anonymous access is allowed.</p>
     * </li>
     * <li><p>false (default): Anonymous access is not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAnonymousAccess")
    public Boolean enableAnonymousAccess;

    /**
     * <p>Specifies whether to enable encryption in transit.</p>
     * <ul>
     * <li><p>true: Encryption in transit is enabled.</p>
     * </li>
     * <li><p>false (default): Encryption in transit is not enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EncryptData")
    public Boolean encryptData;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The home folder path for each user. The file path format is as follows:</p>
     * <ul>
     * <li><p>Use a forward slash (/) or backslash (\) as the separator.</p>
     * </li>
     * <li><p>Each segment cannot contain <code>&lt;&gt;&quot;:|?*</code>.</p>
     * </li>
     * <li><p>The length of each segment ranges from 0 to 255.</p>
     * </li>
     * <li><p>The total length ranges from 0 to 32767.</p>
     * </li>
     * </ul>
     * <p>For example, if the user folder is <code>/home</code>, the file system performs automatic creation of the <code>/home/A</code> folder when user A performs logon. If <code>/home/A</code> already exists, this step is skipped.</p>
     * <blockquote>
     * <p>User A must have the permission to create folders. Otherwise, the <code>/home/A</code> folder cannot be created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home</p>
     */
    @NameInMap("HomeDirPath")
    public String homeDirPath;

    /**
     * <p>The Base64-encoded string of the keytab file content.</p>
     * 
     * <strong>example:</strong>
     * <p>BQIAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAQAIqIx6v7p11oUAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAwAIqIx6v7p11oUAAABPAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAFwAQnQZWB3RAPHU7PMIJyBWePAAAAF8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQASACAGJ7F0s+bcBjf6jD5HlvlRLmPSOW+qDZe0Qk0lQcf8WwAAAE8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQARABDdFmanrSIatnDDh****</p>
     */
    @NameInMap("Keytab")
    public String keytab;

    /**
     * <p>The MD5-encrypted string of the keytab file content.</p>
     * 
     * <strong>example:</strong>
     * <p>E3CCF7E2416DF04FA958AA4513EA****</p>
     */
    @NameInMap("KeytabMd5")
    public String keytabMd5;

    /**
     * <p>Specifies whether to reject unencrypted clients.</p>
     * <ul>
     * <li><p>true: Unencrypted clients are rejected.</p>
     * </li>
     * <li><p>false (default): Unencrypted clients are not rejected.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RejectUnencryptedAccess")
    public Boolean rejectUnencryptedAccess;

    /**
     * <p>The ID of the superuser. The ID must follow these rules:</p>
     * <ul>
     * <li><p>Must start with <code>S</code>, and no other letters are allowed after the initial S.</p>
     * </li>
     * <li><p>Must contain at least three hyphens (-) as separators.</p>
     * </li>
     * </ul>
     * <p>For example, <code>S-1-5-22</code> or <code>S-1-5-22-23</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>S-1-5-22</p>
     */
    @NameInMap("SuperAdminSid")
    public String superAdminSid;

    public static ModifySmbAclRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySmbAclRequest self = new ModifySmbAclRequest();
        return TeaModel.build(map, self);
    }

    public ModifySmbAclRequest setEnableAnonymousAccess(Boolean enableAnonymousAccess) {
        this.enableAnonymousAccess = enableAnonymousAccess;
        return this;
    }
    public Boolean getEnableAnonymousAccess() {
        return this.enableAnonymousAccess;
    }

    public ModifySmbAclRequest setEncryptData(Boolean encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public Boolean getEncryptData() {
        return this.encryptData;
    }

    public ModifySmbAclRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifySmbAclRequest setHomeDirPath(String homeDirPath) {
        this.homeDirPath = homeDirPath;
        return this;
    }
    public String getHomeDirPath() {
        return this.homeDirPath;
    }

    public ModifySmbAclRequest setKeytab(String keytab) {
        this.keytab = keytab;
        return this;
    }
    public String getKeytab() {
        return this.keytab;
    }

    public ModifySmbAclRequest setKeytabMd5(String keytabMd5) {
        this.keytabMd5 = keytabMd5;
        return this;
    }
    public String getKeytabMd5() {
        return this.keytabMd5;
    }

    public ModifySmbAclRequest setRejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
        this.rejectUnencryptedAccess = rejectUnencryptedAccess;
        return this;
    }
    public Boolean getRejectUnencryptedAccess() {
        return this.rejectUnencryptedAccess;
    }

    public ModifySmbAclRequest setSuperAdminSid(String superAdminSid) {
        this.superAdminSid = superAdminSid;
        return this;
    }
    public String getSuperAdminSid() {
        return this.superAdminSid;
    }

}
