// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImagePipelineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImagePipelineId")
    @Validation(required = true)
    public String imagePipelineId;

    public static CreateImagePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImagePipelineResponse self = new CreateImagePipelineResponse();
        return TeaModel.build(map, self);
    }

    public CreateImagePipelineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImagePipelineResponse setImagePipelineId(String imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

}
