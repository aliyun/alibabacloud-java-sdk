// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiEciResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eci-2zeh03ygxlrzmfi6****</p>
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

    public static CreateEaiEciResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiEciResponseBody self = new CreateEaiEciResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEaiEciResponseBody setClientInstanceId(String clientInstanceId) {
        this.clientInstanceId = clientInstanceId;
        return this;
    }
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    public CreateEaiEciResponseBody setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
        this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
        return this;
    }
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    public CreateEaiEciResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
