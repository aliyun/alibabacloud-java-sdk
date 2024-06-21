// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneNacosConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The data structure.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>253661,253662</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The ID of the destination namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-i7m25igg403</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The policy used when a write conflict occurs.</p>
     * <ul>
     * <li>ABORT</li>
     * <li>SKIP</li>
     * <li>OVERWRITE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>be821963-6d48-4ea5-9910-6057d****</p>
     */
    @NameInMap("OriginNamespaceId")
    public String originNamespaceId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OVERWRITE</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The IDs of configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>08be4b5d-2d1c-4e6e-aa85-83b9****</p>
     */
    @NameInMap("TargetNamespaceId")
    public String targetNamespaceId;

    public static CloneNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneNacosConfigRequest self = new CloneNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public CloneNacosConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CloneNacosConfigRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public CloneNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CloneNacosConfigRequest setOriginNamespaceId(String originNamespaceId) {
        this.originNamespaceId = originNamespaceId;
        return this;
    }
    public String getOriginNamespaceId() {
        return this.originNamespaceId;
    }

    public CloneNacosConfigRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CloneNacosConfigRequest setTargetNamespaceId(String targetNamespaceId) {
        this.targetNamespaceId = targetNamespaceId;
        return this;
    }
    public String getTargetNamespaceId() {
        return this.targetNamespaceId;
    }

}
