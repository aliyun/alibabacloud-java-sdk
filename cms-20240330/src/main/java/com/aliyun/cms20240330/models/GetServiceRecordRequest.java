// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceRecordRequest extends TeaModel {
    /**
     * <p>The type of the linked entry. Currently supported values:
     * logCorrelation: indicates application log association.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logCorrelation</p>
     */
    @NameInMap("recordType")
    public String recordType;

    public static GetServiceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRecordRequest self = new GetServiceRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceRecordRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

}
