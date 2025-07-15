// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordIndexFilesResponseBody extends TeaModel {
    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The index files.</p>
     */
    @NameInMap("RecordIndexInfoList")
    public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoList recordIndexInfoList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DE24625C-7C0F-4020-8448-9C31A50C1556</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeLiveStreamRecordIndexFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordIndexFilesResponseBody self = new DescribeLiveStreamRecordIndexFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setRecordIndexInfoList(DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoList recordIndexInfoList) {
        this.recordIndexInfoList = recordIndexInfoList;
        return this;
    }
    public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoList getRecordIndexInfoList() {
        return this.recordIndexInfoList;
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo extends TeaModel {
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the index file was created.</p>
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
         * <p>588.849</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The end time of the index file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T07:46:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The video format.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The video height.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
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
         * <p>The name of the storage file in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>liveObject****</p>
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
         * <p>The URL of the index file.</p>
         */
        @NameInMap("RecordUrl")
        public String recordUrl;

        /**
         * <p>The start time of the index file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
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
         * <p>The video width.</p>
         * 
         * <strong>example:</strong>
         * <p>640</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo self = new DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoList extends TeaModel {
        @NameInMap("RecordIndexInfo")
        public java.util.List<DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo> recordIndexInfo;

        public static DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoList self = new DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoList setRecordIndexInfo(java.util.List<DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo> recordIndexInfo) {
            this.recordIndexInfo = recordIndexInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo> getRecordIndexInfo() {
            return this.recordIndexInfo;
        }

    }

}
