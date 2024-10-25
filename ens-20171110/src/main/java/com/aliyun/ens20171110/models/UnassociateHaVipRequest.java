// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateHaVipRequest extends TeaModel {
    /**
     * <p>The ID of the HAVIP that you want to disassociate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>havip-5p14t****</p>
     */
    @NameInMap("HaVipId")
    public String haVipId;

    /**
     * <p>The ID of the ENS instance or ENI that you want to disassociate from the HAVIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5ecpqvk****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UnassociateHaVipRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateHaVipRequest self = new UnassociateHaVipRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateHaVipRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }
    public String getHaVipId() {
        return this.haVipId;
    }

    public UnassociateHaVipRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
