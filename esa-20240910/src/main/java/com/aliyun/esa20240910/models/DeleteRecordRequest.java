// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    public static DeleteRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordRequest self = new DeleteRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

}
