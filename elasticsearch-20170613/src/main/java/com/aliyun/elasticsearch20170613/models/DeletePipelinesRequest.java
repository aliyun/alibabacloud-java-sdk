// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeletePipelinesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    @NameInMap("pipelineIds")
    public String pipelineIds;

    public static DeletePipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelinesRequest self = new DeletePipelinesRequest();
        return TeaModel.build(map, self);
    }

    public DeletePipelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeletePipelinesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public DeletePipelinesRequest setPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }
    public String getPipelineIds() {
        return this.pipelineIds;
    }

}
