// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class VodPackagingGroup extends TeaModel {
    @NameInMap("ApproximateAssetCount")
    public Long approximateAssetCount;

    @NameInMap("ConfigurationCount")
    public Long configurationCount;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupName")
    public String groupName;

    public static VodPackagingGroup build(java.util.Map<String, ?> map) throws Exception {
        VodPackagingGroup self = new VodPackagingGroup();
        return TeaModel.build(map, self);
    }

    public VodPackagingGroup setApproximateAssetCount(Long approximateAssetCount) {
        this.approximateAssetCount = approximateAssetCount;
        return this;
    }
    public Long getApproximateAssetCount() {
        return this.approximateAssetCount;
    }

    public VodPackagingGroup setConfigurationCount(Long configurationCount) {
        this.configurationCount = configurationCount;
        return this;
    }
    public Long getConfigurationCount() {
        return this.configurationCount;
    }

    public VodPackagingGroup setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public VodPackagingGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VodPackagingGroup setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public VodPackagingGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
