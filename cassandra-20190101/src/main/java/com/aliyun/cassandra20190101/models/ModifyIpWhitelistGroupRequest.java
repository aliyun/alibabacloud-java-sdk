// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyIpWhitelistGroupRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("IpList")
    public String ipList;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IpVersion")
    public Integer ipVersion;

    public static ModifyIpWhitelistGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpWhitelistGroupRequest self = new ModifyIpWhitelistGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpWhitelistGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyIpWhitelistGroupRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public ModifyIpWhitelistGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyIpWhitelistGroupRequest setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public Integer getIpVersion() {
        return this.ipVersion;
    }

}
