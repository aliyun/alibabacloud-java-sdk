// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateContactFlowRequest extends TeaModel {
    /**
     * <p>IVR content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;activities&quot;:[{&quot;type&quot;:&quot;INCOMING_CALL&quot;,&quot;id&quot;:&quot;e98f0d47&quot;,&quot;name&quot;:&quot;开始&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:263,&quot;y&quot;:164}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;2d3ad2c2&quot;,&quot;edgeId&quot;:&quot;41f7dbd0&quot;}],&quot;nodeIndex&quot;:0},{&quot;type&quot;:&quot;HANGUP&quot;,&quot;id&quot;:&quot;bd4f37e2&quot;,&quot;name&quot;:&quot;挂机&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:765,&quot;y&quot;:185}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:null}],&quot;nodeIndex&quot;:999},{&quot;type&quot;:&quot;PLAY_SAY&quot;,&quot;id&quot;:&quot;2d3ad2c2&quot;,&quot;name&quot;:&quot;放音&quot;,&quot;properties&quot;:{&quot;say&quot;:&quot;您好，欢迎来到云联络中心。&quot;,&quot;audioResourceId&quot;:&quot;&quot;,&quot;position&quot;:{&quot;x&quot;:485.5,&quot;y&quot;:153.5},&quot;audioType&quot;:&quot;tts&quot;,&quot;audioInterrupt&quot;:false},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;bd4f37e2&quot;,&quot;edgeId&quot;:&quot;e1af4f1f&quot;}],&quot;nodeIndex&quot;:1}],&quot;description&quot;:&quot;&quot;}</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>Version description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Contact flow name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>默认流程</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Flow type.<br>
     * Main flow: MAIN_FLOW<br>
     * Child flow: SUB_FLOW<br>
     * Survey flow: SURVEY_FLOW<br><br><br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MAIN_FLOW</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContactFlowRequest self = new CreateContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateContactFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateContactFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateContactFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContactFlowRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
