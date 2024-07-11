// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyIpWhitelistRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1uoihlf82e8****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_01</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <strong>example:</strong>
     * <p>42.120.XX.XX</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
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

    public ModifyIpWhitelistRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyIpWhitelistRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public ModifyIpWhitelistRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

}
