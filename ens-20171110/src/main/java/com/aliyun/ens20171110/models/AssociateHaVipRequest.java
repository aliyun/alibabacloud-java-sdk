// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateHaVipRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>havip-5p14t****</p>
     */
    @NameInMap("HaVipId")
    public String haVipId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-50c4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>EnsInstance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static AssociateHaVipRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateHaVipRequest self = new AssociateHaVipRequest();
        return TeaModel.build(map, self);
    }

    public AssociateHaVipRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }
    public String getHaVipId() {
        return this.haVipId;
    }

    public AssociateHaVipRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateHaVipRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
