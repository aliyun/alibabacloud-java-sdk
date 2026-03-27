// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CrawlerType extends TeaModel {
    /**
     * <p>The display name of the metadata crawler.</p>
     * 
     * <strong>example:</strong>
     * <p>Data Lake Formation</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The supported entity types. The entity types are sorted based on the declaration order.</p>
     */
    @NameInMap("SupportedEntityTypes")
    public java.util.List<CrawlerTypeSupportedEntityTypes> supportedEntityTypes;

    /**
     * <p>The identifier of the metadata crawler type. Valid values:</p>
     * <ul>
     * <li><code>maxcompute</code></li>
     * <li><code>dlf</code></li>
     * <li><code>hms</code>: This type of crawler can be used to collect metadata from E-MapReduce (EMR) and CDH Hive clusters.</li>
     * <li><code>holo</code></li>
     * <li><code>mysql</code></li>
     * <li><code>oracle</code></li>
     * <li><code>postgresql</code></li>
     * <li><code>sqlserver</code></li>
     * <li><code>analyticdb_for_mysql</code></li>
     * <li><code>ads</code></li>
     * <li><code>hybriddb_for_postgresql</code></li>
     * <li><code>ots</code></li>
     * <li><code>clickhouse</code></li>
     * <li><code>starrocks</code>: This type of crawler can be used to query metadata entities only in internal catalogs.</li>
     * </ul>
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
         * <p>Specifies whether the entity type is optional.</p>
         * <p>For example, whether the schema level of the MaxCompute crawler type is optional depends on whether the three-layer model is enabled for a MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Optional")
        public Boolean optional;

        /**
         * <p>The subtype of the parent entity. If the subtype does not exist, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("ParentSubType")
        public String parentSubType;

        /**
         * <p>The identifier of the entity subtype. Valid values: <code>catalog, database, schema, table, and column</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The identifier of the entity type. The value of this parameter varies based on the type of the metadata crawler. Configure this parameter in the <code>${Crawler type}-${Subtype}</code> format.</p>
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
