// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamRecordIndexFilesResponseBody extends TeaModel {
    /**
     * <p>The recording configuration.</p>
     */
    @NameInMap("RecordInfo")
    public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo recordInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>550439A3-F8EC-4CA2-BB62-B9DB43EEEF30</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLiveStreamRecordIndexFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamRecordIndexFilesResponseBody self = new CreateLiveStreamRecordIndexFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamRecordIndexFilesResponseBody setRecordInfo(CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo recordInfo) {
        this.recordInfo = recordInfo;
        return this;
    }
    public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo getRecordInfo() {
        return this.recordInfo;
    }

    public CreateLiveStreamRecordIndexFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo extends TeaModel {
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the index file was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-05-27T09:40:56Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The recording length. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The end time of the index file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T07:40:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The height of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>liveBucket****</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <p>The endpoint of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-oss-****.aliyuncs.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        /**
         * <p>The name of the recording that is stored in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>liveObject****.m3u8</p>
         */
        @NameInMap("OssObject")
        public String ossObject;

        /**
         * <p>The ID of the index file.</p>
         * 
         * <strong>example:</strong>
         * <p>c4d7f0a4-b506-43f9-8de3-07732c3f****</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>The URL of the M3U8 index file.</p>
         */
        @NameInMap("RecordUrl")
        public String recordUrl;

        /**
         * <p>The start time of the index file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T07:36:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The width of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>640</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo self = new CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo();
            return TeaModel.build(map, self);
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
