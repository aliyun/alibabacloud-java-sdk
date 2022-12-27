// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNCInformationRequest extends TeaModel {
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("ResourceId")
    public String resourceId;

    public static DescribeNCInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNCInformationRequest self = new DescribeNCInformationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNCInformationRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeNCInformationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
