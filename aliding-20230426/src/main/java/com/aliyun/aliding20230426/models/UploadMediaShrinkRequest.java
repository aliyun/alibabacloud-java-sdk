// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UploadMediaShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("mediaName")
    public String mediaName;

    @NameInMap("mediaType")
    public String mediaType;

    @NameInMap("orgId")
    public Long orgId;

    @NameInMap("url")
    public String url;

    public static UploadMediaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaShrinkRequest self = new UploadMediaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadMediaShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public UploadMediaShrinkRequest setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public UploadMediaShrinkRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public UploadMediaShrinkRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public UploadMediaShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
