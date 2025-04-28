// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordingsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nbCQ7ar+fECeh1IuWQXi39R5eoJ68zWp99mTAKRRNRhw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The screen recording files.</p>
     */
    @NameInMap("Recordings")
    public java.util.List<DescribeRecordingsResponseBodyRecordings> recordings;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-10v0vuvm616sk****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The end time of the recording.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-10T07:26:06Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The end user IDs.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-4w5nk44zo5yl129dd/1mk78dugw344.mp4</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-6dn811rzrwh9ws4z6</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The size of the screen recording file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1742845</p>
         */
        @NameInMap("RecordingSize")
        public Integer recordingSize;

        /**
         * <p>The type of event that triggers the recording.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>byaction_cmd_ft: triggered by copy-paste or file transfer events.</li>
         * <li>period: triggered at scheduled intervals.</li>
         * <li>session: triggered by session lifecycle monitoring.</li>
         * <li>byaction_commands: triggered by copy-paste only.</li>
         * <li>alltime: continuous recording.</li>
         * <li>byaction_file_transfer: triggered by file transfer only.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alltime</p>
         */
        @NameInMap("RecordingType")
        public String recordingType;

        /**
         * <p>The download URL of the screen recording file.</p>
         */
        @NameInMap("SignedUrl")
        public String signedUrl;

        /**
         * <p>The start time of the recording.</p>
         * 
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
