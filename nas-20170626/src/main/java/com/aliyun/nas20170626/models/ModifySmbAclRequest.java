// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifySmbAclRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow anonymous access. Valid values:</p>
     * <ul>
     * <li>true: The file system allows anonymous access.</li>
     * <li>false (default): The file system denies anonymous access.</li>
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
     * <p>Specifies whether to enable encryption in transit. Valid values:</p>
     * <ul>
     * <li>true: enables encryption in transit.</li>
     * <li>false (default): disables encryption in transit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EncryptData")
    public Boolean encryptData;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The home directory of each user. Each user-specific home directory must meet the following requirements:</p>
     * <ul>
     * <li>Each segment starts with a forward slash (/) or a backward slash (\\).</li>
     * <li>Each segment does not contain the following special characters: <code>&lt;&gt;&quot;:|?*</code>.</li>
     * <li>Each segment is 0 to 255 characters in length.</li>
     * <li>The total length is 0 to 32,767 characters.</li>
     * </ul>
     * <p>For example, if you create a user named A and the home directory is <code>/home</code>, the file system automatically creates a directory named <code>/home/A</code> when User A logs on to the file system. If the <code>/home/A</code> directory already exists, the file system does not create the directory.</p>
     * <blockquote>
     * <p>User A must have the permissions to create folders in the \home directory. Otherwise, the file system cannot create the <code>/home/A</code> directory when User A logs on to the file system.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home</p>
     */
    @NameInMap("HomeDirPath")
    public String homeDirPath;

    /**
     * <p>The string that is generated after the system encodes the keytab file by using Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>BQIAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAQAIqIx6v7p11oUAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAwAIqIx6v7p11oUAAABPAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAFwAQnQZWB3RAPHU7PMIJyBWePAAAAF8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQASACAGJ7F0s+bcBjf6jD5HlvlRLmPSOW+qDZe0Qk0lQcf8WwAAAE8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQARABDdFmanrSIatnDDh****</p>
     */
    @NameInMap("Keytab")
    public String keytab;

    /**
     * <p>The string that is generated after the system encodes the keytab file by using MD5.</p>
     * 
     * <strong>example:</strong>
     * <p>E3CCF7E2416DF04FA958AA4513EA****</p>
     */
    @NameInMap("KeytabMd5")
    public String keytabMd5;

    /**
     * <p>Specifies whether to deny access from non-encrypted clients. Valid values:</p>
     * <ul>
     * <li>true: The file system denies access from non-encrypted clients.</li>
     * <li>false (default): The file system allows access from non-encrypted clients.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RejectUnencryptedAccess")
    public Boolean rejectUnencryptedAccess;

    /**
     * <p>The ID of a super admin. The ID must meet the following requirements:</p>
     * <ul>
     * <li>The ID starts with <code>S</code> and does not contain letters except S.</li>
     * <li>The ID contains at least three hyphens (-) as delimiters.</li>
     * </ul>
     * <p>Examples: <code>S-1-5-22</code> and <code>S-1-5-22-23</code>.</p>
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
