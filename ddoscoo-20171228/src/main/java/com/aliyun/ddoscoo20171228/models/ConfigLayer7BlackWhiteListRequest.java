// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7BlackWhiteListRequest extends TeaModel {
    @NameInMap("BlackList")
    public java.util.List<String> blackList;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("WhiteList")
    public java.util.List<String> whiteList;

    public static ConfigLayer7BlackWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7BlackWhiteListRequest self = new ConfigLayer7BlackWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7BlackWhiteListRequest setBlackList(java.util.List<String> blackList) {
        this.blackList = blackList;
        return this;
    }
    public java.util.List<String> getBlackList() {
        return this.blackList;
    }

    public ConfigLayer7BlackWhiteListRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigLayer7BlackWhiteListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigLayer7BlackWhiteListRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

}
