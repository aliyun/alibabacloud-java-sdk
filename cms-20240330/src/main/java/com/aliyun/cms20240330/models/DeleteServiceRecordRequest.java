// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteServiceRecordRequest extends TeaModel {
    /**
     * <p>The type of the association entry. Valid values:
     * logCorrelation: application log association</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logCorrelation</p>
     */
    @NameInMap("recordType")
    public String recordType;

    public static DeleteServiceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceRecordRequest self = new DeleteServiceRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceRecordRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

}
