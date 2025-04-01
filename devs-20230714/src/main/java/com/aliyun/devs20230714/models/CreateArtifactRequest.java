// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreateArtifactRequest extends TeaModel {
    @NameInMap("body")
    public Artifact body;

    public static CreateArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactRequest self = new CreateArtifactRequest();
        return TeaModel.build(map, self);
    }

    public CreateArtifactRequest setBody(Artifact body) {
        this.body = body;
        return this;
    }
    public Artifact getBody() {
        return this.body;
    }

}
