// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UploadMediaRequest extends TeaModel {
    @NameInMap("TenantContext")
    public UploadMediaRequestTenantContext tenantContext;

    @NameInMap("mediaName")
    public String mediaName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("mediaType")
    public String mediaType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("orgId")
    public Long orgId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("url")
    public String url;

    public static UploadMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaRequest self = new UploadMediaRequest();
        return TeaModel.build(map, self);
    }

    public UploadMediaRequest setTenantContext(UploadMediaRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UploadMediaRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UploadMediaRequest setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public UploadMediaRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public UploadMediaRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public UploadMediaRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class UploadMediaRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static UploadMediaRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UploadMediaRequestTenantContext self = new UploadMediaRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UploadMediaRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
