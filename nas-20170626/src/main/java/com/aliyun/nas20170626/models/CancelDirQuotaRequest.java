// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDirQuotaRequest extends TeaModel {
    @NameInMap("FileSystemId")
    @Validation(required = true)
    public String fileSystemId;

    @NameInMap("Path")
    @Validation(required = true)
    public String path;

    @NameInMap("UserType")
    @Validation(required = true)
    public String userType;

    @NameInMap("UserId")
    public String userId;

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

    public CancelDirQuotaRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public CancelDirQuotaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
