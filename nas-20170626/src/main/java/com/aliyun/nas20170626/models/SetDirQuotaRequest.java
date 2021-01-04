// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class SetDirQuotaRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("Path")
    public String path;

    @NameInMap("QuotaType")
    public String quotaType;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("SizeLimit")
    public Long sizeLimit;

    @NameInMap("FileCountLimit")
    public Long fileCountLimit;

    public static SetDirQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDirQuotaRequest self = new SetDirQuotaRequest();
        return TeaModel.build(map, self);
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

    public SetDirQuotaRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public SetDirQuotaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SetDirQuotaRequest setSizeLimit(Long sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }
    public Long getSizeLimit() {
        return this.sizeLimit;
    }

    public SetDirQuotaRequest setFileCountLimit(Long fileCountLimit) {
        this.fileCountLimit = fileCountLimit;
        return this;
    }
    public Long getFileCountLimit() {
        return this.fileCountLimit;
    }

}
