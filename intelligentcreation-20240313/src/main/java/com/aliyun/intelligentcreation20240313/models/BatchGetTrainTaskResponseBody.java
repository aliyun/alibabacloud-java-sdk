// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetTrainTaskResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("voiceList")
    public java.util.List<BatchGetTrainTaskResponseBodyVoiceList> voiceList;

    public static BatchGetTrainTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTrainTaskResponseBody self = new BatchGetTrainTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetTrainTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetTrainTaskResponseBody setVoiceList(java.util.List<BatchGetTrainTaskResponseBodyVoiceList> voiceList) {
        this.voiceList = voiceList;
        return this;
    }
    public java.util.List<BatchGetTrainTaskResponseBodyVoiceList> getVoiceList() {
        return this.voiceList;
    }

    public static class BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial extends TeaModel {
        @NameInMap("voiceId")
        public Long voiceId;

        @NameInMap("voiceLanguage")
        public String voiceLanguage;

        @NameInMap("voiceUrl")
        public String voiceUrl;

        public static BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial build(java.util.Map<String, ?> map) throws Exception {
            BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial self = new BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial();
            return TeaModel.build(map, self);
        }

        public BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial setVoiceId(Long voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public Long getVoiceId() {
            return this.voiceId;
        }

        public BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial setVoiceLanguage(String voiceLanguage) {
            this.voiceLanguage = voiceLanguage;
            return this;
        }
        public String getVoiceLanguage() {
            return this.voiceLanguage;
        }

        public BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial setVoiceUrl(String voiceUrl) {
            this.voiceUrl = voiceUrl;
            return this;
        }
        public String getVoiceUrl() {
            return this.voiceUrl;
        }

    }

    public static class BatchGetTrainTaskResponseBodyVoiceList extends TeaModel {
        @NameInMap("aliyunSubId")
        public String aliyunSubId;

        @NameInMap("auditFailMessage")
        public String auditFailMessage;

        @NameInMap("auditStatus")
        public String auditStatus;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("gender")
        public String gender;

        @NameInMap("name")
        public String name;

        @NameInMap("resSpecType")
        public String resSpecType;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("taskType")
        public String taskType;

        @NameInMap("trainFailMessage")
        public String trainFailMessage;

        @NameInMap("trainStatus")
        public String trainStatus;

        @NameInMap("useScene")
        public String useScene;

        @NameInMap("voiceMaterial")
        public BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial voiceMaterial;

        public static BatchGetTrainTaskResponseBodyVoiceList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetTrainTaskResponseBodyVoiceList self = new BatchGetTrainTaskResponseBodyVoiceList();
            return TeaModel.build(map, self);
        }

        public BatchGetTrainTaskResponseBodyVoiceList setAliyunSubId(String aliyunSubId) {
            this.aliyunSubId = aliyunSubId;
            return this;
        }
        public String getAliyunSubId() {
            return this.aliyunSubId;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setAuditFailMessage(String auditFailMessage) {
            this.auditFailMessage = auditFailMessage;
            return this;
        }
        public String getAuditFailMessage() {
            return this.auditFailMessage;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setResSpecType(String resSpecType) {
            this.resSpecType = resSpecType;
            return this;
        }
        public String getResSpecType() {
            return this.resSpecType;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setTrainFailMessage(String trainFailMessage) {
            this.trainFailMessage = trainFailMessage;
            return this;
        }
        public String getTrainFailMessage() {
            return this.trainFailMessage;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setTrainStatus(String trainStatus) {
            this.trainStatus = trainStatus;
            return this;
        }
        public String getTrainStatus() {
            return this.trainStatus;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setUseScene(String useScene) {
            this.useScene = useScene;
            return this;
        }
        public String getUseScene() {
            return this.useScene;
        }

        public BatchGetTrainTaskResponseBodyVoiceList setVoiceMaterial(BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial voiceMaterial) {
            this.voiceMaterial = voiceMaterial;
            return this;
        }
        public BatchGetTrainTaskResponseBodyVoiceListVoiceMaterial getVoiceMaterial() {
            return this.voiceMaterial;
        }

    }

}
