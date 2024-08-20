// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineRelatedDomainsRequest extends TeaModel {
    /**
     * <p>The name of the routine. The name is unique in the same account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>routine_test</p>
     */
    @NameInMap("Name")
    public String name;

    public static DescribeRoutineRelatedDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineRelatedDomainsRequest self = new DescribeRoutineRelatedDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineRelatedDomainsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
