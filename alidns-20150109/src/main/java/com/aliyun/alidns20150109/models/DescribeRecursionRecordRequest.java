// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecursionRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1917628665627259904</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    public static DescribeRecursionRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecursionRecordRequest self = new DescribeRecursionRecordRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecursionRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
