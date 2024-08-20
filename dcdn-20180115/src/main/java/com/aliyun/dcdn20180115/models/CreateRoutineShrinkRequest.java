// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateRoutineShrinkRequest extends TeaModel {
    /**
     * <p>The description of the routine.</p>
     * 
     * <strong>example:</strong>
     * <p>the description of this routine</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configurations of the specified environment.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;staging&quot;:{&quot;SpecName&quot;:&quot;50ms&quot;},&quot;production&quot;:{&quot;SpecName&quot;:&quot;50ms&quot;}}</p>
     */
    @NameInMap("EnvConf")
    public String envConfShrink;

    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateRoutineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineShrinkRequest self = new CreateRoutineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRoutineShrinkRequest setEnvConfShrink(String envConfShrink) {
        this.envConfShrink = envConfShrink;
        return this;
    }
    public String getEnvConfShrink() {
        return this.envConfShrink;
    }

    public CreateRoutineShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
