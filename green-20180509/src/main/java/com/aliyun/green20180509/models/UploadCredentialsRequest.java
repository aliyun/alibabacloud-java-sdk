// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class UploadCredentialsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientInfo")
    public String clientInfo;

    public static UploadCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCredentialsRequest self = new UploadCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public UploadCredentialsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadCredentialsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
