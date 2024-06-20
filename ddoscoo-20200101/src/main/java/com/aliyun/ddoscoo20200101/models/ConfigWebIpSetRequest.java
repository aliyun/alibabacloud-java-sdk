// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebIpSetRequest extends TeaModel {
    /**
     * <p>IP address N or CIDR block N that you want to add to the blacklist. The maximum value of N is 200. You can add up to 200 IP addresses or CIDR blocks to the blacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("BlackList")
    public java.util.List<String> blackList;

    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>IP address N or CIDR block N that you want to add to the whitelist. The maximum value of N is 200. You can add up to 200 IP addresses or CIDR blocks to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>2.2.2.2/24</p>
     */
    @NameInMap("WhiteList")
    public java.util.List<String> whiteList;

    public static ConfigWebIpSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigWebIpSetRequest self = new ConfigWebIpSetRequest();
        return TeaModel.build(map, self);
    }

    public ConfigWebIpSetRequest setBlackList(java.util.List<String> blackList) {
        this.blackList = blackList;
        return this;
    }
    public java.util.List<String> getBlackList() {
        return this.blackList;
    }

    public ConfigWebIpSetRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigWebIpSetRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigWebIpSetRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

}
