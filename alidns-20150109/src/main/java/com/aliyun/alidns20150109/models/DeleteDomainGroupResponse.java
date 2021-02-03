// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    public static DeleteDomainGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainGroupResponse self = new DeleteDomainGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDomainGroupResponse setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
