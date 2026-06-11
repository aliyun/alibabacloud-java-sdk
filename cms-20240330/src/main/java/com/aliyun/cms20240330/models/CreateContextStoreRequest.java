// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateContextStoreRequest extends TeaModel {
    /**
     * <p>The configuration.</p>
     */
    @NameInMap("config")
    public CreateContextStoreRequestConfig config;

    /**
     * <p>The name of the context store.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-context-store</p>
     */
    @NameInMap("contextStoreName")
    public String contextStoreName;

    /**
     * <p>The type of the context store.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>memory</p>
     */
    @NameInMap("contextType")
    public String contextType;

    /**
     * <p>The properties of the dataset.</p>
     */
    @NameInMap("dataset")
    public CreateContextStoreRequestDataset dataset;

    /**
     * <p>The description of the context store.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("description")
    public String description;

    public static CreateContextStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContextStoreRequest self = new CreateContextStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateContextStoreRequest setConfig(CreateContextStoreRequestConfig config) {
        this.config = config;
        return this;
    }
    public CreateContextStoreRequestConfig getConfig() {
        return this.config;
    }

    public CreateContextStoreRequest setContextStoreName(String contextStoreName) {
        this.contextStoreName = contextStoreName;
        return this;
    }
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    public CreateContextStoreRequest setContextType(String contextType) {
        this.contextType = contextType;
        return this;
    }
    public String getContextType() {
        return this.contextType;
    }

    public CreateContextStoreRequest setDataset(CreateContextStoreRequestDataset dataset) {
        this.dataset = dataset;
        return this;
    }
    public CreateContextStoreRequestDataset getDataset() {
        return this.dataset;
    }

    public CreateContextStoreRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class CreateContextStoreRequestConfigSource extends TeaModel {
        /**
         * <p>The name of the Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-test-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-test-project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The effective start time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1751508233000</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static CreateContextStoreRequestConfigSource build(java.util.Map<String, ?> map) throws Exception {
            CreateContextStoreRequestConfigSource self = new CreateContextStoreRequestConfigSource();
            return TeaModel.build(map, self);
        }

        public CreateContextStoreRequestConfigSource setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateContextStoreRequestConfigSource setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateContextStoreRequestConfigSource setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateContextStoreRequestConfig extends TeaModel {
        /**
         * <p>The metadata fields.</p>
         */
        @NameInMap("metadataField")
        public java.util.Map<String, String> metadataField;

        /**
         * <p>The configuration source.</p>
         */
        @NameInMap("source")
        public CreateContextStoreRequestConfigSource source;

        public static CreateContextStoreRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateContextStoreRequestConfig self = new CreateContextStoreRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateContextStoreRequestConfig setMetadataField(java.util.Map<String, String> metadataField) {
            this.metadataField = metadataField;
            return this;
        }
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        public CreateContextStoreRequestConfig setSource(CreateContextStoreRequestConfigSource source) {
            this.source = source;
            return this;
        }
        public CreateContextStoreRequestConfigSource getSource() {
            return this.source;
        }

    }

    public static class CreateContextStoreRequestDataset extends TeaModel {
        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>test_dataset</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateContextStoreRequestDataset build(java.util.Map<String, ?> map) throws Exception {
            CreateContextStoreRequestDataset self = new CreateContextStoreRequestDataset();
            return TeaModel.build(map, self);
        }

        public CreateContextStoreRequestDataset setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
