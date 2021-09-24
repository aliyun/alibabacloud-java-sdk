// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceGroupResponse extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateDataServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceGroupResponse self = new CreateDataServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceGroupResponse setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateDataServiceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
