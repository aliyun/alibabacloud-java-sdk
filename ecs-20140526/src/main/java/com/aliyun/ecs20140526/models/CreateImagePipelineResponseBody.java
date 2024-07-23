// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImagePipelineResponseBody extends TeaModel {
    /**
     * <p>The ID of the image template.</p>
     * 
     * <strong>example:</strong>
     * <p>ip-2ze5tsl5bp6nf2b3****</p>
     */
    @NameInMap("ImagePipelineId")
    public String imagePipelineId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateImagePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImagePipelineResponseBody self = new CreateImagePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImagePipelineResponseBody setImagePipelineId(String imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

    public CreateImagePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
