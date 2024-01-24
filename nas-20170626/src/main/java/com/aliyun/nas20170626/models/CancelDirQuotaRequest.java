// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDirQuotaRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The absolute path of a directory.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The UID or GID of a user for whom you want to cancel the directory quota.</p>
     * <br>
     * <p>This parameter is required and valid only if the UserType parameter is set to Uid or Gid.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   If you want to cancel a quota for a user whose UID is 500, set the UserType parameter to Uid and set the UserId parameter to 500.</p>
     * <p>*   If you want to cancel a quota for a group whose GID is 100, set the UserType parameter to Gid and set the UserId parameter to 100.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The type of the user.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Uid: user ID</p>
     * <p>*   Gid: user group ID</p>
     * <p>*   AllUsers: all users</p>
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
