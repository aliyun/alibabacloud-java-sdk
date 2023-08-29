// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeByUrlRequest extends TeaModel {
    @NameInMap("Option")
    public GetNodeByUrlRequestOption option;

    @NameInMap("TenantContext")
    public GetNodeByUrlRequestTenantContext tenantContext;

    @NameInMap("Url")
    public String url;

    public static GetNodeByUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeByUrlRequest self = new GetNodeByUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeByUrlRequest setOption(GetNodeByUrlRequestOption option) {
        this.option = option;
        return this;
    }
    public GetNodeByUrlRequestOption getOption() {
        return this.option;
    }

    public GetNodeByUrlRequest setTenantContext(GetNodeByUrlRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetNodeByUrlRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetNodeByUrlRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class GetNodeByUrlRequestOption extends TeaModel {
        @NameInMap("WithPermissionRole")
        public Boolean withPermissionRole;

        @NameInMap("WithStatisticalInfo")
        public Boolean withStatisticalInfo;

        public static GetNodeByUrlRequestOption build(java.util.Map<String, ?> map) throws Exception {
            GetNodeByUrlRequestOption self = new GetNodeByUrlRequestOption();
            return TeaModel.build(map, self);
        }

        public GetNodeByUrlRequestOption setWithPermissionRole(Boolean withPermissionRole) {
            this.withPermissionRole = withPermissionRole;
            return this;
        }
        public Boolean getWithPermissionRole() {
            return this.withPermissionRole;
        }

        public GetNodeByUrlRequestOption setWithStatisticalInfo(Boolean withStatisticalInfo) {
            this.withStatisticalInfo = withStatisticalInfo;
            return this;
        }
        public Boolean getWithStatisticalInfo() {
            return this.withStatisticalInfo;
        }

    }

    public static class GetNodeByUrlRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetNodeByUrlRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetNodeByUrlRequestTenantContext self = new GetNodeByUrlRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetNodeByUrlRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
