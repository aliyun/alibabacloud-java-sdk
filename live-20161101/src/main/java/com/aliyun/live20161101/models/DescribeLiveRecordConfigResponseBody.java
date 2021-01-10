// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordConfigResponseBody extends TeaModel {
    @NameInMap("Order")
    public String order;

    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("LiveAppRecordList")
    public DescribeLiveRecordConfigResponseBodyLiveAppRecordList liveAppRecordList;

    public static DescribeLiveRecordConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordConfigResponseBody self = new DescribeLiveRecordConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordConfigResponseBody setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveRecordConfigResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveRecordConfigResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveRecordConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRecordConfigResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveRecordConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveRecordConfigResponseBody setLiveAppRecordList(DescribeLiveRecordConfigResponseBodyLiveAppRecordList liveAppRecordList) {
        this.liveAppRecordList = liveAppRecordList;
        return this;
    }
    public DescribeLiveRecordConfigResponseBodyLiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    public static class DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("Format")
        public String format;

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

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
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

    public static class DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("OnDemond")
        public Integer onDemond;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("RecordFormatList")
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList recordFormatList;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        public static DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord self = new DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setRecordFormatList(DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList recordFormatList) {
            this.recordFormatList = recordFormatList;
            return this;
        }
        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecordRecordFormatList getRecordFormatList() {
            return this.recordFormatList;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveRecordConfigResponseBodyLiveAppRecordListLiveAppRecord setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
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
