// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneNacosConfigRequest extends TeaModel {
    /**
     * <p>Language type of the returned message:</p>
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
     * <p>Configuration items to be cloned, in the format of dataId+group, with multiple items separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>test+test,test1+test1</p>
     */
    @NameInMap("DataIds")
    public String dataIds;

    /**
     * <p>List of configuration IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>253661,253662</p>
     */
    @NameInMap("Ids")
    @Deprecated
    public String ids;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-i7m25igg403</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Source namespace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>be821963-6d48-4ea5-9910-6057d****</p>
     */
    @NameInMap("OriginNamespaceId")
    public String originNamespaceId;

    /**
     * <p>The strategy used when a write conflict occurs.</p>
     * <ul>
     * <li>ABORT</li>
     * <li>SKIP</li>
     * <li>OVERWRITE</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OVERWRITE</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>Target namespace ID.</p>
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

    public CloneNacosConfigRequest setDataIds(String dataIds) {
        this.dataIds = dataIds;
        return this;
    }
    public String getDataIds() {
        return this.dataIds;
    }

    @Deprecated
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
