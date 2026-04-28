// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceControlConfigurationRequest extends TeaModel {
    @NameInMap("ElementName")
    public String elementName;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstanceControlConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceControlConfigurationRequest self = new GetInstanceControlConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceControlConfigurationRequest setElementName(String elementName) {
        this.elementName = elementName;
        return this;
    }
    public String getElementName() {
        return this.elementName;
    }

    public GetInstanceControlConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
