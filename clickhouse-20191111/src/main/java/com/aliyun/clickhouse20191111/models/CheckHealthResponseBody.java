// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckHealthResponseBody extends TeaModel {
    @NameInMap("Info")
    public String info;

    @NameInMap("IsHealthy")
    public Boolean isHealthy;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckHealthResponseBody self = new CheckHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckHealthResponseBody setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public CheckHealthResponseBody setIsHealthy(Boolean isHealthy) {
        this.isHealthy = isHealthy;
        return this;
    }
    public Boolean getIsHealthy() {
        return this.isHealthy;
    }

    public CheckHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
