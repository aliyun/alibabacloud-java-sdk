// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessGroupResponseBody extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-test</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189F4F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessGroupResponseBody self = new CreateAccessGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessGroupResponseBody setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public CreateAccessGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
