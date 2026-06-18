// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BTemplateTag extends TeaModel {
    @NameInMap("buildID")
    public String buildID;

    @NameInMap("createdAt")
    public String createdAt;

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
