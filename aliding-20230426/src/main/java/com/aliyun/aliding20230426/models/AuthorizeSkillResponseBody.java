// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AuthorizeSkillResponseBody extends TeaModel {
    @NameInMap("Data")
    public Object data;

    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSkillResponseBody self = new AuthorizeSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeSkillResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public AuthorizeSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
