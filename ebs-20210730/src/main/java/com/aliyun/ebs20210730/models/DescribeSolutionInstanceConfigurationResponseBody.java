// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeSolutionInstanceConfigurationResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSolutionInstanceConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSolutionInstanceConfigurationResponseBody self = new DescribeSolutionInstanceConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSolutionInstanceConfigurationResponseBody setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public DescribeSolutionInstanceConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
