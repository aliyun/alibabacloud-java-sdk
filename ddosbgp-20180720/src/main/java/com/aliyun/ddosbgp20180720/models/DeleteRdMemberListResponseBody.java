// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteRdMemberListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A2D6D5FB-FA07-41A8-B093-A2B7B26E72F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRdMemberListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRdMemberListResponseBody self = new DeleteRdMemberListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRdMemberListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
