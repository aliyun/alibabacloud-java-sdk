// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class RemoveInstanceWhiteListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-5yd3aw******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>420</p>
     */
    @NameInMap("whiteListItemId")
    public Long whiteListItemId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("whiteListType")
    public Integer whiteListType;

    public static RemoveInstanceWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceWhiteListRequest self = new RemoveInstanceWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveInstanceWhiteListRequest setWhiteListItemId(Long whiteListItemId) {
        this.whiteListItemId = whiteListItemId;
        return this;
    }
    public Long getWhiteListItemId() {
        return this.whiteListItemId;
    }

    public RemoveInstanceWhiteListRequest setWhiteListType(Integer whiteListType) {
        this.whiteListType = whiteListType;
        return this;
    }
    public Integer getWhiteListType() {
        return this.whiteListType;
    }

}
