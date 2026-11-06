// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCloudPermissionTemplateRequest extends TeaModel {
    /**
     * <p>The cloud account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>The permission template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpt_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("CloudPermissionTemplateId")
    public String cloudPermissionTemplateId;

    /**
     * <p>The ID of the IDaaS EIAM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableCloudPermissionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableCloudPermissionTemplateRequest self = new DisableCloudPermissionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DisableCloudPermissionTemplateRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public DisableCloudPermissionTemplateRequest setCloudPermissionTemplateId(String cloudPermissionTemplateId) {
        this.cloudPermissionTemplateId = cloudPermissionTemplateId;
        return this;
    }
    public String getCloudPermissionTemplateId() {
        return this.cloudPermissionTemplateId;
    }

    public DisableCloudPermissionTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
