// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterShrinkRequest extends TeaModel {
    @NameInMap("keep_slb")
    public Boolean keepSlb;

    @NameInMap("retain_all_resources")
    public Boolean retainAllResources;

    @NameInMap("retain_resources")
    public String retainResourcesShrink;

    public static DeleteClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterShrinkRequest self = new DeleteClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterShrinkRequest setKeepSlb(Boolean keepSlb) {
        this.keepSlb = keepSlb;
        return this;
    }
    public Boolean getKeepSlb() {
        return this.keepSlb;
    }

    public DeleteClusterShrinkRequest setRetainAllResources(Boolean retainAllResources) {
        this.retainAllResources = retainAllResources;
        return this;
    }
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    public DeleteClusterShrinkRequest setRetainResourcesShrink(String retainResourcesShrink) {
        this.retainResourcesShrink = retainResourcesShrink;
        return this;
    }
    public String getRetainResourcesShrink() {
        return this.retainResourcesShrink;
    }

}
