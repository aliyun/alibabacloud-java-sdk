// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupRequest self = new GetResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
