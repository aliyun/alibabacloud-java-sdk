// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeLabRequest extends TeaModel {
    @NameInMap("LabId")
    public Long labId;

    public static DescribeLabRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabRequest self = new DescribeLabRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLabRequest setLabId(Long labId) {
        this.labId = labId;
        return this;
    }
    public Long getLabId() {
        return this.labId;
    }

}
