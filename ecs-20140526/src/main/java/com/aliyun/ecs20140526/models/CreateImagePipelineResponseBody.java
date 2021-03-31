// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImagePipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImagePipelineId")
    public String imagePipelineId;

    public static CreateImagePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImagePipelineResponseBody self = new CreateImagePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImagePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImagePipelineResponseBody setImagePipelineId(String imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

}
