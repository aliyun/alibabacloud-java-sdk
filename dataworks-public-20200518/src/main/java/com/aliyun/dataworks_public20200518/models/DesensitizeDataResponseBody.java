// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DesensitizeDataResponseBody extends TeaModel {
    @NameInMap("DesensitizeData")
    public String desensitizeData;

    @NameInMap("RequestId")
    public String requestId;

    public static DesensitizeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DesensitizeDataResponseBody self = new DesensitizeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DesensitizeDataResponseBody setDesensitizeData(String desensitizeData) {
        this.desensitizeData = desensitizeData;
        return this;
    }
    public String getDesensitizeData() {
        return this.desensitizeData;
    }

    public DesensitizeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
