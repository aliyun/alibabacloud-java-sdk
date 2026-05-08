// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetContextStoreResponseBody extends TeaModel {
    @NameInMap("config")
    public GetContextStoreResponseBodyConfig config;

    /**
     * <strong>example:</strong>
     * <p>test-context-store</p>
     */
    @NameInMap("contextStoreName")
    public String contextStoreName;

    /**
     * <strong>example:</strong>
     * <p>memory</p>
     */
    @NameInMap("contextType")
    public String contextType;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("dataset")
    public GetContextStoreResponseBodyDataset dataset;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetContextStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextStoreResponseBody self = new GetContextStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextStoreResponseBody setConfig(GetContextStoreResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetContextStoreResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetContextStoreResponseBody setContextStoreName(String contextStoreName) {
        this.contextStoreName = contextStoreName;
        return this;
    }
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    public GetContextStoreResponseBody setContextType(String contextType) {
        this.contextType = contextType;
        return this;
    }
    public String getContextType() {
        return this.contextType;
    }

    public GetContextStoreResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetContextStoreResponseBody setDataset(GetContextStoreResponseBodyDataset dataset) {
        this.dataset = dataset;
        return this;
    }
    public GetContextStoreResponseBodyDataset getDataset() {
        return this.dataset;
    }

    public GetContextStoreResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetContextStoreResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetContextStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextStoreResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetContextStoreResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetContextStoreResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetContextStoreResponseBodyConfigInnerSource extends TeaModel {
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

        public static GetContextStoreResponseBodyConfigInnerSource build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigInnerSource self = new GetContextStoreResponseBodyConfigInnerSource();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigInnerSource setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetContextStoreResponseBodyConfigInnerSource setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class GetContextStoreResponseBodyConfigSource extends TeaModel {
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
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1754962200000</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetContextStoreResponseBodyConfigSource build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSource self = new GetContextStoreResponseBodyConfigSource();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSource setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetContextStoreResponseBodyConfigSource setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetContextStoreResponseBodyConfigSource setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetContextStoreResponseBodyConfig extends TeaModel {
        @NameInMap("innerSource")
        public GetContextStoreResponseBodyConfigInnerSource innerSource;

        @NameInMap("metadataField")
        public java.util.Map<String, String> metadataField;

        @NameInMap("source")
        public GetContextStoreResponseBodyConfigSource source;

        public static GetContextStoreResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfig self = new GetContextStoreResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfig setInnerSource(GetContextStoreResponseBodyConfigInnerSource innerSource) {
            this.innerSource = innerSource;
            return this;
        }
        public GetContextStoreResponseBodyConfigInnerSource getInnerSource() {
            return this.innerSource;
        }

        public GetContextStoreResponseBodyConfig setMetadataField(java.util.Map<String, String> metadataField) {
            this.metadataField = metadataField;
            return this;
        }
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        public GetContextStoreResponseBodyConfig setSource(GetContextStoreResponseBodyConfigSource source) {
            this.source = source;
            return this;
        }
        public GetContextStoreResponseBodyConfigSource getSource() {
            return this.source;
        }

    }

    public static class GetContextStoreResponseBodyDataset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_dataset</p>
         */
        @NameInMap("name")
        public String name;

        public static GetContextStoreResponseBodyDataset build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyDataset self = new GetContextStoreResponseBodyDataset();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyDataset setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
