// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionBatchShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13027****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>35067****</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6d4d****</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <strong>example:</strong>
     * <p>d9a8****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("StopParam")
    public String stopParamShrink;

    @NameInMap("Tags")
    public java.util.List<StopAppSessionBatchShrinkRequestTags> tags;

    public static StopAppSessionBatchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionBatchShrinkRequest self = new StopAppSessionBatchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopAppSessionBatchShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopAppSessionBatchShrinkRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public StopAppSessionBatchShrinkRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public StopAppSessionBatchShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StopAppSessionBatchShrinkRequest setStopParamShrink(String stopParamShrink) {
        this.stopParamShrink = stopParamShrink;
        return this;
    }
    public String getStopParamShrink() {
        return this.stopParamShrink;
    }

    public StopAppSessionBatchShrinkRequest setTags(java.util.List<StopAppSessionBatchShrinkRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<StopAppSessionBatchShrinkRequestTags> getTags() {
        return this.tags;
    }

    public static class StopAppSessionBatchShrinkRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>exampleTag</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>exampleValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static StopAppSessionBatchShrinkRequestTags build(java.util.Map<String, ?> map) throws Exception {
            StopAppSessionBatchShrinkRequestTags self = new StopAppSessionBatchShrinkRequestTags();
            return TeaModel.build(map, self);
        }

        public StopAppSessionBatchShrinkRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StopAppSessionBatchShrinkRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
