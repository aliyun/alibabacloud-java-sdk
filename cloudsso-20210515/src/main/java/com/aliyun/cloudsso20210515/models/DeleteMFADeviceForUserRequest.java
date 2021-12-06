// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteMFADeviceForUserRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("MFADeviceId")
    public String MFADeviceId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteMFADeviceForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMFADeviceForUserRequest self = new DeleteMFADeviceForUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMFADeviceForUserRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DeleteMFADeviceForUserRequest setMFADeviceId(String MFADeviceId) {
        this.MFADeviceId = MFADeviceId;
        return this;
    }
    public String getMFADeviceId() {
        return this.MFADeviceId;
    }

    public DeleteMFADeviceForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
