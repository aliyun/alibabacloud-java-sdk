// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class PushMeteringDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;StartTime\&quot;:1681264800,\&quot;EndTime\&quot;:1681268400,\&quot;Entities\&quot;:[{\&quot;Key\&quot;:\&quot;Unit\&quot;,\&quot;Value\&quot;:\&quot;0\&quot;}]}]</p>
     */
    @NameInMap("Metering")
    public String metering;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-0e6fca6a51a54420****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static PushMeteringDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataRequest self = new PushMeteringDataRequest();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataRequest setMetering(String metering) {
        this.metering = metering;
        return this;
    }
    public String getMetering() {
        return this.metering;
    }

    public PushMeteringDataRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
