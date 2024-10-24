// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eais-sz8t15a7gt7z7j7i****</p>
     */
    @NameInMap("ElasticAcceleratedInstanceId")
    public String elasticAcceleratedInstanceId;

    /**
     * <strong>example:</strong>
     * <p>A655AB0E-31BB-45AD-9255-FCE93F6*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEaiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiResponseBody self = new CreateEaiResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEaiResponseBody setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
        this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
        return this;
    }
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    public CreateEaiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
