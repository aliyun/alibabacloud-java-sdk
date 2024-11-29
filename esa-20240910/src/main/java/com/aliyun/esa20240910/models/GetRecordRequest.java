// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRecordRequest extends TeaModel {
    /**
     * <p>The record ID, which can be obtained by calling <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    public static GetRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordRequest self = new GetRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

}
