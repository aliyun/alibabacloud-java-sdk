// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyIpWhitelistRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("IpList")
    public String ipList;

    public static ModifyIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpWhitelistRequest self = new ModifyIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpWhitelistRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyIpWhitelistRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

}
