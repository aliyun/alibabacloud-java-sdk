// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CheckUsedPropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UseCount")
    public Long useCount;

    public static CheckUsedPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUsedPropertyResponseBody self = new CheckUsedPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUsedPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUsedPropertyResponseBody setUseCount(Long useCount) {
        this.useCount = useCount;
        return this;
    }
    public Long getUseCount() {
        return this.useCount;
    }

}
