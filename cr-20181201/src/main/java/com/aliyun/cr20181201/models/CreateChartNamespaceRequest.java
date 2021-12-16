// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartNamespaceRequest extends TeaModel {
    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    @NameInMap("DefaultRepoType")
    public String defaultRepoType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NamespaceName")
    public String namespaceName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateChartNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChartNamespaceRequest self = new CreateChartNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateChartNamespaceRequest setAutoCreateRepo(Boolean autoCreateRepo) {
        this.autoCreateRepo = autoCreateRepo;
        return this;
    }
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    public CreateChartNamespaceRequest setDefaultRepoType(String defaultRepoType) {
        this.defaultRepoType = defaultRepoType;
        return this;
    }
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    public CreateChartNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateChartNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateChartNamespaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
