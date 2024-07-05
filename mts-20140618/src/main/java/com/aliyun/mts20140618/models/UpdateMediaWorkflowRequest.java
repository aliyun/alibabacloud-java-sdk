// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowRequest extends TeaModel {
    /**
     * <p>The ID of the media workflow that you want to update. To obtain the ID of the media workflow, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Workflows</strong> &gt; <strong>Workflow Settings</strong> in the left-side navigation pane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6307eb0d3f85477882d205aa040f****</p>
     */
    @NameInMap("MediaWorkflowId")
    public String mediaWorkflowId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new topology of the media workflow. The value is a JSON object that contains the activity list and activity dependencies.</p>
     * <blockquote>
     * <p>The Object Storage Service (OSS) bucket must reside in the same region as your MPS service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Activities&quot;: {
     *             &quot;Act-Start&quot;: {
     *                   &quot;Parameters&quot;: {
     *                         &quot;PipelineId&quot;: &quot;130266f58161436a80bf07cb12c8****&quot;,
     *                         &quot;InputFile&quot;: &quot;{\&quot;Bucket\&quot;: \&quot;example-bucket-<strong><strong>\&quot;,\&quot;Location\&quot;: \&quot;cn-shanghai\&quot;}&quot;
     *                   },
     *                   &quot;Type&quot;: &quot;Start&quot;
     *             },
     *             &quot;Act-Report&quot;: {
     *                   &quot;Parameters&quot;: {},
     *                   &quot;Type&quot;: &quot;Report&quot;
     *             },
     *             &quot;Act-Transcode-M3U8&quot;: {
     *                   &quot;Parameters&quot;: {
     *                         &quot;Outputs&quot;: &quot;[{\&quot;Object\&quot;:\&quot;transcode/{ObjectPrefix}{FileName}\&quot;,\&quot;TemplateId\&quot;: \&quot;957d1719ee85ed6527b90cf62726</strong></strong>\&quot;}]&quot;,
     *                         &quot;OutputBucket&quot;: &quot;example-bucket-****&quot;,
     *                         &quot;OutputLocation&quot;: &quot;cn-shanghai&quot;
     *                   },
     *                   &quot;Type&quot;: &quot;Transcode&quot;
     *             }
     *       },
     *       &quot;Dependencies&quot;: {
     *             &quot;Act-Start&quot;: [
     *                   &quot;Act-Transcode-M3U8&quot;
     *             ],
     *             &quot;Act-Report&quot;: [],
     *             &quot;Act-Transcode-M3U8&quot;: [
     *                   &quot;Act-Report&quot;
     *             ]
     *       }
     * }</p>
     */
    @NameInMap("Topology")
    public String topology;

    @NameInMap("TriggerMode")
    public String triggerMode;

    public static UpdateMediaWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaWorkflowRequest self = new UpdateMediaWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaWorkflowRequest setMediaWorkflowId(String mediaWorkflowId) {
        this.mediaWorkflowId = mediaWorkflowId;
        return this;
    }
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    public UpdateMediaWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMediaWorkflowRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateMediaWorkflowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMediaWorkflowRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateMediaWorkflowRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateMediaWorkflowRequest setTopology(String topology) {
        this.topology = topology;
        return this;
    }
    public String getTopology() {
        return this.topology;
    }

    public UpdateMediaWorkflowRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

}
