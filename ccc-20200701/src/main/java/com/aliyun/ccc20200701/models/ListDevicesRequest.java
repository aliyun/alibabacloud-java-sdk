// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDevicesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesRequest self = new ListDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDevicesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
