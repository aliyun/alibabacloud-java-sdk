// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class UpgradeClientRequest extends TeaModel {
    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("ClusterId")
    public String clusterId;

    public static UpgradeClientRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClientRequest self = new UpgradeClientRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeClientRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public UpgradeClientRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
