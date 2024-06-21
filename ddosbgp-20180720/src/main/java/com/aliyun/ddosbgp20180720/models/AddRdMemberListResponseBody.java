// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AddRdMemberListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddRdMemberListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRdMemberListResponseBody self = new AddRdMemberListResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRdMemberListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
