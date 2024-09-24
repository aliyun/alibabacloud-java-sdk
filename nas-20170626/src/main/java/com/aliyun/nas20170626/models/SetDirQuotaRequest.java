// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class SetDirQuotaRequest extends TeaModel {
    /**
     * <p>The number of files that a user can create in the directory.</p>
     * <p>This number includes the number of files, subdirectories, and special files.</p>
     * <p>If you set the QuotaType parameter to Enforcement, you must specify at least one of the SizeLimit and FileCountLimit parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("FileCountLimit")
    public Long fileCountLimit;

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
     * <p>The absolute path of the directory in the file system.</p>
     * <blockquote>
     * <ul>
     * <li>You can set quotas only for the directories that have been created in a NAS file system. The path of the directory that you specify for a quota is the absolute path of the directory in the NAS file system, but not the local path of the compute node, such as an Elastic Compute Service (ECS) instance or a container.</li>
     * <li>Directories whose names contain Chinese characters are not supported.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/sub1</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The type of the quota.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Accounting: a statistical quota. If you set this parameter to Accounting, NAS calculates only the storage usage of the directory.</li>
     * <li>Enforcement: a restricted quota. If you set this parameter to Enforcement and the storage usage exceeds the quota, you can no longer create files or subdirectories for the directory, or write data to the directory.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Accounting</p>
     */
    @NameInMap("QuotaType")
    public String quotaType;

    /**
     * <p>The size of files that a user can create in the directory.</p>
     * <p>Unit: GiB.</p>
     * <p>If you set the QuotaType parameter to Enforcement, you must specify at least one of the SizeLimit and FileCountLimit parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("SizeLimit")
    public Long sizeLimit;

    /**
     * <p>The UID or GID of the user for whom you want to set a directory quota.</p>
     * <p>This parameter is required and valid only if the UserType parameter is set to Uid or Gid.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>If you want to set a directory quota for a user whose UID is 500, set the UserType parameter to Uid and set the UserId parameter to 500.</li>
     * <li>If you want to set a directory quota for a user group whose GID is 100, set the UserType parameter to Gid and set the UserId parameter to 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The type of the user.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Uid: user ID</li>
     * <li>Gid: user group ID</li>
     * <li>AllUsers: all users</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Uid</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static SetDirQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDirQuotaRequest self = new SetDirQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetDirQuotaRequest setFileCountLimit(Long fileCountLimit) {
        this.fileCountLimit = fileCountLimit;
        return this;
    }
    public Long getFileCountLimit() {
        return this.fileCountLimit;
    }

    public SetDirQuotaRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public SetDirQuotaRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public SetDirQuotaRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public SetDirQuotaRequest setSizeLimit(Long sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }
    public Long getSizeLimit() {
        return this.sizeLimit;
    }

    public SetDirQuotaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SetDirQuotaRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
