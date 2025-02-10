// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BE0D8D2-6702-5639-A9C2-xxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether an SLR is created.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("ServiceLinkedRoleExists")
    public Boolean serviceLinkedRoleExists;

    public static CheckServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponseBody self = new CheckServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceLinkedRoleResponseBody setServiceLinkedRoleExists(Boolean serviceLinkedRoleExists) {
        this.serviceLinkedRoleExists = serviceLinkedRoleExists;
        return this;
    }
    public Boolean getServiceLinkedRoleExists() {
        return this.serviceLinkedRoleExists;
    }

}
