// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordFileResponseBody extends TeaModel {
    @NameInMap("RecordFiles")
    public java.util.List<DescribeRecordFileResponseBodyRecordFiles> recordFiles;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>05C2791F-41A7-5E7C-B5E4-1401FD0E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRecordFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordFileResponseBody self = new DescribeRecordFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordFileResponseBody setRecordFiles(java.util.List<DescribeRecordFileResponseBodyRecordFiles> recordFiles) {
        this.recordFiles = recordFiles;
        return this;
    }
    public java.util.List<DescribeRecordFileResponseBodyRecordFiles> getRecordFiles() {
        return this.recordFiles;
    }

    public DescribeRecordFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordFileResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRecordFileResponseBodyRecordFilesEventDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\n\t\&quot;messageInfo\&quot; : \&quot;mouse_move\&quot;,\n\t\&quot;messageType\&quot; : \&quot;UserInput\&quot;\n}\n&quot;</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("EventTime")
        public Integer eventTime;

        /**
         * <strong>example:</strong>
         * <p>UserInput</p>
         */
        @NameInMap("EventType")
        public String eventType;

        public static DescribeRecordFileResponseBodyRecordFilesEventDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordFileResponseBodyRecordFilesEventDetails self = new DescribeRecordFileResponseBodyRecordFilesEventDetails();
            return TeaModel.build(map, self);
        }

        public DescribeRecordFileResponseBodyRecordFilesEventDetails setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeRecordFileResponseBodyRecordFilesEventDetails setEventTime(Integer eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Integer getEventTime() {
            return this.eventTime;
        }

        public DescribeRecordFileResponseBodyRecordFilesEventDetails setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

    public static class DescribeRecordFileResponseBodyRecordFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ecd-7yulhw1g1attet7d2</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <strong>example:</strong>
         * <p>fvt-ecd</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("EventDetails")
        public java.util.List<DescribeRecordFileResponseBodyRecordFilesEventDetails> eventDetails;

        /**
         * <strong>example:</strong>
         * <p>Task3</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>139</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p>pg-**</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:02:25Z</p>
         */
        @NameInMap("RecordEndTime")
        public String recordEndTime;

        /**
         * <strong>example:</strong>
         * <p>1774656000000</p>
         */
        @NameInMap("RecordExpire")
        public Long recordExpire;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:02:25Z</p>
         */
        @NameInMap("RecordStartTime")
        public String recordStartTime;

        /**
         * <strong>example:</strong>
         * <p>period</p>
         */
        @NameInMap("RecordType")
        public Integer recordType;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-f3s3dgt8dtb0vlqc8</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>resource</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeRecordFileResponseBodyRecordFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordFileResponseBodyRecordFiles self = new DescribeRecordFileResponseBodyRecordFiles();
            return TeaModel.build(map, self);
        }

        public DescribeRecordFileResponseBodyRecordFiles setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeRecordFileResponseBodyRecordFiles setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeRecordFileResponseBodyRecordFiles setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeRecordFileResponseBodyRecordFiles setEventDetails(java.util.List<DescribeRecordFileResponseBodyRecordFilesEventDetails> eventDetails) {
            this.eventDetails = eventDetails;
            return this;
        }
        public java.util.List<DescribeRecordFileResponseBodyRecordFilesEventDetails> getEventDetails() {
            return this.eventDetails;
        }

        public DescribeRecordFileResponseBodyRecordFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeRecordFileResponseBodyRecordFiles setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeRecordFileResponseBodyRecordFiles setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeRecordFileResponseBodyRecordFiles setRecordEndTime(String recordEndTime) {
            this.recordEndTime = recordEndTime;
            return this;
        }
        public String getRecordEndTime() {
            return this.recordEndTime;
        }

        public DescribeRecordFileResponseBodyRecordFiles setRecordExpire(Long recordExpire) {
            this.recordExpire = recordExpire;
            return this;
        }
        public Long getRecordExpire() {
            return this.recordExpire;
        }

        public DescribeRecordFileResponseBodyRecordFiles setRecordStartTime(String recordStartTime) {
            this.recordStartTime = recordStartTime;
            return this;
        }
        public String getRecordStartTime() {
            return this.recordStartTime;
        }

        public DescribeRecordFileResponseBodyRecordFiles setRecordType(Integer recordType) {
            this.recordType = recordType;
            return this;
        }
        public Integer getRecordType() {
            return this.recordType;
        }

        public DescribeRecordFileResponseBodyRecordFiles setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRecordFileResponseBodyRecordFiles setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRecordFileResponseBodyRecordFiles setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeRecordFileResponseBodyRecordFiles setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
