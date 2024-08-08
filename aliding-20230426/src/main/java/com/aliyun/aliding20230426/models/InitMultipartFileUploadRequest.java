// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InitMultipartFileUploadRequest extends TeaModel {
    @NameInMap("Option")
    public InitMultipartFileUploadRequestOption option;

    /**
     * <strong>example:</strong>
     * <p>dentryUuid</p>
     */
    @NameInMap("ParentDentryUuid")
    public String parentDentryUuid;

    @NameInMap("TenantContext")
    public InitMultipartFileUploadRequestTenantContext tenantContext;

    public static InitMultipartFileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        InitMultipartFileUploadRequest self = new InitMultipartFileUploadRequest();
        return TeaModel.build(map, self);
    }

    public InitMultipartFileUploadRequest setOption(InitMultipartFileUploadRequestOption option) {
        this.option = option;
        return this;
    }
    public InitMultipartFileUploadRequestOption getOption() {
        return this.option;
    }

    public InitMultipartFileUploadRequest setParentDentryUuid(String parentDentryUuid) {
        this.parentDentryUuid = parentDentryUuid;
        return this;
    }
    public String getParentDentryUuid() {
        return this.parentDentryUuid;
    }

    public InitMultipartFileUploadRequest setTenantContext(InitMultipartFileUploadRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public InitMultipartFileUploadRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class InitMultipartFileUploadRequestOptionPreCheckParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Long size;

        public static InitMultipartFileUploadRequestOptionPreCheckParam build(java.util.Map<String, ?> map) throws Exception {
            InitMultipartFileUploadRequestOptionPreCheckParam self = new InitMultipartFileUploadRequestOptionPreCheckParam();
            return TeaModel.build(map, self);
        }

        public InitMultipartFileUploadRequestOptionPreCheckParam setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public InitMultipartFileUploadRequestOptionPreCheckParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InitMultipartFileUploadRequestOptionPreCheckParam setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public InitMultipartFileUploadRequestOptionPreCheckParam setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class InitMultipartFileUploadRequestOption extends TeaModel {
        @NameInMap("PreCheckParam")
        public InitMultipartFileUploadRequestOptionPreCheckParam preCheckParam;

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

        public static InitMultipartFileUploadRequestOption build(java.util.Map<String, ?> map) throws Exception {
            InitMultipartFileUploadRequestOption self = new InitMultipartFileUploadRequestOption();
            return TeaModel.build(map, self);
        }

        public InitMultipartFileUploadRequestOption setPreCheckParam(InitMultipartFileUploadRequestOptionPreCheckParam preCheckParam) {
            this.preCheckParam = preCheckParam;
            return this;
        }
        public InitMultipartFileUploadRequestOptionPreCheckParam getPreCheckParam() {
            return this.preCheckParam;
        }

        public InitMultipartFileUploadRequestOption setPreferRegion(String preferRegion) {
            this.preferRegion = preferRegion;
            return this;
        }
        public String getPreferRegion() {
            return this.preferRegion;
        }

        public InitMultipartFileUploadRequestOption setStorageDriver(String storageDriver) {
            this.storageDriver = storageDriver;
            return this;
        }
        public String getStorageDriver() {
            return this.storageDriver;
        }

    }

    public static class InitMultipartFileUploadRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static InitMultipartFileUploadRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            InitMultipartFileUploadRequestTenantContext self = new InitMultipartFileUploadRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public InitMultipartFileUploadRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
