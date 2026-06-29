// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDirQuotaRequest extends TeaModel {
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
     * <p>The absolute path of the directory in the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/sub1</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The UID or GID to cancel.</p>
     * <p>This parameter is required and valid only when UserType is set to Uid or Gid.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>To cancel the quota for the user whose UID is 500, set UserType to Uid and UserId to 500.</li>
     * <li>To cancel the quota for the user group whose GID is 100, set UserType to Gid and UserId to 100.</li>
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
     * <li>Gid: user group ID</li>
     * <li>AllUsers: all users.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Uid</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static CancelDirQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDirQuotaRequest self = new CancelDirQuotaRequest();
        return TeaModel.build(map, self);
    }

    public CancelDirQuotaRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CancelDirQuotaRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CancelDirQuotaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CancelDirQuotaRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
