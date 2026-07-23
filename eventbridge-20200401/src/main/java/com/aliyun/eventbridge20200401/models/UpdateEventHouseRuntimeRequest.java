// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventHouseRuntimeRequest extends TeaModel {
    /**
     * <p>The number of CUs for the EventHouse Runtime. The value must be greater than 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cu")
    public Integer cu;

    /**
     * <p>The name of the EventHouse Runtime. If this parameter is not specified, the default Runtime is used. In most cases, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateEventHouseRuntimeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventHouseRuntimeRequest self = new UpdateEventHouseRuntimeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventHouseRuntimeRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public UpdateEventHouseRuntimeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
