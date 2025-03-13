// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetTrainTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2226A26A-26E5-5AB9-A14A-54D612FCF96A</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("voiceId")
        public Long voiceId;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("voiceLanguage")
        public String voiceLanguage;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.voice.com">http://www.voice.com</a></p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1524004782438111</p>
         */
        @NameInMap("aliyunSubId")
        public String aliyunSubId;

        @NameInMap("auditFailMessage")
        public String auditFailMessage;

        /**
         * <strong>example:</strong>
         * <p>auditFail</p>
         */
        @NameInMap("auditStatus")
        public String auditStatus;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>M</p>
         */
        @NameInMap("gender")
        public String gender;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>BASIC_MODEL</p>
         */
        @NameInMap("resSpecType")
        public String resSpecType;

        /**
         * <strong>example:</strong>
         * <p>837091359375048704</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>CopyVoice</p>
         */
        @NameInMap("taskType")
        public String taskType;

        @NameInMap("trainFailMessage")
        public String trainFailMessage;

        /**
         * <strong>example:</strong>
         * <p>trainFail</p>
         */
        @NameInMap("trainStatus")
        public String trainStatus;

        /**
         * <strong>example:</strong>
         * <p>realTimeInteractivity</p>
         */
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
