// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyAdvancedConfigResponseBody extends TeaModel {
    // Indicates whether the strict mode is enabled for the access control policy. Valid values:
    // 
    // *   **on**: The strict mode is enabled.
    // *   **off**: The strict mode is disabled.
    @NameInMap("InternetSwitch")
    public String internetSwitch;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolicyAdvancedConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyAdvancedConfigResponseBody self = new DescribePolicyAdvancedConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyAdvancedConfigResponseBody setInternetSwitch(String internetSwitch) {
        this.internetSwitch = internetSwitch;
        return this;
    }
    public String getInternetSwitch() {
        return this.internetSwitch;
    }

    public DescribePolicyAdvancedConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
