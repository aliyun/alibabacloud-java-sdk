// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFileUploadInfoRequest extends TeaModel {
    @NameInMap("Option")
    public GetFileUploadInfoRequestOption option;

    /**
     * <strong>example:</strong>
     * <p>dentryUuid</p>
     */
    @NameInMap("ParentDentryUuid")
    public String parentDentryUuid;

    /**
     * <strong>example:</strong>
     * <p>HEADER_SIGNATURE</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("TenantContext")
    public GetFileUploadInfoRequestTenantContext tenantContext;

    public static GetFileUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileUploadInfoRequest self = new GetFileUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetFileUploadInfoRequest setOption(GetFileUploadInfoRequestOption option) {
        this.option = option;
        return this;
    }
    public GetFileUploadInfoRequestOption getOption() {
        return this.option;
    }

    public GetFileUploadInfoRequest setParentDentryUuid(String parentDentryUuid) {
        this.parentDentryUuid = parentDentryUuid;
        return this;
    }
    public String getParentDentryUuid() {
        return this.parentDentryUuid;
    }

    public GetFileUploadInfoRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetFileUploadInfoRequest setTenantContext(GetFileUploadInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetFileUploadInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetFileUploadInfoRequestOptionPreCheckParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Size")
        public Long size;

        public static GetFileUploadInfoRequestOptionPreCheckParam build(java.util.Map<String, ?> map) throws Exception {
            GetFileUploadInfoRequestOptionPreCheckParam self = new GetFileUploadInfoRequestOptionPreCheckParam();
            return TeaModel.build(map, self);
        }

        public GetFileUploadInfoRequestOptionPreCheckParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFileUploadInfoRequestOptionPreCheckParam setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class GetFileUploadInfoRequestOption extends TeaModel {
        @NameInMap("PreCheckParam")
        public GetFileUploadInfoRequestOptionPreCheckParam preCheckParam;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PreferIntranet")
        public Boolean preferIntranet;

        /**
         * <strong>example:</strong>
         * <p>ZHANGJIAKOU</p>
         */
        @NameInMap("PreferRegion")
        public String preferRegion;

        /**
         * <strong>example:</strong>
         * <p>DINGTALK</p>
         */
        @NameInMap("StorageDriver")
        public String storageDriver;

        public static GetFileUploadInfoRequestOption build(java.util.Map<String, ?> map) throws Exception {
            GetFileUploadInfoRequestOption self = new GetFileUploadInfoRequestOption();
            return TeaModel.build(map, self);
        }

        public GetFileUploadInfoRequestOption setPreCheckParam(GetFileUploadInfoRequestOptionPreCheckParam preCheckParam) {
            this.preCheckParam = preCheckParam;
            return this;
        }
        public GetFileUploadInfoRequestOptionPreCheckParam getPreCheckParam() {
            return this.preCheckParam;
        }

        public GetFileUploadInfoRequestOption setPreferIntranet(Boolean preferIntranet) {
            this.preferIntranet = preferIntranet;
            return this;
        }
        public Boolean getPreferIntranet() {
            return this.preferIntranet;
        }

        public GetFileUploadInfoRequestOption setPreferRegion(String preferRegion) {
            this.preferRegion = preferRegion;
            return this;
        }
        public String getPreferRegion() {
            return this.preferRegion;
        }

        public GetFileUploadInfoRequestOption setStorageDriver(String storageDriver) {
            this.storageDriver = storageDriver;
            return this;
        }
        public String getStorageDriver() {
            return this.storageDriver;
        }

    }

    public static class GetFileUploadInfoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetFileUploadInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetFileUploadInfoRequestTenantContext self = new GetFileUploadInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetFileUploadInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
