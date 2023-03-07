// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpgradeClientRequest extends TeaModel {
    /**
     * <p>The version to which the client will be upgraded. By default, the client is upgraded to the latest version. You can call the [ListCurrentClientVersion](~~87223~~) operation to query the latest version number of the Elastic High Performance Computing (E-HPC) client.</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The ID of the cluster.</p>
     */
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
