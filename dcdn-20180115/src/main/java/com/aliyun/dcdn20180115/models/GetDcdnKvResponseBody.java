// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Value")
    public String value;

    public static GetDcdnKvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDcdnKvResponseBody self = new GetDcdnKvResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDcdnKvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDcdnKvResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
