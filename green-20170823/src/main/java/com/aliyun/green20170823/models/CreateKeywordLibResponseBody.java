// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateKeywordLibResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateKeywordLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKeywordLibResponseBody self = new CreateKeywordLibResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKeywordLibResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateKeywordLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
