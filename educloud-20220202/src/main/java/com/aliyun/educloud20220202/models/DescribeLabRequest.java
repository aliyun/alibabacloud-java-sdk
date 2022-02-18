// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeLabRequest extends TeaModel {
    @NameInMap("LabId")
    public String labId;

    public static DescribeLabRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabRequest self = new DescribeLabRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLabRequest setLabId(String labId) {
        this.labId = labId;
        return this;
    }
    public String getLabId() {
        return this.labId;
    }

}
