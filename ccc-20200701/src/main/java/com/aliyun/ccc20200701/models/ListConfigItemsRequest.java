// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListConfigItemsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    public static ListConfigItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigItemsRequest self = new ListConfigItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigItemsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConfigItemsRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ListConfigItemsRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
