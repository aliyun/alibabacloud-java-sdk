// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordWeightRequest extends TeaModel {
    /**
     * <p>The client token that ensures the idempotence of the request. Generate a unique token for each request. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The unique ID of the DNS record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17363242424</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The weight. The value can be an integer from 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static UpdateRecursionRecordWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordWeightRequest self = new UpdateRecursionRecordWeightRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordWeightRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecursionRecordWeightRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateRecursionRecordWeightRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
