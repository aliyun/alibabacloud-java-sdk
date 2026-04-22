// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ListAclGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-123xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static ListAclGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAclGroupsRequest self = new ListAclGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAclGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAclGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
