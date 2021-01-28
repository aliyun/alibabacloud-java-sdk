// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class TagDcdnResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TagDcdnResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagDcdnResourcesResponseBody self = new TagDcdnResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagDcdnResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
