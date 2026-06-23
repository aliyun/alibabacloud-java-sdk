// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListInstanceWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the instance whose whitelist to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of whitelist to query.</p>
     * <p>VPC whitelists apply only to instances whose VPC endpoint is of the <code>anytunnel</code> type. The latest instance versions use a <code>PrivateLink</code> VPC endpoint and do not support VPC whitelists.</p>
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
