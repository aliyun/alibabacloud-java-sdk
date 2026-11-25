// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyAdvancedConfigResponseBody extends TeaModel {
    /**
     * <p>The list of elastic IP addresses (EIPs) that take effect when strict mode is enabled. A maximum of 100 IP addresses can be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;47.100.XX.XX&quot;,&quot;47.101.XX.XX&quot;]</p>
     */
    @NameInMap("Eips")
    public java.util.List<String> eips;

    /**
     * <p>The enabling status of the strict mode for access control policies. Valid values:</p>
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
     * <p>The request ID.</p>
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

    public DescribePolicyAdvancedConfigResponseBody setEips(java.util.List<String> eips) {
        this.eips = eips;
        return this;
    }
    public java.util.List<String> getEips() {
        return this.eips;
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
