// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeCustomOcrTemplateRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    public static DescribeCustomOcrTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomOcrTemplateRequest self = new DescribeCustomOcrTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomOcrTemplateRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
