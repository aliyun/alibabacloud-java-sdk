// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EditRoutineConfShrinkRequest extends TeaModel {
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
     * <p>{&quot;staging&quot;:{&quot;SpecName&quot;:&quot;50ms&quot;,&quot;AllowedHosts&quot;:[&quot;test-a.alicdn.com&quot;,&quot;test-b.alicdn.com&quot;]},&quot;production&quot;:{&quot;SpecName&quot;:&quot;50ms&quot;,&quot;AllowedHosts&quot;:[&quot;test-c.alicdn.com&quot;,&quot;test-d.alicdn.com&quot;]},&quot;presetCanaryZhejiang&quot;:{&quot;SpecName&quot;:&quot;100ms&quot;,&quot;AllowedHosts&quot;:[&quot;test-e.alicdn.com&quot;,&quot;test-f.alicdn.com&quot;]},&quot;presetCanaryBeijing&quot;:{&quot;SpecName&quot;:&quot;5ms&quot;,&quot;AllowedHosts&quot;:[&quot;test-g.alicdn.com&quot;,&quot;test-h.alicdn.com&quot;]},&quot;presetCanaryNotExist&quot;:{&quot;SpecName&quot;:&quot;5ms&quot;,&quot;CodeRev&quot;:&quot;1622446907645949975&quot;,&quot;AllowedHosts&quot;:[&quot;error hosts&quot;]}}</p>
     */
    @NameInMap("EnvConf")
    public String envConfShrink;

    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-slc</p>
     */
    @NameInMap("Name")
    public String name;

    public static EditRoutineConfShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EditRoutineConfShrinkRequest self = new EditRoutineConfShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EditRoutineConfShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EditRoutineConfShrinkRequest setEnvConfShrink(String envConfShrink) {
        this.envConfShrink = envConfShrink;
        return this;
    }
    public String getEnvConfShrink() {
        return this.envConfShrink;
    }

    public EditRoutineConfShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
