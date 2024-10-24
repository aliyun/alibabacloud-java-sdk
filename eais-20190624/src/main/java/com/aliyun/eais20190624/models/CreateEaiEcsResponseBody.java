// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiEcsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i-bp1hjrvleawl4ogb****</p>
     */
    @NameInMap("ClientInstanceId")
    public String clientInstanceId;

    /**
     * <strong>example:</strong>
     * <p>eais-sz8t15a7gt7z7j7i****</p>
     */
    @NameInMap("ElasticAcceleratedInstanceId")
    public String elasticAcceleratedInstanceId;

    /**
     * <strong>example:</strong>
     * <p>F5FEB9AA-C108-577C-AB3D-D13524AF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEaiEcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiEcsResponseBody self = new CreateEaiEcsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEaiEcsResponseBody setClientInstanceId(String clientInstanceId) {
        this.clientInstanceId = clientInstanceId;
        return this;
    }
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    public CreateEaiEcsResponseBody setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
        this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
        return this;
    }
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    public CreateEaiEcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
