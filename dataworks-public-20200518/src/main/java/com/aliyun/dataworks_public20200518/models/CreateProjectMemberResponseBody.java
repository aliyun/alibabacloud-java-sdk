// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProjectMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMemberResponseBody self = new CreateProjectMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
