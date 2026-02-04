// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CheckInstanceModuleStatusRequest extends TeaModel {
    /**
     * <p>二级模块标识</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:license:module:ud:customField</p>
     */
    @NameInMap("FeatureKey")
    public String featureKey;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>一级模块标识，必填</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:license:module:ud</p>
     */
    @NameInMap("ModuleKey")
    public String moduleKey;

    /**
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:license:module:idp:alibaba:dingtalk:pull:advanced_configuration</p>
     */
    @NameInMap("SubFeatureKey")
    public String subFeatureKey;

    public static CheckInstanceModuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceModuleStatusRequest self = new CheckInstanceModuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckInstanceModuleStatusRequest setFeatureKey(String featureKey) {
        this.featureKey = featureKey;
        return this;
    }
    public String getFeatureKey() {
        return this.featureKey;
    }

    public CheckInstanceModuleStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckInstanceModuleStatusRequest setModuleKey(String moduleKey) {
        this.moduleKey = moduleKey;
        return this;
    }
    public String getModuleKey() {
        return this.moduleKey;
    }

    public CheckInstanceModuleStatusRequest setSubFeatureKey(String subFeatureKey) {
        this.subFeatureKey = subFeatureKey;
        return this;
    }
    public String getSubFeatureKey() {
        return this.subFeatureKey;
    }

}
