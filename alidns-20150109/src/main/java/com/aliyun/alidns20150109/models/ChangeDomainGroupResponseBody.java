// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the target domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>2223</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the destination domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>MyGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeDomainGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainGroupResponseBody self = new ChangeDomainGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeDomainGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ChangeDomainGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ChangeDomainGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
