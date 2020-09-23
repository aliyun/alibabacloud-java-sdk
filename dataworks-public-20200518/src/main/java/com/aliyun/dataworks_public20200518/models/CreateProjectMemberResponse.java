// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMemberResponse self = new CreateProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectMemberResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
