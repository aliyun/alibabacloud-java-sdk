// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEipRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5sg1owx0g4ojy66ab2tez77r2</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteEipRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEipRequest self = new DeleteEipRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEipRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
