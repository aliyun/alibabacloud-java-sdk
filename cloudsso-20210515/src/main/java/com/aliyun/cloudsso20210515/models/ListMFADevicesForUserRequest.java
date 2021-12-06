// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListMFADevicesForUserRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("UserId")
    public String userId;

    public static ListMFADevicesForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMFADevicesForUserRequest self = new ListMFADevicesForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListMFADevicesForUserRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListMFADevicesForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
