// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDNSSLBWeightResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("Weight")
    public Integer weight;

    public static UpdateDNSSLBWeightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSSLBWeightResponseBody self = new UpdateDNSSLBWeightResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDNSSLBWeightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDNSSLBWeightResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateDNSSLBWeightResponseBody setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
