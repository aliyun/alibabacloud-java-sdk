// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DescribeQuotaRequest extends TeaModel {
    @NameInMap("tagValue")
    public String tagValue;

    public static DescribeQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuotaRequest self = new DescribeQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQuotaRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
