// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDNSSLBWeightResponseBody extends TeaModel {
    /**
     * <p>The ID of the DNS record.</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The updated weight.</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static UpdateDNSSLBWeightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSSLBWeightResponseBody self = new UpdateDNSSLBWeightResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDNSSLBWeightResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateDNSSLBWeightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDNSSLBWeightResponseBody setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
