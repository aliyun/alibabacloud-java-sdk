// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteRecursionRecordRequest extends TeaModel {
    /**
     * <p>The client token that ensures the idempotence of the request. The client generates this value. It must be unique across requests. The value can be up to 64 ASCII characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the DNS record. This is the unique identifier for the record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17432432424</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    public static DeleteRecursionRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecursionRecordRequest self = new DeleteRecursionRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecursionRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteRecursionRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
