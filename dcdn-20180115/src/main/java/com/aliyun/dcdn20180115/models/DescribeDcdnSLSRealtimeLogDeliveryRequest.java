// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSLSRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProjectName")
    public String projectName;

    public static DescribeDcdnSLSRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSLSRealtimeLogDeliveryRequest self = new DescribeDcdnSLSRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSLSRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnSLSRealtimeLogDeliveryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
