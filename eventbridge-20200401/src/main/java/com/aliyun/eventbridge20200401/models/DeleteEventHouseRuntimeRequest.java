// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventHouseRuntimeRequest extends TeaModel {
    /**
     * <p>The name of the EventHouse Runtime. If this parameter is not specified, the default Runtime is used. In most cases, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteEventHouseRuntimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventHouseRuntimeRequest self = new DeleteEventHouseRuntimeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventHouseRuntimeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
