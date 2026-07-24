// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineBuildRequest extends TeaModel {
    /**
     * <p>The OSS object URL. This parameter is required in upload mode but is not required in git mode.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bucket.oss-.aliyuncs.com/key">https://bucket.oss-.aliyuncs.com/key</a></p>
     */
    @NameInMap("ArtifactUrl")
    public String artifactUrl;

    /**
     * <p>The name of the branch to build. This parameter is not required in upload mode but is required in git mode.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("Branch")
    public String branch;

    /**
     * <p>The ER name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rwa-test</p>
     */
    @NameInMap("RoutineName")
    public String routineName;

    public static CreateRoutineBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineBuildRequest self = new CreateRoutineBuildRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineBuildRequest setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
        return this;
    }
    public String getArtifactUrl() {
        return this.artifactUrl;
    }

    public CreateRoutineBuildRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateRoutineBuildRequest setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

}
