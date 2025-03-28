// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ArtifactSpec extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom.debian10</p>
     */
    @NameInMap("runtime")
    public String runtime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC代码包、工作流yaml</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://cn-hangzhou/my-bucket/my.zip</p>
     */
    @NameInMap("uri")
    public String uri;

    public static ArtifactSpec build(java.util.Map<String, ?> map) throws Exception {
        ArtifactSpec self = new ArtifactSpec();
        return TeaModel.build(map, self);
    }

    public ArtifactSpec setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public ArtifactSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ArtifactSpec setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
