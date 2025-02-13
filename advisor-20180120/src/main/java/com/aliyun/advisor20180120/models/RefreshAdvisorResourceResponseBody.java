// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>566331F9-5AB3-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshAdvisorResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorResourceResponseBody self = new RefreshAdvisorResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorResourceResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public RefreshAdvisorResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
