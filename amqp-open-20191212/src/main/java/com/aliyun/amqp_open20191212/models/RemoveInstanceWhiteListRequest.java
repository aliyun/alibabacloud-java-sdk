// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class RemoveInstanceWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the instance from which to remove a whitelist entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-5yd3aw******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Call the ListInstanceWhiteList operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>420</p>
     */
    @NameInMap("whiteListItemId")
    public Long whiteListItemId;

    /**
     * <p>The type of the whitelist item. Specify 2 for an IP address or 1 for a VPC ID.</p>
     * <p>A VPC whitelist only applies to instances with the anytunnel VPC endpoint type. Newer instances use PrivateLink for their VPC endpoints and do not support VPC whitelists.</p>
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
