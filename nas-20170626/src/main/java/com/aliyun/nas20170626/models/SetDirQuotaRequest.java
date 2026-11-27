// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class SetDirQuotaRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a precheck on the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The maximum number of files in the directory.</p>
     * <p>This includes files, directories, and special files.</p>
     * <p>When QuotaType is set to Enforcement, you must specify at least one of SizeLimit and FileCountLimit.</p>
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
     * <li>Quotas can only be set for directories that have been created in a NAS file system. The quota path is the absolute path of the directory in the NAS file system, not a local path on a compute node (such as an ECS instance or container).</li>
     * <li>Directories whose path names contain Chinese characters are not supported.</li>
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
     * <p>The quota type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Accounting: accounting quota, which only tracks usage.</li>
     * <li>Enforcement: enforcement quota. If usage exceeds the limit, operations such as creating files or directories and appending data will fail.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Accounting</p>
     */
    @NameInMap("QuotaType")
    public String quotaType;

    /**
     * <p>The maximum total size of files in the directory.</p>
     * <p>Unit: GiB</p>
     * <p>When QuotaType is set to Enforcement, you must specify at least one of SizeLimit and FileCountLimit.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("SizeLimit")
    public Long sizeLimit;

    /**
     * <p>The Uid or Gid to be restricted.</p>
     * <p>Required and meaningful only when UserType is Uid or Gid.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>To restrict the user with Uid=500, set UserType to Uid and UserId to 500.</li>
     * <li>To restrict the user group with Gid=100, set UserType to Gid and UserId to 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The user type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Uid: user ID</li>
     * <li>Gid: group ID of the user</li>
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

    public SetDirQuotaRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
