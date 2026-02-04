// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCustomFieldRequest extends TeaModel {
    /**
     * <p>fieldId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ufd_001</p>
     */
    @NameInMap("FieldId")
    public String fieldId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCustomFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomFieldRequest self = new GetCustomFieldRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomFieldRequest setFieldId(String fieldId) {
        this.fieldId = fieldId;
        return this;
    }
    public String getFieldId() {
        return this.fieldId;
    }

    public GetCustomFieldRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
