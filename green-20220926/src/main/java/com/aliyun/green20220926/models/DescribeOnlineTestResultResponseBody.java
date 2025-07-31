// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DescribeOnlineTestResultResponseBody extends TeaModel {
    @NameInMap("AudioData")
    public DescribeOnlineTestResultResponseBodyAudioData audioData;

    @NameInMap("FrameData")
    public DescribeOnlineTestResultResponseBodyFrameData frameData;

    /**
     * <strong>example:</strong>
     * <p>1725761005419</p>
     */
    @NameInMap("ModerationTime")
    public String moderationTime;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <strong>example:</strong>
     * <p>VideoModeration</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("SummaryList")
    public java.util.List<DescribeOnlineTestResultResponseBodySummaryList> summaryList;

    /**
     * <strong>example:</strong>
     * <p>xxxxx-xxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxxx.com/data/data.png">https://xxxxxxxxx.com/data/data.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeOnlineTestResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnlineTestResultResponseBody self = new DescribeOnlineTestResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOnlineTestResultResponseBody setAudioData(DescribeOnlineTestResultResponseBodyAudioData audioData) {
        this.audioData = audioData;
        return this;
    }
    public DescribeOnlineTestResultResponseBodyAudioData getAudioData() {
        return this.audioData;
    }

    public DescribeOnlineTestResultResponseBody setFrameData(DescribeOnlineTestResultResponseBodyFrameData frameData) {
        this.frameData = frameData;
        return this;
    }
    public DescribeOnlineTestResultResponseBodyFrameData getFrameData() {
        return this.frameData;
    }

    public DescribeOnlineTestResultResponseBody setModerationTime(String moderationTime) {
        this.moderationTime = moderationTime;
        return this;
    }
    public String getModerationTime() {
        return this.moderationTime;
    }

    public DescribeOnlineTestResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOnlineTestResultResponseBody setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeOnlineTestResultResponseBody setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeOnlineTestResultResponseBody setSummaryList(java.util.List<DescribeOnlineTestResultResponseBodySummaryList> summaryList) {
        this.summaryList = summaryList;
        return this;
    }
    public java.util.List<DescribeOnlineTestResultResponseBodySummaryList> getSummaryList() {
        return this.summaryList;
    }

    public DescribeOnlineTestResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeOnlineTestResultResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeOnlineTestResultResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class DescribeOnlineTestResultResponseBodyAudioData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1724378510396</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeOnlineTestResultResponseBodyAudioData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnlineTestResultResponseBodyAudioData self = new DescribeOnlineTestResultResponseBodyAudioData();
            return TeaModel.build(map, self);
        }

        public DescribeOnlineTestResultResponseBodyAudioData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeOnlineTestResultResponseBodyFrameData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1725761005419</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxxx.com/data/data.mp4">https://xxxxxxxxx.com/data/data.mp4</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeOnlineTestResultResponseBodyFrameData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnlineTestResultResponseBodyFrameData self = new DescribeOnlineTestResultResponseBodyFrameData();
            return TeaModel.build(map, self);
        }

        public DescribeOnlineTestResultResponseBodyFrameData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeOnlineTestResultResponseBodyFrameData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeOnlineTestResultResponseBodySummaryList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("RiskLevelSummary")
        public java.util.Map<String, Long> riskLevelSummary;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SliceCount")
        public Integer sliceCount;

        public static DescribeOnlineTestResultResponseBodySummaryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnlineTestResultResponseBodySummaryList self = new DescribeOnlineTestResultResponseBodySummaryList();
            return TeaModel.build(map, self);
        }

        public DescribeOnlineTestResultResponseBodySummaryList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeOnlineTestResultResponseBodySummaryList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOnlineTestResultResponseBodySummaryList setRiskLevelSummary(java.util.Map<String, Long> riskLevelSummary) {
            this.riskLevelSummary = riskLevelSummary;
            return this;
        }
        public java.util.Map<String, Long> getRiskLevelSummary() {
            return this.riskLevelSummary;
        }

        public DescribeOnlineTestResultResponseBodySummaryList setSliceCount(Integer sliceCount) {
            this.sliceCount = sliceCount;
            return this;
        }
        public Integer getSliceCount() {
            return this.sliceCount;
        }

    }

}
