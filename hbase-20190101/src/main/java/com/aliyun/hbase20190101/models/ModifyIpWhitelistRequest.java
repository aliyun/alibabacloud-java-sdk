// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyIpWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of target instance. You can call <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> to obtain target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1uoihlf82e8****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the whitelist group for the target instance. You can invoke <a href="https://help.aliyun.com/document_detail/144606.html">DescribeIpWhitelist</a> to obtain the whitelist group name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_01</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The IP addresses in the whitelist group after modification. Separate multiple IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>42.120.XX.XX</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>The version of the IP address. Valid values:</p>
     * <ul>
     * <li><strong>4</strong>: IPv4.</li>
     * <li><strong>6</strong>: IPv6.</li>
     * </ul>
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
