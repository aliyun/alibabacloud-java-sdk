// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CommitContactFlowRequest extends TeaModel {
    /**
     * <p>The contact flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7d706489-d06d-4a92-8666-8c9dba2c5cb1</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>The definition of the Interactive Voice Response (IVR).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;activities&quot;:[{&quot;type&quot;:&quot;INCOMING_CALL&quot;,&quot;id&quot;:&quot;e98f0d47&quot;,&quot;name&quot;:&quot;开始&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:263,&quot;y&quot;:164}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;2d3ad2c2&quot;,&quot;edgeId&quot;:&quot;41f7dbd0&quot;}],&quot;nodeIndex&quot;:0},{&quot;type&quot;:&quot;HANGUP&quot;,&quot;id&quot;:&quot;bd4f37e2&quot;,&quot;name&quot;:&quot;挂机&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:765,&quot;y&quot;:185}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:null}],&quot;nodeIndex&quot;:999},{&quot;type&quot;:&quot;PLAY_SAY&quot;,&quot;id&quot;:&quot;2d3ad2c2&quot;,&quot;name&quot;:&quot;放音&quot;,&quot;properties&quot;:{&quot;say&quot;:&quot;您好，欢迎来到云联络中心。&quot;,&quot;audioResourceId&quot;:&quot;&quot;,&quot;position&quot;:{&quot;x&quot;:485.5,&quot;y&quot;:153.5},&quot;audioType&quot;:&quot;tts&quot;,&quot;audioInterrupt&quot;:false},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;bd4f37e2&quot;,&quot;edgeId&quot;:&quot;e1af4f1f&quot;}],&quot;nodeIndex&quot;:1}],&quot;description&quot;:&quot;&quot;}</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The version description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The draft ID. This is the ID of the draft version that corresponds to the current contact flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b28f74ca-5846-4496-8bbd-34fb1750798c</p>
     */
    @NameInMap("DraftId")
    public String draftId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CommitContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitContactFlowRequest self = new CommitContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public CommitContactFlowRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public CommitContactFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CommitContactFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CommitContactFlowRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

    public CommitContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
