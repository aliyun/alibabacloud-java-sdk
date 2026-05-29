// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class AddInstanceWhiteListRequest extends TeaModel {
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
    public java.util.List<String> whiteListItem;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("WhiteListType")
    public Integer whiteListType;

    public static AddInstanceWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceWhiteListRequest self = new AddInstanceWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddInstanceWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddInstanceWhiteListRequest setWhiteListItem(java.util.List<String> whiteListItem) {
        this.whiteListItem = whiteListItem;
        return this;
    }
    public java.util.List<String> getWhiteListItem() {
        return this.whiteListItem;
    }

    public AddInstanceWhiteListRequest setWhiteListType(Integer whiteListType) {
        this.whiteListType = whiteListType;
        return this;
    }
    public Integer getWhiteListType() {
        return this.whiteListType;
    }

}
