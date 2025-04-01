// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutArtifactRequest extends TeaModel {
    @NameInMap("body")
    public Artifact body;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("force")
    public Boolean force;

    public static PutArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        PutArtifactRequest self = new PutArtifactRequest();
        return TeaModel.build(map, self);
    }

    public PutArtifactRequest setBody(Artifact body) {
        this.body = body;
        return this;
    }
    public Artifact getBody() {
        return this.body;
    }

    public PutArtifactRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
