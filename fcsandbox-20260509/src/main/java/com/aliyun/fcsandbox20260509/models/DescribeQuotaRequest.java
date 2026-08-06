// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DescribeQuotaRequest extends TeaModel {
    /**
     * <p>Team ID</p>
     * 
     * <strong>example:</strong>
     * <p>f79d6a95-abcd-47a8-9167-eccf0622a998</p>
     */
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
