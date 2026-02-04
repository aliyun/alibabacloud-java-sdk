// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceModuleInfoRequest extends TeaModel {
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

    public static GetInstanceModuleInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceModuleInfoRequest self = new GetInstanceModuleInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceModuleInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceModuleInfoRequest setModuleKey(String moduleKey) {
        this.moduleKey = moduleKey;
        return this;
    }
    public String getModuleKey() {
        return this.moduleKey;
    }

}
