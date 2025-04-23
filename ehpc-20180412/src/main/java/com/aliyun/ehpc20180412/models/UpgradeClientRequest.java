// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpgradeClientRequest extends TeaModel {
    /**
     * <p>The version to which you want to update ehpcutil. By default, ehpcutil is updated to the latest version. You can call the <a href="https://help.aliyun.com/document_detail/87223.html">ListCurrentClientVersion</a> to query the latest ehpcutil version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
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
