// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyNamespaceSpecV2ShrinkRequest extends TeaModel {
    @NameInMap("ElasticResourceSpec")
    public String elasticResourceSpecShrink;

    @NameInMap("GuaranteedResourceSpec")
    public String guaranteedResourceSpecShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Ha")
    public Boolean ha;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-cn-wwo36qj4g06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>di-593439443804417</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    public static ModifyNamespaceSpecV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNamespaceSpecV2ShrinkRequest self = new ModifyNamespaceSpecV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNamespaceSpecV2ShrinkRequest setElasticResourceSpecShrink(String elasticResourceSpecShrink) {
        this.elasticResourceSpecShrink = elasticResourceSpecShrink;
        return this;
    }
    public String getElasticResourceSpecShrink() {
        return this.elasticResourceSpecShrink;
    }

    public ModifyNamespaceSpecV2ShrinkRequest setGuaranteedResourceSpecShrink(String guaranteedResourceSpecShrink) {
        this.guaranteedResourceSpecShrink = guaranteedResourceSpecShrink;
        return this;
    }
    public String getGuaranteedResourceSpecShrink() {
        return this.guaranteedResourceSpecShrink;
    }

    public ModifyNamespaceSpecV2ShrinkRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public ModifyNamespaceSpecV2ShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyNamespaceSpecV2ShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyNamespaceSpecV2ShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
