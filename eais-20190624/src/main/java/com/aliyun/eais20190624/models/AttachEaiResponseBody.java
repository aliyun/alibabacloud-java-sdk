// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class AttachEaiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i-wz93g6pyat2g7t7o****</p>
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
     * <p>C3BCB7DA-BEB6-4982-A765-6EA61EC84474</p>
     */
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
