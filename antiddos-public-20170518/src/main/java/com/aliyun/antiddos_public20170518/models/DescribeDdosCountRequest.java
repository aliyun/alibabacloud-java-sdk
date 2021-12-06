// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCountRequest extends TeaModel {
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    @NameInMap("InstanceType")
    public String instanceType;

    public static DescribeDdosCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosCountRequest self = new DescribeDdosCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosCountRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeDdosCountRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
