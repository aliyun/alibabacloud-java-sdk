// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetEventHouseRuntimeRequest extends TeaModel {
    /**
     * <p>The name of the EventHouse Runtime. If this parameter is not specified, the default Runtime is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetEventHouseRuntimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventHouseRuntimeRequest self = new GetEventHouseRuntimeRequest();
        return TeaModel.build(map, self);
    }

    public GetEventHouseRuntimeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
