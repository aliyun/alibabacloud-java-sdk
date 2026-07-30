// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySecurityIPGroupRequest extends TeaModel {
    /**
     * <p>The IP addresses in the whitelist template.</p>
     * <blockquote>
     * <p>Separate multiple IP addresses with commas (,). A maximum of 1,000 IP addresses or CIDR blocks can be added to all IP address whitelists.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("GIpList")
    public String GIpList;

    /**
     * <p>The name of the IP address whitelist template. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>It can contain lowercase letters, digits, and underscores (_).</p>
     * </li>
     * <li><p>It must start with a letter and end with a letter or a digit.</p>
     * </li>
     * <li><p>It must be 2 to 120 characters in length.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter overwrites the initial value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_123</p>
     */
    @NameInMap("GlobalIgName")
    public String globalIgName;

    /**
     * <p>The ID of the IP address whitelist template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>g-9ubyrqeoko****,g-pdxlrvn13k****</p>
     */
    @NameInMap("GlobalSecurityGroupId")
    public String globalSecurityGroupId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionName")
    public String regionName;

    public static ModifySecurityIPGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPGroupRequest self = new ModifySecurityIPGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIPGroupRequest setGIpList(String GIpList) {
        this.GIpList = GIpList;
        return this;
    }
    public String getGIpList() {
        return this.GIpList;
    }

    public ModifySecurityIPGroupRequest setGlobalIgName(String globalIgName) {
        this.globalIgName = globalIgName;
        return this;
    }
    public String getGlobalIgName() {
        return this.globalIgName;
    }

    public ModifySecurityIPGroupRequest setGlobalSecurityGroupId(String globalSecurityGroupId) {
        this.globalSecurityGroupId = globalSecurityGroupId;
        return this;
    }
    public String getGlobalSecurityGroupId() {
        return this.globalSecurityGroupId;
    }

    public ModifySecurityIPGroupRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

}
