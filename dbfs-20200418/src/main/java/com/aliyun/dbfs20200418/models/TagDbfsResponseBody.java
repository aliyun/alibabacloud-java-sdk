// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class TagDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TagDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagDbfsResponseBody self = new TagDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public TagDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
