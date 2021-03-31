// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ScanSensitiveDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Sensitives")
    @Validation(required = true)
    public java.util.Map<String, ?> sensitives;

    public static ScanSensitiveDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanSensitiveDataResponse self = new ScanSensitiveDataResponse();
        return TeaModel.build(map, self);
    }

    public ScanSensitiveDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanSensitiveDataResponse setSensitives(java.util.Map<String, ?> sensitives) {
        this.sensitives = sensitives;
        return this;
    }
    public java.util.Map<String, ?> getSensitives() {
        return this.sensitives;
    }

}
