// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DataIngestion extends TeaModel {
    /**
     * <p>The templates.</p>
     */
    @NameInMap("Actions")
    public java.util.List<DataIngestionActions> actions;

    /**
     * <p>The time when the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-10T03:50:28Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>api returns error: SDKError: StatusCode: 404 Code: ResourceNotFound</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The unique ID of the data ingestion.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger-9f72636a-0f0c-4baf-ae78-38b27bfe****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The information about the data source.</p>
     */
    @NameInMap("Input")
    public Input input;

    /**
     * <p>The task execution location.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpw****</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The notification for task completion.</p>
     */
    @NameInMap("Notification")
    public DataIngestionNotification notification;

    /**
     * <p>The scanning phase.</p>
     * 
     * <strong>example:</strong>
     * <p>IncrementalScanning</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The service-linked role.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunIMMBatchTriggerRole</p>
     */
    @NameInMap("ServiceRole")
    public String serviceRole;

    /**
     * <p>The status of the batch processing task.</p>
     * <ul>
     * <li>Ready: The task is created.</li>
     * <li>Running: The task is running.</li>
     * <li>Failed: The task fails and cannot be automatically recovered.</li>
     * <li>Suspended: The task is suspended.</li>
     * <li>Succeeded: The task is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The statistical information.</p>
     */
    @NameInMap("Statistic")
    public DataIngestionStatistic statistic;

    /**
     * <p>The task tags.</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The time when the task was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-18T07:40:29Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static DataIngestion build(java.util.Map<String, ?> map) throws Exception {
        DataIngestion self = new DataIngestion();
        return TeaModel.build(map, self);
    }

    public DataIngestion setActions(java.util.List<DataIngestionActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<DataIngestionActions> getActions() {
        return this.actions;
    }

    public DataIngestion setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DataIngestion setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public DataIngestion setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DataIngestion setInput(Input input) {
        this.input = input;
        return this;
    }
    public Input getInput() {
        return this.input;
    }

    public DataIngestion setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public DataIngestion setNotification(DataIngestionNotification notification) {
        this.notification = notification;
        return this;
    }
    public DataIngestionNotification getNotification() {
        return this.notification;
    }

    public DataIngestion setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public DataIngestion setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public DataIngestion setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DataIngestion setStatistic(DataIngestionStatistic statistic) {
        this.statistic = statistic;
        return this;
    }
    public DataIngestionStatistic getStatistic() {
        return this.statistic;
    }

    public DataIngestion setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public DataIngestion setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class DataIngestionActions extends TeaModel {
        /**
         * <p>The on-error policy that is used to quickly troubleshoot an error.</p>
         */
        @NameInMap("FastFailPolicy")
        public FastFailPolicy fastFailPolicy;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>doc/convert</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template parameters.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<String> parameters;

        public static DataIngestionActions build(java.util.Map<String, ?> map) throws Exception {
            DataIngestionActions self = new DataIngestionActions();
            return TeaModel.build(map, self);
        }

        public DataIngestionActions setFastFailPolicy(FastFailPolicy fastFailPolicy) {
            this.fastFailPolicy = fastFailPolicy;
            return this;
        }
        public FastFailPolicy getFastFailPolicy() {
            return this.fastFailPolicy;
        }

        public DataIngestionActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DataIngestionActions setParameters(java.util.List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<String> getParameters() {
            return this.parameters;
        }

    }

    public static class DataIngestionNotification extends TeaModel {
        /**
         * <p>The Simple Message Queue (SMQ) endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://1111111111.mns.cn-hangzhou.aliyuncs.com">http://1111111111.mns.cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>MNS</p>
         */
        @NameInMap("MNS")
        public MNS MNS;

        /**
         * <p>RocketMQ</p>
         */
        @NameInMap("RocketMQ")
        public RocketMQ rocketMQ;

        /**
         * <p>The SMQ topic.</p>
         * 
         * <strong>example:</strong>
         * <p>topic1</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static DataIngestionNotification build(java.util.Map<String, ?> map) throws Exception {
            DataIngestionNotification self = new DataIngestionNotification();
            return TeaModel.build(map, self);
        }

        public DataIngestionNotification setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DataIngestionNotification setMNS(MNS MNS) {
            this.MNS = MNS;
            return this;
        }
        public MNS getMNS() {
            return this.MNS;
        }

        public DataIngestionNotification setRocketMQ(RocketMQ rocketMQ) {
            this.rocketMQ = rocketMQ;
            return this;
        }
        public RocketMQ getRocketMQ() {
            return this.rocketMQ;
        }

        public DataIngestionNotification setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class DataIngestionStatistic extends TeaModel {
        /**
         * <p>The number of files that are skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SkipFiles")
        public Long skipFiles;

        /**
         * <p>The number of files that fail to be submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubmitFailure")
        public Long submitFailure;

        /**
         * <p>The number of files that are submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SubmitSuccess")
        public Long submitSuccess;

        public static DataIngestionStatistic build(java.util.Map<String, ?> map) throws Exception {
            DataIngestionStatistic self = new DataIngestionStatistic();
            return TeaModel.build(map, self);
        }

        public DataIngestionStatistic setSkipFiles(Long skipFiles) {
            this.skipFiles = skipFiles;
            return this;
        }
        public Long getSkipFiles() {
            return this.skipFiles;
        }

        public DataIngestionStatistic setSubmitFailure(Long submitFailure) {
            this.submitFailure = submitFailure;
            return this;
        }
        public Long getSubmitFailure() {
            return this.submitFailure;
        }

        public DataIngestionStatistic setSubmitSuccess(Long submitSuccess) {
            this.submitSuccess = submitSuccess;
            return this;
        }
        public Long getSubmitSuccess() {
            return this.submitSuccess;
        }

    }

}
