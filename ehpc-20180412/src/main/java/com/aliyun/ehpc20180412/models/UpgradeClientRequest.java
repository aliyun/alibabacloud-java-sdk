// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpgradeClientRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClientVersion")
    public String clientVersion;

    public static UpgradeClientRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClientRequest self = new UpgradeClientRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeClientRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpgradeClientRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

}
