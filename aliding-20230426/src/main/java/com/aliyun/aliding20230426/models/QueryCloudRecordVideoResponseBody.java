// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("videoList")
    public java.util.List<QueryCloudRecordVideoResponseBodyVideoList> videoList;

    public static QueryCloudRecordVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordVideoResponseBody self = new QueryCloudRecordVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCloudRecordVideoResponseBody setVideoList(java.util.List<QueryCloudRecordVideoResponseBodyVideoList> videoList) {
        this.videoList = videoList;
        return this;
    }
    public java.util.List<QueryCloudRecordVideoResponseBodyVideoList> getVideoList() {
        return this.videoList;
    }

    public static class QueryCloudRecordVideoResponseBodyVideoList extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("RecordType")
        public Long recordType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryCloudRecordVideoResponseBodyVideoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordVideoResponseBodyVideoList self = new QueryCloudRecordVideoResponseBodyVideoList();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordVideoResponseBodyVideoList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryCloudRecordVideoResponseBodyVideoList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryCloudRecordVideoResponseBodyVideoList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public QueryCloudRecordVideoResponseBodyVideoList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryCloudRecordVideoResponseBodyVideoList setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public QueryCloudRecordVideoResponseBodyVideoList setRecordType(Long recordType) {
            this.recordType = recordType;
            return this;
        }
        public Long getRecordType() {
            return this.recordType;
        }

        public QueryCloudRecordVideoResponseBodyVideoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryCloudRecordVideoResponseBodyVideoList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryCloudRecordVideoResponseBodyVideoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
