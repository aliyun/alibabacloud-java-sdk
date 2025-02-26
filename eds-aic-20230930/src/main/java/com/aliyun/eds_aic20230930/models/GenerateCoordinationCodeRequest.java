// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GenerateCoordinationCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acp-2zecay9ponatdc4m****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>xiaoming</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    public static GenerateCoordinationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCoordinationCodeRequest self = new GenerateCoordinationCodeRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCoordinationCodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateCoordinationCodeRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

}
