// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CommitFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Option")
    public CommitFileRequestOption option;

    /**
     * <strong>example:</strong>
     * <p>dentryUuid</p>
     */
    @NameInMap("ParentDentryUuid")
    public String parentDentryUuid;

    @NameInMap("TenantContext")
    public CommitFileRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>upload_key</p>
     */
    @NameInMap("UploadKey")
    public String uploadKey;

    public static CommitFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitFileRequest self = new CommitFileRequest();
        return TeaModel.build(map, self);
    }

    public CommitFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CommitFileRequest setOption(CommitFileRequestOption option) {
        this.option = option;
        return this;
    }
    public CommitFileRequestOption getOption() {
        return this.option;
    }

    public CommitFileRequest setParentDentryUuid(String parentDentryUuid) {
        this.parentDentryUuid = parentDentryUuid;
        return this;
    }
    public String getParentDentryUuid() {
        return this.parentDentryUuid;
    }

    public CommitFileRequest setTenantContext(CommitFileRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CommitFileRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CommitFileRequest setUploadKey(String uploadKey) {
        this.uploadKey = uploadKey;
        return this;
    }
    public String getUploadKey() {
        return this.uploadKey;
    }

    public static class CommitFileRequestOptionAppProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>property_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>property_value</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static CommitFileRequestOptionAppProperties build(java.util.Map<String, ?> map) throws Exception {
            CommitFileRequestOptionAppProperties self = new CommitFileRequestOptionAppProperties();
            return TeaModel.build(map, self);
        }

        public CommitFileRequestOptionAppProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CommitFileRequestOptionAppProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CommitFileRequestOptionAppProperties setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class CommitFileRequestOption extends TeaModel {
        @NameInMap("AppProperties")
        public java.util.List<CommitFileRequestOptionAppProperties> appProperties;

        /**
         * <strong>example:</strong>
         * <p>AUTO_RENAME</p>
         */
        @NameInMap("ConflictStrategy")
        public String conflictStrategy;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConvertToOnlineDoc")
        public Boolean convertToOnlineDoc;

        /**
         * <strong>example:</strong>
         * <p>DOC</p>
         */
        @NameInMap("ConvertToOnlineDocTargetDocumentType")
        public String convertToOnlineDocTargetDocumentType;

        /**
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("Size")
        public Long size;

        public static CommitFileRequestOption build(java.util.Map<String, ?> map) throws Exception {
            CommitFileRequestOption self = new CommitFileRequestOption();
            return TeaModel.build(map, self);
        }

        public CommitFileRequestOption setAppProperties(java.util.List<CommitFileRequestOptionAppProperties> appProperties) {
            this.appProperties = appProperties;
            return this;
        }
        public java.util.List<CommitFileRequestOptionAppProperties> getAppProperties() {
            return this.appProperties;
        }

        public CommitFileRequestOption setConflictStrategy(String conflictStrategy) {
            this.conflictStrategy = conflictStrategy;
            return this;
        }
        public String getConflictStrategy() {
            return this.conflictStrategy;
        }

        public CommitFileRequestOption setConvertToOnlineDoc(Boolean convertToOnlineDoc) {
            this.convertToOnlineDoc = convertToOnlineDoc;
            return this;
        }
        public Boolean getConvertToOnlineDoc() {
            return this.convertToOnlineDoc;
        }

        public CommitFileRequestOption setConvertToOnlineDocTargetDocumentType(String convertToOnlineDocTargetDocumentType) {
            this.convertToOnlineDocTargetDocumentType = convertToOnlineDocTargetDocumentType;
            return this;
        }
        public String getConvertToOnlineDocTargetDocumentType() {
            return this.convertToOnlineDocTargetDocumentType;
        }

        public CommitFileRequestOption setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class CommitFileRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CommitFileRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CommitFileRequestTenantContext self = new CommitFileRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CommitFileRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
