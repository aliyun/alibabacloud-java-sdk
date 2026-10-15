// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BTemplateTag extends TeaModel {
    /**
     * <p>The ID of the template build associated with the tag.</p>
     * 
     * <strong>example:</strong>
     * <p>your-build-id</p>
     */
    @NameInMap("buildID")
    public String buildID;

    /**
     * <p>The creation time of the tag.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The name of the template tag.</p>
     * 
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("tag")
    public String tag;

    public static E2BTemplateTag build(java.util.Map<String, ?> map) throws Exception {
        E2BTemplateTag self = new E2BTemplateTag();
        return TeaModel.build(map, self);
    }

    public E2BTemplateTag setBuildID(String buildID) {
        this.buildID = buildID;
        return this;
    }
    public String getBuildID() {
        return this.buildID;
    }

    public E2BTemplateTag setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public E2BTemplateTag setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
