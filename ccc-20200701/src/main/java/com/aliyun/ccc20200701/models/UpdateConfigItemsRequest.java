// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateConfigItemsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;ShowCalledID&quot;,&quot;value&quot;:&quot;-1&quot;},{&quot;name&quot;:&quot;ShowCalleeID&quot;,&quot;value&quot;:&quot;1&quot;},{&quot;name&quot;:&quot;AllowHangup&quot;,&quot;value&quot;:&quot;0&quot;},{&quot;name&quot;:&quot;AutoAnswerCall&quot;,&quot;value&quot;:&quot;-1&quot;},{&quot;name&quot;:&quot;AllowAudioDownload&quot;,&quot;value&quot;:&quot;1&quot;},{&quot;name&quot;:&quot;AllowChooseSignedSkillGroup&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
     */
    @NameInMap("ConfigItems")
    public String configItems;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    public static UpdateConfigItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigItemsRequest self = new UpdateConfigItemsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigItemsRequest setConfigItems(String configItems) {
        this.configItems = configItems;
        return this;
    }
    public String getConfigItems() {
        return this.configItems;
    }

    public UpdateConfigItemsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConfigItemsRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public UpdateConfigItemsRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
