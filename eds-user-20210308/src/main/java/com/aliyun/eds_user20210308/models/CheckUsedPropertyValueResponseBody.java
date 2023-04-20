// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CheckUsedPropertyValueResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of convenience users that are associated with the property value.</p>
     */
    @NameInMap("UseCount")
    public Long useCount;

    public static CheckUsedPropertyValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUsedPropertyValueResponseBody self = new CheckUsedPropertyValueResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUsedPropertyValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUsedPropertyValueResponseBody setUseCount(Long useCount) {
        this.useCount = useCount;
        return this;
    }
    public Long getUseCount() {
        return this.useCount;
    }

}
