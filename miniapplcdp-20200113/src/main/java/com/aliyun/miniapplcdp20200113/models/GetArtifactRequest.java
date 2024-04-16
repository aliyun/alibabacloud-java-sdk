// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetArtifactRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ArtifactId")
    public String artifactId;

    @NameInMap("Source")
    public String source;

    public static GetArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactRequest self = new GetArtifactRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetArtifactRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public GetArtifactRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
