// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateNamespaceRequest extends TeaModel {
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

    public static UpdateNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceRequest self = new UpdateNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceRequest setAutoCreateRepo(Boolean autoCreateRepo) {
        this.autoCreateRepo = autoCreateRepo;
        return this;
    }
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    public UpdateNamespaceRequest setDefaultRepoType(String defaultRepoType) {
        this.defaultRepoType = defaultRepoType;
        return this;
    }
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    public UpdateNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public UpdateNamespaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
