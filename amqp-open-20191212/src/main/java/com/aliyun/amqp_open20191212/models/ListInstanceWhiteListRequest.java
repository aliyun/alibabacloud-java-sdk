// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListInstanceWhiteListRequest extends TeaModel {
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
     * <p>2</p>
     */
    @NameInMap("whiteListType")
    public Integer whiteListType;

    public static ListInstanceWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceWhiteListRequest self = new ListInstanceWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceWhiteListRequest setWhiteListType(Integer whiteListType) {
        this.whiteListType = whiteListType;
        return this;
    }
    public Integer getWhiteListType() {
        return this.whiteListType;
    }

}
