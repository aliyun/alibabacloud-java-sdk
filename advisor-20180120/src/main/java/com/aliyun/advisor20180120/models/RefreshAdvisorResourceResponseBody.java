// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

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
