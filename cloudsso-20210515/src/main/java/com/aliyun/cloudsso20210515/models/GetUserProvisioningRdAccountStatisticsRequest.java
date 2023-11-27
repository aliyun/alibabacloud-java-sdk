// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningRdAccountStatisticsRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("RdMemberId")
    public String rdMemberId;

    public static GetUserProvisioningRdAccountStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningRdAccountStatisticsRequest self = new GetUserProvisioningRdAccountStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningRdAccountStatisticsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetUserProvisioningRdAccountStatisticsRequest setRdMemberId(String rdMemberId) {
        this.rdMemberId = rdMemberId;
        return this;
    }
    public String getRdMemberId() {
        return this.rdMemberId;
    }

}
