// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningStatisticsRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("UserProvisioningId")
    public String userProvisioningId;

    public static GetUserProvisioningStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningStatisticsRequest self = new GetUserProvisioningStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningStatisticsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetUserProvisioningStatisticsRequest setUserProvisioningId(String userProvisioningId) {
        this.userProvisioningId = userProvisioningId;
        return this;
    }
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

}
