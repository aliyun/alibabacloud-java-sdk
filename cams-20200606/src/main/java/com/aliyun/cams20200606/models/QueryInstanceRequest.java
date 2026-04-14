// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9293938****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceRequest self = new QueryInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
