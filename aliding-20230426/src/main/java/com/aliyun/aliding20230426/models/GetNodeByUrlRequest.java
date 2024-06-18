// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeByUrlRequest extends TeaModel {
    @NameInMap("Option")
    public GetNodeByUrlRequestOption option;

    @NameInMap("TenantContext")
    public GetNodeByUrlRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://alidocs.dingtalk.com/i/nodes/EpGBa2L*********gN7R35y">https://alidocs.dingtalk.com/i/nodes/EpGBa2L*********gN7R35y</a></p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WithPermissionRole")
        public Boolean withPermissionRole;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
