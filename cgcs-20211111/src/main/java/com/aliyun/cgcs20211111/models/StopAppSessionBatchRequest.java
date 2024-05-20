// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionBatchRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("StopParam")
    public java.util.List<StopAppSessionBatchRequestStopParam> stopParam;

    @NameInMap("Tags")
    public java.util.List<StopAppSessionBatchRequestTags> tags;

    public static StopAppSessionBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionBatchRequest self = new StopAppSessionBatchRequest();
        return TeaModel.build(map, self);
    }

    public StopAppSessionBatchRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopAppSessionBatchRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public StopAppSessionBatchRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public StopAppSessionBatchRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StopAppSessionBatchRequest setStopParam(java.util.List<StopAppSessionBatchRequestStopParam> stopParam) {
        this.stopParam = stopParam;
        return this;
    }
    public java.util.List<StopAppSessionBatchRequestStopParam> getStopParam() {
        return this.stopParam;
    }

    public StopAppSessionBatchRequest setTags(java.util.List<StopAppSessionBatchRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<StopAppSessionBatchRequestTags> getTags() {
        return this.tags;
    }

    public static class StopAppSessionBatchRequestStopParam extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Object value;

        public static StopAppSessionBatchRequestStopParam build(java.util.Map<String, ?> map) throws Exception {
            StopAppSessionBatchRequestStopParam self = new StopAppSessionBatchRequestStopParam();
            return TeaModel.build(map, self);
        }

        public StopAppSessionBatchRequestStopParam setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StopAppSessionBatchRequestStopParam setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class StopAppSessionBatchRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static StopAppSessionBatchRequestTags build(java.util.Map<String, ?> map) throws Exception {
            StopAppSessionBatchRequestTags self = new StopAppSessionBatchRequestTags();
            return TeaModel.build(map, self);
        }

        public StopAppSessionBatchRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StopAppSessionBatchRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
