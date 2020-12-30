// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyIpWhitelistRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("IpList")
    public String ipList;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IpVersion")
    public String ipVersion;

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

    public ModifyIpWhitelistRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyIpWhitelistRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

}
