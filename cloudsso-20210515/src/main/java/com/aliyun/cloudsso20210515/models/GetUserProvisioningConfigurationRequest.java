// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetUserProvisioningConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningConfigurationRequest self = new GetUserProvisioningConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
