// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifySmbAclRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow anonymous access. Valid values:</p>
     * <br>
     * <p>*   true: The file system allows anonymous access.</p>
     * <p>*   false (default): The file system denies anonymous access.</p>
     */
    @NameInMap("EnableAnonymousAccess")
    public Boolean enableAnonymousAccess;

    /**
     * <p>Specifies whether to enable encryption in transit. Valid values:</p>
     * <br>
     * <p>*   true: enables encryption in transit.</p>
     * <p>*   false (default): disables encryption in transit.</p>
     */
    @NameInMap("EncryptData")
    public Boolean encryptData;

    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The home directory of each user. Each user-specific home directory must meet the following requirements:</p>
     * <br>
     * <p>*   Each segment starts with a forward slash (/) or a backward slash (\\).</p>
     * <p>*   Each segment does not contain the following special characters: `<>":|?*`.</p>
     * <p>*   Each segment is 0 to 255 characters in length.</p>
     * <p>*   The total length is 0 to 32,767 characters.</p>
     * <br>
     * <p>For example, if you create a user named A and the home directory is `/home`, the file system automatically creates a directory named `/home/A` when User A logs on to the file system. If the `/home/A` directory already exists, the file system does not create the directory.</p>
     * <br>
     * <p>> User A must have the permissions to create folders in the \home directory. Otherwise, the file system cannot create the `/home/A` directory when User A logs on to the file system.</p>
     */
    @NameInMap("HomeDirPath")
    public String homeDirPath;

    /**
     * <p>The string that is generated after the system encodes the keytab file by using Base64.</p>
     */
    @NameInMap("Keytab")
    public String keytab;

    /**
     * <p>The string that is generated after the system encodes the keytab file by using MD5.</p>
     */
    @NameInMap("KeytabMd5")
    public String keytabMd5;

    /**
     * <p>Specifies whether to deny access from non-encrypted clients. Valid values:</p>
     * <br>
     * <p>*   true: The file system denies access from non-encrypted clients.</p>
     * <p>*   false (default): The file system allows access from non-encrypted clients.</p>
     */
    @NameInMap("RejectUnencryptedAccess")
    public Boolean rejectUnencryptedAccess;

    /**
     * <p>The ID of a super admin. The ID must meet the following requirements:</p>
     * <br>
     * <p>*   The ID starts with `S` and does not contain letters except S.</p>
     * <p>*   The ID contains at least three hyphens (-) as delimiters.</p>
     * <br>
     * <p>Examples: `S-1-5-22` and `S-1-5-22-23`.</p>
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
