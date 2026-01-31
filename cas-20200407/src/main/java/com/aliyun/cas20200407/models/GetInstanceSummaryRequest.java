// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static GetInstanceSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryRequest self = new GetInstanceSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
