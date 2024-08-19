// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteInstanceMembersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>03E8AA70-0CC9-42EA-97AA-EA68377930B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceMembersResponseBody self = new DeleteInstanceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
