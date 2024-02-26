// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFileDownloadInfoRequest extends TeaModel {
    @NameInMap("DentryId")
    public String dentryId;

    @NameInMap("Option")
    public GetFileDownloadInfoRequestOption option;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantContext")
    public GetFileDownloadInfoRequestTenantContext tenantContext;

    public static GetFileDownloadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileDownloadInfoRequest self = new GetFileDownloadInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetFileDownloadInfoRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public GetFileDownloadInfoRequest setOption(GetFileDownloadInfoRequestOption option) {
        this.option = option;
        return this;
    }
    public GetFileDownloadInfoRequestOption getOption() {
        return this.option;
    }

    public GetFileDownloadInfoRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public GetFileDownloadInfoRequest setTenantContext(GetFileDownloadInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetFileDownloadInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetFileDownloadInfoRequestOption extends TeaModel {
        @NameInMap("PreferIntranet")
        public Boolean preferIntranet;

        @NameInMap("Version")
        public Long version;

        public static GetFileDownloadInfoRequestOption build(java.util.Map<String, ?> map) throws Exception {
            GetFileDownloadInfoRequestOption self = new GetFileDownloadInfoRequestOption();
            return TeaModel.build(map, self);
        }

        public GetFileDownloadInfoRequestOption setPreferIntranet(Boolean preferIntranet) {
            this.preferIntranet = preferIntranet;
            return this;
        }
        public Boolean getPreferIntranet() {
            return this.preferIntranet;
        }

        public GetFileDownloadInfoRequestOption setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class GetFileDownloadInfoRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetFileDownloadInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetFileDownloadInfoRequestTenantContext self = new GetFileDownloadInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetFileDownloadInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
