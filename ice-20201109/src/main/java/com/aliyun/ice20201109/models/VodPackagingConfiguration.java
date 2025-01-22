// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class VodPackagingConfiguration extends TeaModel {
    @NameInMap("ConfigurationName")
    public String configurationName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("PackageConfig")
    public VodPackagingConfig packageConfig;

    @NameInMap("Protocol")
    public String protocol;

    public static VodPackagingConfiguration build(java.util.Map<String, ?> map) throws Exception {
        VodPackagingConfiguration self = new VodPackagingConfiguration();
        return TeaModel.build(map, self);
    }

    public VodPackagingConfiguration setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }
    public String getConfigurationName() {
        return this.configurationName;
    }

    public VodPackagingConfiguration setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public VodPackagingConfiguration setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VodPackagingConfiguration setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public VodPackagingConfiguration setPackageConfig(VodPackagingConfig packageConfig) {
        this.packageConfig = packageConfig;
        return this;
    }
    public VodPackagingConfig getPackageConfig() {
        return this.packageConfig;
    }

    public VodPackagingConfiguration setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
