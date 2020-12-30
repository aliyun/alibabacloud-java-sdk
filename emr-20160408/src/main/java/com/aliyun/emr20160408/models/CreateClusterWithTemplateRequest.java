// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateClusterWithTemplateRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateBizId")
    public String templateBizId;

    @NameInMap("UniqueTag")
    public String uniqueTag;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateClusterWithTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterWithTemplateRequest self = new CreateClusterWithTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterWithTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateClusterWithTemplateRequest setTemplateBizId(String templateBizId) {
        this.templateBizId = templateBizId;
        return this;
    }
    public String getTemplateBizId() {
        return this.templateBizId;
    }

    public CreateClusterWithTemplateRequest setUniqueTag(String uniqueTag) {
        this.uniqueTag = uniqueTag;
        return this;
    }
    public String getUniqueTag() {
        return this.uniqueTag;
    }

    public CreateClusterWithTemplateRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterWithTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
