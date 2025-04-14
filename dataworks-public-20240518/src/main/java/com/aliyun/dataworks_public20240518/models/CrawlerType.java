// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CrawlerType extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Data Lake Formation</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("SupportedEntityTypes")
    public java.util.List<CrawlerTypeSupportedEntityTypes> supportedEntityTypes;

    /**
     * <strong>example:</strong>
     * <p>dlf</p>
     */
    @NameInMap("Type")
    public String type;

    public static CrawlerType build(java.util.Map<String, ?> map) throws Exception {
        CrawlerType self = new CrawlerType();
        return TeaModel.build(map, self);
    }

    public CrawlerType setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CrawlerType setSupportedEntityTypes(java.util.List<CrawlerTypeSupportedEntityTypes> supportedEntityTypes) {
        this.supportedEntityTypes = supportedEntityTypes;
        return this;
    }
    public java.util.List<CrawlerTypeSupportedEntityTypes> getSupportedEntityTypes() {
        return this.supportedEntityTypes;
    }

    public CrawlerType setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CrawlerTypeSupportedEntityTypes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>如对于maxcompute-schema类型，schema层级是否存在可选（是否开启三层模型）</p>
         */
        @NameInMap("Optional")
        public Boolean optional;

        /**
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("ParentSubType")
        public String parentSubType;

        /**
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <strong>example:</strong>
         * <p>dlf-table</p>
         */
        @NameInMap("Type")
        public String type;

        public static CrawlerTypeSupportedEntityTypes build(java.util.Map<String, ?> map) throws Exception {
            CrawlerTypeSupportedEntityTypes self = new CrawlerTypeSupportedEntityTypes();
            return TeaModel.build(map, self);
        }

        public CrawlerTypeSupportedEntityTypes setOptional(Boolean optional) {
            this.optional = optional;
            return this;
        }
        public Boolean getOptional() {
            return this.optional;
        }

        public CrawlerTypeSupportedEntityTypes setParentSubType(String parentSubType) {
            this.parentSubType = parentSubType;
            return this;
        }
        public String getParentSubType() {
            return this.parentSubType;
        }

        public CrawlerTypeSupportedEntityTypes setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public CrawlerTypeSupportedEntityTypes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
