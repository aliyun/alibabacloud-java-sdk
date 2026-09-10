// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetTerraformPricingMappingsRequest extends TeaModel {
    /**
     * <p>The request body. The resourceTypes field specifies a list of Terraform resource types, such as alicloud_instance. You can specify a maximum of 200 resource types in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;resourceTypes&quot;: [
     *     &quot;alicloud_instance&quot;,
     *     &quot;alicloud_vpc&quot;
     *   ]
     * }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static GetTerraformPricingMappingsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTerraformPricingMappingsRequest self = new GetTerraformPricingMappingsRequest();
        return TeaModel.build(map, self);
    }

    public GetTerraformPricingMappingsRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
