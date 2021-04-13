// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class CountProductSpiServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Count")
    public Long count;

    @NameInMap("Success")
    public Boolean success;

    public static CountProductSpiServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountProductSpiServiceResponseBody self = new CountProductSpiServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CountProductSpiServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountProductSpiServiceResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public CountProductSpiServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
