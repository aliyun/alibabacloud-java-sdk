// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDNSSLBWeightResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    @NameInMap("Weight")
    @Validation(required = true)
    public Integer weight;

    public static UpdateDNSSLBWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSSLBWeightResponse self = new UpdateDNSSLBWeightResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDNSSLBWeightResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDNSSLBWeightResponse setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateDNSSLBWeightResponse setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
