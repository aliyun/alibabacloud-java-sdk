// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateOrderForRdsRequest extends TeaModel {
    /**
     * <p>The JSON string that contains the order details. For more information, see <a href="https://help.aliyun.com/document_detail/26228.html">CreateDBInstance</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateOrderForRdsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForRdsRequest self = new CreateOrderForRdsRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderForRdsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CreateOrderForRdsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
