// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCloudPermissionTemplateRequest extends TeaModel {
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
     * <p>The ID of the permission template.</p>
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

    public static DeleteCloudPermissionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudPermissionTemplateRequest self = new DeleteCloudPermissionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudPermissionTemplateRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public DeleteCloudPermissionTemplateRequest setCloudPermissionTemplateId(String cloudPermissionTemplateId) {
        this.cloudPermissionTemplateId = cloudPermissionTemplateId;
        return this;
    }
    public String getCloudPermissionTemplateId() {
        return this.cloudPermissionTemplateId;
    }

    public DeleteCloudPermissionTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
