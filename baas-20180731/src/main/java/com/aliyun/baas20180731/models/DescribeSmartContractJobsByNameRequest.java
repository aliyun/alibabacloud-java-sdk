// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractJobsByNameRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Size")
    public Integer size;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Start")
    public Integer start;

    public static DescribeSmartContractJobsByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractJobsByNameRequest self = new DescribeSmartContractJobsByNameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractJobsByNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSmartContractJobsByNameRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public DescribeSmartContractJobsByNameRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
