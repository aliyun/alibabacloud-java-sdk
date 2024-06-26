// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Start")
    public Integer start;

    public static DescribeSmartContractJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractJobsRequest self = new DescribeSmartContractJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractJobsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public DescribeSmartContractJobsRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
