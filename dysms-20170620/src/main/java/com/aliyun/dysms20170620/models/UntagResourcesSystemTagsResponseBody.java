// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UntagResourcesSystemTagsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static UntagResourcesSystemTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesSystemTagsResponseBody self = new UntagResourcesSystemTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesSystemTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UntagResourcesSystemTagsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UntagResourcesSystemTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
