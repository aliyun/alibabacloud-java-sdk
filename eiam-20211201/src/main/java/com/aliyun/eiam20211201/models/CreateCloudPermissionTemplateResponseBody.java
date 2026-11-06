// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCloudPermissionTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the permission template.</p>
     * 
     * <strong>example:</strong>
     * <p>cpt_01l8dagf2iablhigj75l1n99xxxxx</p>
     */
    @NameInMap("CloudPermissionTemplateId")
    public String cloudPermissionTemplateId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudPermissionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudPermissionTemplateResponseBody self = new CreateCloudPermissionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudPermissionTemplateResponseBody setCloudPermissionTemplateId(String cloudPermissionTemplateId) {
        this.cloudPermissionTemplateId = cloudPermissionTemplateId;
        return this;
    }
    public String getCloudPermissionTemplateId() {
        return this.cloudPermissionTemplateId;
    }

    public CreateCloudPermissionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
