// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordConfigResponseBody extends TeaModel {
    /**
     * <p>The list of recording configurations.</p>
     */
    @NameInMap("LiveAppRecordList")
    public DescribeLiveRecordConfigResponseBodyLiveAppRecordList liveAppRecordList;

    /**
     * <p>The sorting order of recording configurations by creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5056369B-D337-499E-B8B7-B761BD37B08A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of recording configurations that meet the specified conditions.</p>
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

    public static DescribeLiveRecordConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordConfigResponseBody self = new DescribeLiveRecordConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordConfigResponseBody setLiveAppRecordList(DescribeLiveRecordConfigResponseBodyLiveAppRecordList liveAppRecordList) {
        this.liveAppRecordList = liveAppRecordList;
        return this;
    }
    public DescribeLiveRecordConfigResponseBodyLiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    public DescribeLiveRecordConfigResponseBody setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveRecordConfigResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveRecordConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveRecordConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRecordConfigResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveRecordConfigResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat extends TeaModel {
        /**
         * <p>The duration of a recording file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The format of recording files.</p>
         * 
         * <strong>example:</strong>
         * <p>M3U8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The naming format of a recording file.</p>
         * 
         * <strong>example:</strong>
         * <p>record/{liveApp****}/{liveStream****}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The duration of a segment file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The naming format of a segment file.</p>
         * 
         * <strong>example:</strong>
         * <p>record/{liveApp****}/{liveStream****}/{UnixTimestamp}</p>
         */
        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat self = new DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

    public static class DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList extends TeaModel {
        @NameInMap("RecordFormat")
        public java.util.List<DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat> recordFormat;

        public static DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList self = new DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList setRecordFormat(java.util.List<DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat> recordFormat) {
            this.recordFormat = recordFormat;
            return this;
        }
        public java.util.List<DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

    }

    public static class DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat extends TeaModel {
        /**
         * <p>The duration of a recording file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The format of recording files.</p>
         * 
         * <strong>example:</strong>
         * <p>M3U8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The naming format of a recording file.</p>
         * 
         * <strong>example:</strong>
         * <p>record/{liveApp****}/{liveStream****}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The duration of a segment file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The naming format of a segment file.</p>
         * 
         * <strong>example:</strong>
         * <p>record/{liveApp****}/{liveStream****}/{UnixTimestamp}</p>
         */
        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat self = new DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

    public static class DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatList extends TeaModel {
        @NameInMap("RecordFormat")
        public java.util.List<DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat> recordFormat;

        public static DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatList self = new DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatList setRecordFormat(java.util.List<DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat> recordFormat) {
            this.recordFormat = recordFormat;
            return this;
        }
        public java.util.List<DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatListRecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

    }

    public static class DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeTemplates extends TeaModel {
        @NameInMap("Templates")
        public java.util.List<String> templates;

        public static DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeTemplates self = new DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeTemplates setTemplates(java.util.List<String> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<String> getTemplates() {
            return this.templates;
        }

    }

    public static class DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord extends TeaModel {
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the recording configuration was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-05-20T09:33:38Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The maximum interruption duration of the live stream. If the actual interruption duration exceeds the threshold, a new recording is generated. Valid values: 15 to 21600. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("DelayTime")
        public Integer delayTime;

        /**
         * <p>The name of the main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The end time of the recording. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-08T03:49:18Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The configuration of on-demand recording. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables on-demand recording.</li>
         * <li><strong>1</strong>: enables on-demand recording that is triggered by HTTP callbacks.</li>
         * <li><strong>2</strong>: enables on-demand recording that is triggered by stream ingest parameters.</li>
         * <li><strong>7</strong>: enables on-demand recording by calling the <a href="https://help.aliyun.com/document_detail/85907.html">RealTimeRecordCommand</a> operation to manually start or stop recording.</li>
         * </ul>
         * <blockquote>
         * <p> If you set OnDemand to <strong>1</strong>, you must call the <a href="https://help.aliyun.com/document_detail/51831.html">AddLiveRecordNotifyConfig</a> operation to configure OnDemandUrl. Otherwise, the configuration of on-demand recording is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnDemond")
        public Integer onDemond;

        /**
         * <p>The name of the Object Storage Service (OSS) bucket in which the recordings are stored.</p>
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
         * <p>The recording formats of original streams.</p>
         */
        @NameInMap("RecordFormatList")
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList recordFormatList;

        /**
         * <p>The start time of the recording. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-08T02:49:18Z</p>
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
         * <p>The recording formats of transcoded streams.</p>
         */
        @NameInMap("TranscodeRecordFormatList")
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatList transcodeRecordFormatList;

        /**
         * <p>The transcoding templates.</p>
         */
        @NameInMap("TranscodeTemplates")
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeTemplates transcodeTemplates;

        public static DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord self = new DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Integer getDelayTime() {
            return this.delayTime;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setOnDemond(Integer onDemond) {
            this.onDemond = onDemond;
            return this;
        }
        public Integer getOnDemond() {
            return this.onDemond;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setRecordFormatList(DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList recordFormatList) {
            this.recordFormatList = recordFormatList;
            return this;
        }
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList getRecordFormatList() {
            return this.recordFormatList;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setTranscodeRecordFormatList(DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatList transcodeRecordFormatList) {
            this.transcodeRecordFormatList = transcodeRecordFormatList;
            return this;
        }
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatList getTranscodeRecordFormatList() {
            return this.transcodeRecordFormatList;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setTranscodeTemplates(DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeTemplates transcodeTemplates) {
            this.transcodeTemplates = transcodeTemplates;
            return this;
        }
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeTemplates getTranscodeTemplates() {
            return this.transcodeTemplates;
        }

    }

    public static class DescribeLiveRecordConfigResponseBodyLiveAppRecordList extends TeaModel {
        @NameInMap("LiveAppRecord")
        public java.util.List<DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord> liveAppRecord;

        public static DescribeLiveRecordConfigResponseBodyLiveAppRecordList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseBodyLiveAppRecordList self = new DescribeLiveRecordConfigResponseBodyLiveAppRecordList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordList setLiveAppRecord(java.util.List<DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord> liveAppRecord) {
            this.liveAppRecord = liveAppRecord;
            return this;
        }
        public java.util.List<DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord> getLiveAppRecord() {
            return this.liveAppRecord;
        }

    }

}
