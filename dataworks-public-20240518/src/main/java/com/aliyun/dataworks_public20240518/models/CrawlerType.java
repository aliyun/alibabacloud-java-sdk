// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CrawlerType extends TeaModel {
    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>Data Lake Formation</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The list of supported entity types. The entity types have a top-down hierarchical relationship based on their declaration order.</p>
     */
    @NameInMap("SupportedEntityTypes")
    public java.util.List<CrawlerTypeSupportedEntityTypes> supportedEntityTypes;

    /**
     * <p>The type identifier.</p>
     * 
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
         * <p>Indicates whether the entity type is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>For example, for the maxcompute-schema type, whether the schema level is optional (whether the three-layer model is enabled)</p>
         */
        @NameInMap("Optional")
        public Boolean optional;

        /**
         * <p>The entity subtype of the parent level. The value is null if no parent level exists.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("ParentSubType")
        public String parentSubType;

        /**
         * <p>The entity subtype identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The entity type identifier, which is related to the crawler type. The format is (CrawlerType)-{SubType}.</p>
         * 
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
