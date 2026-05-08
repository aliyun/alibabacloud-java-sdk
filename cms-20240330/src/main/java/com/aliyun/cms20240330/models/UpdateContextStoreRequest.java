// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateContextStoreRequest extends TeaModel {
    @NameInMap("config")
    public UpdateContextStoreRequestConfig config;

    /**
     * <strong>example:</strong>
     * <p>memory</p>
     */
    @NameInMap("contextType")
    public String contextType;

    @NameInMap("dataset")
    public UpdateContextStoreRequestDataset dataset;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateContextStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextStoreRequest self = new UpdateContextStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextStoreRequest setConfig(UpdateContextStoreRequestConfig config) {
        this.config = config;
        return this;
    }
    public UpdateContextStoreRequestConfig getConfig() {
        return this.config;
    }

    public UpdateContextStoreRequest setContextType(String contextType) {
        this.contextType = contextType;
        return this;
    }
    public String getContextType() {
        return this.contextType;
    }

    public UpdateContextStoreRequest setDataset(UpdateContextStoreRequestDataset dataset) {
        this.dataset = dataset;
        return this;
    }
    public UpdateContextStoreRequestDataset getDataset() {
        return this.dataset;
    }

    public UpdateContextStoreRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class UpdateContextStoreRequestConfigSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sls-test-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <strong>example:</strong>
         * <p>sls-test-project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>1776824891000</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static UpdateContextStoreRequestConfigSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextStoreRequestConfigSource self = new UpdateContextStoreRequestConfigSource();
            return TeaModel.build(map, self);
        }

        public UpdateContextStoreRequestConfigSource setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateContextStoreRequestConfigSource setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public UpdateContextStoreRequestConfigSource setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateContextStoreRequestConfig extends TeaModel {
        @NameInMap("metadataField")
        public java.util.Map<String, String> metadataField;

        @NameInMap("source")
        public UpdateContextStoreRequestConfigSource source;

        public static UpdateContextStoreRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextStoreRequestConfig self = new UpdateContextStoreRequestConfig();
            return TeaModel.build(map, self);
        }

        public UpdateContextStoreRequestConfig setMetadataField(java.util.Map<String, String> metadataField) {
            this.metadataField = metadataField;
            return this;
        }
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        public UpdateContextStoreRequestConfig setSource(UpdateContextStoreRequestConfigSource source) {
            this.source = source;
            return this;
        }
        public UpdateContextStoreRequestConfigSource getSource() {
            return this.source;
        }

    }

    public static class UpdateContextStoreRequestDataset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_dataset</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateContextStoreRequestDataset build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextStoreRequestDataset self = new UpdateContextStoreRequestDataset();
            return TeaModel.build(map, self);
        }

        public UpdateContextStoreRequestDataset setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
