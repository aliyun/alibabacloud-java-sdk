// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DesensitizeDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DesensitizeData")
    @Validation(required = true)
    public String desensitizeData;

    public static DesensitizeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DesensitizeDataResponse self = new DesensitizeDataResponse();
        return TeaModel.build(map, self);
    }

    public DesensitizeDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DesensitizeDataResponse setDesensitizeData(String desensitizeData) {
        this.desensitizeData = desensitizeData;
        return this;
    }
    public String getDesensitizeData() {
        return this.desensitizeData;
    }

}
