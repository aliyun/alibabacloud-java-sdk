// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordConfigResponseBody extends TeaModel {
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
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        @NameInMap("Format")
        public String format;

        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("SliceDuration")
        public Integer sliceDuration;

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
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        @NameInMap("Format")
        public String format;

        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("SliceDuration")
        public Integer sliceDuration;

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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DelayTime")
        public Integer delayTime;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("OnDemond")
        public Integer onDemond;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("RecordFormatList")
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList recordFormatList;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("TranscodeRecordFormatList")
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordTranscodeRecordFormatList transcodeRecordFormatList;

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
