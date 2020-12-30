// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterTemplateId")
    public String clusterTemplateId;

    public static ModifyClusterTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterTemplateResponseBody self = new ModifyClusterTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyClusterTemplateResponseBody setClusterTemplateId(String clusterTemplateId) {
        this.clusterTemplateId = clusterTemplateId;
        return this;
    }
    public String getClusterTemplateId() {
        return this.clusterTemplateId;
    }

}
