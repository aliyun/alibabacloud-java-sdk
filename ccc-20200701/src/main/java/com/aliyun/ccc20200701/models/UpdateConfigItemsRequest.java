// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateConfigItemsRequest extends TeaModel {
    @NameInMap("ConfigItems")
    public String configItems;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ObjectId")
    public String objectId;

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
