// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreatePipelineNodeInstanceRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Params")
    public String params;

    public static CreatePipelineNodeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineNodeInstanceRequest self = new CreatePipelineNodeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineNodeInstanceRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public CreatePipelineNodeInstanceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
