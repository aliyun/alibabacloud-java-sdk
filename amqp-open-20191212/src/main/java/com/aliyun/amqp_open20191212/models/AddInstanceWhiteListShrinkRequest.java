// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class AddInstanceWhiteListShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.0.0.20/30</p>
     */
    @NameInMap("WhiteListItem")
    public String whiteListItemShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("WhiteListType")
    public Integer whiteListType;

    public static AddInstanceWhiteListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceWhiteListShrinkRequest self = new AddInstanceWhiteListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddInstanceWhiteListShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddInstanceWhiteListShrinkRequest setWhiteListItemShrink(String whiteListItemShrink) {
        this.whiteListItemShrink = whiteListItemShrink;
        return this;
    }
    public String getWhiteListItemShrink() {
        return this.whiteListItemShrink;
    }

    public AddInstanceWhiteListShrinkRequest setWhiteListType(Integer whiteListType) {
        this.whiteListType = whiteListType;
        return this;
    }
    public Integer getWhiteListType() {
        return this.whiteListType;
    }

}
