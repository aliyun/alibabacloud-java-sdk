// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAdInsertionRequest extends TeaModel {
    /**
     * <p>The name of the ad insertion configuration that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_ad</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetAdInsertionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdInsertionRequest self = new GetAdInsertionRequest();
        return TeaModel.build(map, self);
    }

    public GetAdInsertionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
