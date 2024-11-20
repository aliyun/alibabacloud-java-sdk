// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreatePipelineRequest extends TeaModel {
    /**
     * <p>The name of the MPS queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-pipeline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The priority. Default value: 6. Valid values: 1 to 10. A greater value specifies a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The type of the MPS queue. Valid values:</p>
     * <ol>
     * <li>Standard: standard MPS queue.</li>
     * <li>Boost: MPS queue with transcoding speed boosted.</li>
     * <li>NarrowBandHDV2: MPS queue that supports Narrowband HD 2.0.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Speed")
    public String speed;

    public static CreatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRequest self = new CreatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePipelineRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreatePipelineRequest setSpeed(String speed) {
        this.speed = speed;
        return this;
    }
    public String getSpeed() {
        return this.speed;
    }

}
