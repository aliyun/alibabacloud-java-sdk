// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class AddMembersResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static AddMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMembersResponseBody self = new AddMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
