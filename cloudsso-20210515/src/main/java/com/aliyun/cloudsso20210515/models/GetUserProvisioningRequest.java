// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the RAM user provisioning.</p>
     * 
     * <strong>example:</strong>
     * <p>up-002axzhapcbz6e63****</p>
     */
    @NameInMap("UserProvisioningId")
    public String userProvisioningId;

    public static GetUserProvisioningRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningRequest self = new GetUserProvisioningRequest();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetUserProvisioningRequest setUserProvisioningId(String userProvisioningId) {
        this.userProvisioningId = userProvisioningId;
        return this;
    }
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

}
