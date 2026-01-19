// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCloudAccountRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>carole_01kmek49aqxxxx</p>
     */
    @NameInMap("CloudAccountRoleId")
    public String cloudAccountRoleId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudAccountRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudAccountRoleResponseBody self = new CreateCloudAccountRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudAccountRoleResponseBody setCloudAccountRoleId(String cloudAccountRoleId) {
        this.cloudAccountRoleId = cloudAccountRoleId;
        return this;
    }
    public String getCloudAccountRoleId() {
        return this.cloudAccountRoleId;
    }

    public CreateCloudAccountRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
