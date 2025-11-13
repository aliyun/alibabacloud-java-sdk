// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordWeightRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>17363242424</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
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
