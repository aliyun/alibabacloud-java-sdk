// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteMFADeviceForUserRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the MFA device.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/333531.html">ListMFADevicesForUser</a> operation to query the IDs of MFA devices.</p>
     * 
     * <strong>example:</strong>
     * <p>mfa-00ujhet8pycljj7j****</p>
     */
    @NameInMap("MFADeviceId")
    public String MFADeviceId;

    /**
     * <p>The ID of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>u-00q8wbq42wiltcrk****</p>
     */
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
