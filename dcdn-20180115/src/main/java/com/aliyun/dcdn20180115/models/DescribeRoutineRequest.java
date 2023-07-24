// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineRequest extends TeaModel {
    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    public static DescribeRoutineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineRequest self = new DescribeRoutineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
