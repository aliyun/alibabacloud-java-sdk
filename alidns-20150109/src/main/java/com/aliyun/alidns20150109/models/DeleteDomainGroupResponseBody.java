// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainGroupResponseBody extends TeaModel {
    /**
     * <p>The name of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>MyGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDomainGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainGroupResponseBody self = new DeleteDomainGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteDomainGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
