// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyClusterAttributesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("Name")
    public String name;

    @NameInMap("RamNodeTypes")
    public java.util.List<String> ramNodeTypes;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    public static ModifyClusterAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAttributesRequest self = new ModifyClusterAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAttributesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyClusterAttributesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyClusterAttributesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public ModifyClusterAttributesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyClusterAttributesRequest setRamNodeTypes(java.util.List<String> ramNodeTypes) {
        this.ramNodeTypes = ramNodeTypes;
        return this;
    }
    public java.util.List<String> getRamNodeTypes() {
        return this.ramNodeTypes;
    }

    public ModifyClusterAttributesRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

}
