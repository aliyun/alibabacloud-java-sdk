// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateExternalDatabaseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>for log stat</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>my_db</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("defaultUserMapping")
    public String defaultUserMapping;

    @NameInMap("externalConfig")
    public java.util.List<CreateExternalDatabaseRequestExternalConfig> externalConfig;

    /**
     * <strong>example:</strong>
     * <p>maxcompute</p>
     */
    @NameInMap("metastoreType")
    public String metastoreType;

    public static CreateExternalDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalDatabaseRequest self = new CreateExternalDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalDatabaseRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateExternalDatabaseRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateExternalDatabaseRequest setDefaultUserMapping(String defaultUserMapping) {
        this.defaultUserMapping = defaultUserMapping;
        return this;
    }
    public String getDefaultUserMapping() {
        return this.defaultUserMapping;
    }

    public CreateExternalDatabaseRequest setExternalConfig(java.util.List<CreateExternalDatabaseRequestExternalConfig> externalConfig) {
        this.externalConfig = externalConfig;
        return this;
    }
    public java.util.List<CreateExternalDatabaseRequestExternalConfig> getExternalConfig() {
        return this.externalConfig;
    }

    public CreateExternalDatabaseRequest setMetastoreType(String metastoreType) {
        this.metastoreType = metastoreType;
        return this;
    }
    public String getMetastoreType() {
        return this.metastoreType;
    }

    public static class CreateExternalDatabaseRequestExternalConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mc_project</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>log_sum</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateExternalDatabaseRequestExternalConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalDatabaseRequestExternalConfig self = new CreateExternalDatabaseRequestExternalConfig();
            return TeaModel.build(map, self);
        }

        public CreateExternalDatabaseRequestExternalConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateExternalDatabaseRequestExternalConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
