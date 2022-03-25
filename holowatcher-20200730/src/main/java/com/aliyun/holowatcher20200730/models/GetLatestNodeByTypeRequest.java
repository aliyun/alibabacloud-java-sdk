// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetLatestNodeByTypeRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("PipelineNodeType")
    public String pipelineNodeType;

    public static GetLatestNodeByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLatestNodeByTypeRequest self = new GetLatestNodeByTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetLatestNodeByTypeRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public GetLatestNodeByTypeRequest setPipelineNodeType(String pipelineNodeType) {
        this.pipelineNodeType = pipelineNodeType;
        return this;
    }
    public String getPipelineNodeType() {
        return this.pipelineNodeType;
    }

}
