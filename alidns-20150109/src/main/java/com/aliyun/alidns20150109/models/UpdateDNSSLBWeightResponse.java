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

}
