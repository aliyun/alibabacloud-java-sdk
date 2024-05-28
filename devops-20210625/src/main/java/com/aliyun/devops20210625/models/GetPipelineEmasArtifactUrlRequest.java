// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineEmasArtifactUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("serviceConnectionId")
    public Long serviceConnectionId;

    public static GetPipelineEmasArtifactUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineEmasArtifactUrlRequest self = new GetPipelineEmasArtifactUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineEmasArtifactUrlRequest setServiceConnectionId(Long serviceConnectionId) {
        this.serviceConnectionId = serviceConnectionId;
        return this;
    }
    public Long getServiceConnectionId() {
        return this.serviceConnectionId;
    }

}
