// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiJupyterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eais-hz8t15a7gt7z7j7i****</p>
     */
    @NameInMap("ElasticAcceleratedInstanceId")
    public String elasticAcceleratedInstanceId;

    /**
     * <strong>example:</strong>
     * <p>A655AB0E-31BB-45AD-9255-FCE93F6*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEaiJupyterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiJupyterResponseBody self = new CreateEaiJupyterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEaiJupyterResponseBody setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
        this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
        return this;
    }
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    public CreateEaiJupyterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
