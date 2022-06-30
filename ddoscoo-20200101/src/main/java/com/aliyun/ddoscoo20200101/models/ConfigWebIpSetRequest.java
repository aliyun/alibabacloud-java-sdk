// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebIpSetRequest extends TeaModel {
    @NameInMap("BlackList")
    public java.util.List<String> blackList;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
