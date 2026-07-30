// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSecurityIPGroupRequest extends TeaModel {
    /**
     * <p>The IP addresses in the whitelist template.</p>
     * <blockquote>
     * <p>Separate multiple IP addresses with commas (,). The IP addresses cannot be repeated. You can add up to 1,000 IP addresses.</p>
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
     * <li><p>Consists of lowercase letters, digits, and underscores (_).</p>
     * </li>
     * <li><p>Starts with a letter and ends with a letter or a digit.</p>
     * </li>
     * <li><p>Is 2 to 120 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_123</p>
     */
    @NameInMap("GlobalIgName")
    public String globalIgName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionName")
    public String regionName;

    public static CreateSecurityIPGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIPGroupRequest self = new CreateSecurityIPGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIPGroupRequest setGIpList(String GIpList) {
        this.GIpList = GIpList;
        return this;
    }
    public String getGIpList() {
        return this.GIpList;
    }

    public CreateSecurityIPGroupRequest setGlobalIgName(String globalIgName) {
        this.globalIgName = globalIgName;
        return this;
    }
    public String getGlobalIgName() {
        return this.globalIgName;
    }

    public CreateSecurityIPGroupRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

}
