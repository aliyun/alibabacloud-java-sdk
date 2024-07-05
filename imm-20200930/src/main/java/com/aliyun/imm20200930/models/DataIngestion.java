// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DataIngestion extends TeaModel {
    @NameInMap("Actions")
    public java.util.List<DataIngestionActions> actions;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Error")
    public String error;

    @NameInMap("Id")
    public String id;

    @NameInMap("Input")
    public Input input;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("Notification")
    public DataIngestionNotification notification;

    /**
     * <strong>example:</strong>
     * <p>IncrementalScanning</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>AliyunIMMBatchTriggerRole</p>
     */
    @NameInMap("ServiceRole")
    public String serviceRole;

    @NameInMap("State")
    public String state;

    @NameInMap("Statistic")
    public DataIngestionStatistic statistic;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

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
        @NameInMap("FastFailPolicy")
        public FastFailPolicy fastFailPolicy;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("MNS")
        public MNS MNS;

        @NameInMap("RocketMQ")
        public RocketMQ rocketMQ;

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
        @NameInMap("SkipFiles")
        public Long skipFiles;

        @NameInMap("SubmitFailure")
        public Long submitFailure;

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
