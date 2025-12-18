// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceTypePropertiesResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *       &quot;description&quot;: &quot;The ID of the resource group to which the instance belongs.\n&quot;,
     *       &quot;title&quot;: &quot;ResourceGroupId&quot;,
     *       &quot;type&quot;: &quot;String&quot;,
     *       &quot;key&quot;: &quot;ResourceGroupId&quot;,
     *       &quot;example&quot;: &quot;rg-bp67acfmxazb4p****&quot;
     *     },
     *     {
     *       &quot;description&quot;: &quot;The billing method of the instance. Valid values:\n\n*   PrePaid: subscription\n*   PostPaid: pay-as-you-go\n&quot;,
     *       &quot;title&quot;: &quot;InstanceChargeType&quot;,
     *       &quot;type&quot;: &quot;String&quot;,
     *       &quot;key&quot;: &quot;InstanceChargeType&quot;,
     *       &quot;example&quot;: &quot;PostPaid&quot;
     *     }]</p>
     */
    @NameInMap("Configuration")
    public String configuration;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0C2868BF-47EE-5441-B34B-17F080B10DC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceTypePropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypePropertiesResponseBody self = new GetResourceTypePropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceTypePropertiesResponseBody setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public GetResourceTypePropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
