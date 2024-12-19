// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>Whether the service-linked role permission is granted:</p>
     * <ul>
     * <li>true: Granted.</li>
     * <li>false: Not granted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EntityRoleGrant")
    public Boolean entityRoleGrant;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>02F8BBF3-2D61-5982-8911-EEB387BE3AF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleResponseBody self = new DescribeServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleResponseBody setEntityRoleGrant(Boolean entityRoleGrant) {
        this.entityRoleGrant = entityRoleGrant;
        return this;
    }
    public Boolean getEntityRoleGrant() {
        return this.entityRoleGrant;
    }

    public DescribeServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
