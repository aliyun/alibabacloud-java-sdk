// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class AddInstanceWhiteListShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the instance receiving the whitelist entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP addresses or VPC IDs to add to the whitelist. Specify IP addresses as CIDR blocks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.0.0.20/30</p>
     */
    @NameInMap("WhiteListItem")
    public String whiteListItemShrink;

    /**
     * <p>The type of the whitelist. Set this parameter to <code>2</code> if <code>WhiteListItem</code> contains IP addresses, or to <code>1</code> if it contains VPC IDs.</p>
     * <p>You can add a VPC whitelist only to instances that have an <code>anytunnel</code> VPC endpoint. Newer instances use the <code>privateLink</code> endpoint type, which does not support this feature.</p>
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
