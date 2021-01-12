// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20210105.models;

import com.aliyun.tea.*;

public class OpenApiInvokeRequest extends TeaModel {
    // 服务Id
    @NameInMap("serviceId")
    public String serviceId;

    // 类型，EXPERIMENT-画布,NODE-节点
    @NameInMap("type")
    public String type;

    // 节点id
    @NameInMap("nodeId")
    public String nodeId;

    @NameInMap("params")
    public String params;

    // 任务id，需要全局唯一
    @NameInMap("jobId")
    public String jobId;

    public static OpenApiInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiInvokeRequest self = new OpenApiInvokeRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiInvokeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public OpenApiInvokeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OpenApiInvokeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public OpenApiInvokeRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public OpenApiInvokeRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
