// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class BuildCacheConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{ 	&quot;3C75C832-0EAD-40D6-8FA1-2BA9171C926B&quot;: &quot;<del>/.npm&quot;, 	&quot;D256BB7A-1886-4A19-A75B-A1FDC23D5A00&quot;: &quot;</del>/.cache&quot; }</p>
     */
    @NameInMap("keyPath")
    public java.util.Map<String, ?> keyPath;

    @NameInMap("paths")
    public java.util.List<String> paths;

    public static BuildCacheConfig build(java.util.Map<String, ?> map) throws Exception {
        BuildCacheConfig self = new BuildCacheConfig();
        return TeaModel.build(map, self);
    }

    public BuildCacheConfig setKeyPath(java.util.Map<String, ?> keyPath) {
        this.keyPath = keyPath;
        return this;
    }
    public java.util.Map<String, ?> getKeyPath() {
        return this.keyPath;
    }

    public BuildCacheConfig setPaths(java.util.List<String> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<String> getPaths() {
        return this.paths;
    }

}
