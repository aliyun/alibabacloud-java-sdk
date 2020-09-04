// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreatePublishPlanWithPipelineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PublishPlanBid")
    @Validation(required = true)
    public String publishPlanBid;

    @NameInMap("PipelineId")
    @Validation(required = true)
    public String pipelineId;

    public static CreatePublishPlanWithPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishPlanWithPipelineResponse self = new CreatePublishPlanWithPipelineResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublishPlanWithPipelineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePublishPlanWithPipelineResponse setPublishPlanBid(String publishPlanBid) {
        this.publishPlanBid = publishPlanBid;
        return this;
    }
    public String getPublishPlanBid() {
        return this.publishPlanBid;
    }

    public CreatePublishPlanWithPipelineResponse setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
