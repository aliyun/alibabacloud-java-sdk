// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class VodPackagingGroup extends TeaModel {
    /**
     * <p>The approximate number of packaging assets in the packaging group.</p>
     */
    @NameInMap("ApproximateAssetCount")
    public Long approximateAssetCount;

    /**
     * <p>The number of packaging configurations in the packaging group.</p>
     */
    @NameInMap("ConfigurationCount")
    public Long configurationCount;

    /**
     * <p>The creation time of the packaging group.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the packaging group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The playback domain name of the packaging group. All VOD packaging assets in the same packaging group share the same domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the packaging group. The name must be unique per user, up to 128 characters in length, and match the format [A-Za-z0-9_-]+.</p>
     * 
     * <strong>example:</strong>
     * <p>example-group</p>
     */
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
