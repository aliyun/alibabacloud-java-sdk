// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the business process.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceGroupResponseBody self = new CreateDataServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateDataServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
