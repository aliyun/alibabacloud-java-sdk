// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateFileImportTemplateRequest extends TeaModel {
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
     * <p>同步目标类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam_v2_user_import,
     * application, identity_provider</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static GenerateFileImportTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileImportTemplateRequest self = new GenerateFileImportTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GenerateFileImportTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateFileImportTemplateRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
