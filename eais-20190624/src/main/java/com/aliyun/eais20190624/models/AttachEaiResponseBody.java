// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class AttachEaiResponseBody extends TeaModel {
    @NameInMap("ClientInstanceId")
    public String clientInstanceId;

    @NameInMap("ElasticAcceleratedInstanceId")
    public String elasticAcceleratedInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static AttachEaiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachEaiResponseBody self = new AttachEaiResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachEaiResponseBody setClientInstanceId(String clientInstanceId) {
        this.clientInstanceId = clientInstanceId;
        return this;
    }
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    public AttachEaiResponseBody setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
        this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
        return this;
    }
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    public AttachEaiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
