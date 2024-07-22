// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribePipelineResponseBody extends TeaModel {
    /**
     * <p>The time when the pipeline was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD1***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the queue. Valid values:</p>
     * <ul>
     * <li>MEMORY: a traditional memory-based queue.</li>
     * <li>PERSISTED: disk-based ACKed queue (persistent queue).</li>
     * </ul>
     */
    @NameInMap("Result")
    public DescribePipelineResponseBodyResult result;

    public static DescribePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineResponseBody self = new DescribePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePipelineResponseBody setResult(DescribePipelineResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePipelineResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribePipelineResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the pipeline was created.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("batchDelay")
        public Integer batchDelay;

        /**
         * <strong>example:</strong>
         * <p>125</p>
         */
        @NameInMap("batchSize")
        public Integer batchSize;

        /**
         * <p>The description of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>input {  }  filter {  }  output {  }</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>The state of the MPS queue. Valid values:</p>
         * <ul>
         * <li>NOT_DEPLOYED: The node is not deployed.</li>
         * <li>RUNNING</li>
         * <li>DELETED: Deleted. The console does not display this status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>this is a test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2020-06-20T07:26:47.000+0000</p>
         */
        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        /**
         * <p>The total capacity of the queue in bytes. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-20T07:26:47.000+0000</p>
         */
        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        /**
         * <p>Number of queue checkpoint writes.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline_test</p>
         */
        @NameInMap("pipelineId")
        public String pipelineId;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("pipelineStatus")
        public String pipelineStatus;

        /**
         * <p>Pipeline batch delay. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("queueCheckPointWrites")
        public Integer queueCheckPointWrites;

        /**
         * <p>The number of pipeline workers.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("queueMaxBytes")
        public Integer queueMaxBytes;

        /**
         * <p>The specific configuration of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>MEMORY</p>
         */
        @NameInMap("queueType")
        public String queueType;

        /**
         * <p>The size of the pipeline batch.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("workers")
        public Integer workers;

        public static DescribePipelineResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineResponseBodyResult self = new DescribePipelineResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePipelineResponseBodyResult setBatchDelay(Integer batchDelay) {
            this.batchDelay = batchDelay;
            return this;
        }
        public Integer getBatchDelay() {
            return this.batchDelay;
        }

        public DescribePipelineResponseBodyResult setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public DescribePipelineResponseBodyResult setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribePipelineResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePipelineResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public DescribePipelineResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public DescribePipelineResponseBodyResult setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public DescribePipelineResponseBodyResult setPipelineStatus(String pipelineStatus) {
            this.pipelineStatus = pipelineStatus;
            return this;
        }
        public String getPipelineStatus() {
            return this.pipelineStatus;
        }

        public DescribePipelineResponseBodyResult setQueueCheckPointWrites(Integer queueCheckPointWrites) {
            this.queueCheckPointWrites = queueCheckPointWrites;
            return this;
        }
        public Integer getQueueCheckPointWrites() {
            return this.queueCheckPointWrites;
        }

        public DescribePipelineResponseBodyResult setQueueMaxBytes(Integer queueMaxBytes) {
            this.queueMaxBytes = queueMaxBytes;
            return this;
        }
        public Integer getQueueMaxBytes() {
            return this.queueMaxBytes;
        }

        public DescribePipelineResponseBodyResult setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public DescribePipelineResponseBodyResult setWorkers(Integer workers) {
            this.workers = workers;
            return this;
        }
        public Integer getWorkers() {
            return this.workers;
        }

    }

}
