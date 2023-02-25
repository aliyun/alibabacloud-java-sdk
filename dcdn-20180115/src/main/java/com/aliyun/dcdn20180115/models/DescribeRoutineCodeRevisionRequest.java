// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineCodeRevisionRequest extends TeaModel {
    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The version of the JavaScript code that you want to query.</p>
     */
    @NameInMap("SelectCodeRevision")
    public String selectCodeRevision;

    public static DescribeRoutineCodeRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineCodeRevisionRequest self = new DescribeRoutineCodeRevisionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineCodeRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeRoutineCodeRevisionRequest setSelectCodeRevision(String selectCodeRevision) {
        this.selectCodeRevision = selectCodeRevision;
        return this;
    }
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

}
