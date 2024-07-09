// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordingsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nbCQ7ar+fECeh1IuWQXi39R5eoJ68zWp99mTAKRRNRhw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Recordings")
    public java.util.List<DescribeRecordingsResponseBodyRecordings> recordings;

    /**
     * <strong>example:</strong>
     * <p>327CFE78-1C0D-51AC-A9C6-BCEDF0DD44D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRecordingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordingsResponseBody self = new DescribeRecordingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordingsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRecordingsResponseBody setRecordings(java.util.List<DescribeRecordingsResponseBodyRecordings> recordings) {
        this.recordings = recordings;
        return this;
    }
    public java.util.List<DescribeRecordingsResponseBodyRecordings> getRecordings() {
        return this.recordings;
    }

    public DescribeRecordingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRecordingsResponseBodyRecordings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ecd-10v0vuvm616sk****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <strong>example:</strong>
         * <p>2023-04-10T07:26:06Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <strong>example:</strong>
         * <p>pg-4w5nk44zo5yl129dd/1mk78dugw344.mp4</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>pg-6dn811rzrwh9ws4z6</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <strong>example:</strong>
         * <p>1742845</p>
         */
        @NameInMap("RecordingSize")
        public Integer recordingSize;

        /**
         * <strong>example:</strong>
         * <p>alltime</p>
         */
        @NameInMap("RecordingType")
        public String recordingType;

        @NameInMap("SignedUrl")
        public String signedUrl;

        /**
         * <strong>example:</strong>
         * <p>2023-04-10T07:26:06Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeRecordingsResponseBodyRecordings build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordingsResponseBodyRecordings self = new DescribeRecordingsResponseBodyRecordings();
            return TeaModel.build(map, self);
        }

        public DescribeRecordingsResponseBodyRecordings setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeRecordingsResponseBodyRecordings setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeRecordingsResponseBodyRecordings setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRecordingsResponseBodyRecordings setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public DescribeRecordingsResponseBodyRecordings setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeRecordingsResponseBodyRecordings setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeRecordingsResponseBodyRecordings setRecordingSize(Integer recordingSize) {
            this.recordingSize = recordingSize;
            return this;
        }
        public Integer getRecordingSize() {
            return this.recordingSize;
        }

        public DescribeRecordingsResponseBodyRecordings setRecordingType(String recordingType) {
            this.recordingType = recordingType;
            return this;
        }
        public String getRecordingType() {
            return this.recordingType;
        }

        public DescribeRecordingsResponseBodyRecordings setSignedUrl(String signedUrl) {
            this.signedUrl = signedUrl;
            return this;
        }
        public String getSignedUrl() {
            return this.signedUrl;
        }

        public DescribeRecordingsResponseBodyRecordings setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
