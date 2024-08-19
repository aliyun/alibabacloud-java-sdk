// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyAdvancedConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the strict mode is enabled for the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: The strict mode is enabled.</li>
     * <li><strong>off</strong>: The strict mode is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("InternetSwitch")
    public String internetSwitch;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-00090125EEB1</p>
     */
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
