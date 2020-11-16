// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Order")
    @Validation(required = true)
    public String order;

    @NameInMap("TotalNum")
    @Validation(required = true)
    public Integer totalNum;

    @NameInMap("TotalPage")
    @Validation(required = true)
    public Integer totalPage;

    @NameInMap("LiveAppRecordList")
    @Validation(required = true)
    public DescribeLiveRecordConfigResponseLiveAppRecordList liveAppRecordList;

    public static DescribeLiveRecordConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordConfigResponse self = new DescribeLiveRecordConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRecordConfigResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveRecordConfigResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveRecordConfigResponse setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveRecordConfigResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveRecordConfigResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveRecordConfigResponse setLiveAppRecordList(DescribeLiveRecordConfigResponseLiveAppRecordList liveAppRecordList) {
        this.liveAppRecordList = liveAppRecordList;
        return this;
    }
    public DescribeLiveRecordConfigResponseLiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    public static class DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat extends TeaModel {
        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("OssObjectPrefix")
        @Validation(required = true)
        public String ossObjectPrefix;

        @NameInMap("SliceOssObjectPrefix")
        @Validation(required = true)
        public String sliceOssObjectPrefix;

        @NameInMap("CycleDuration")
        @Validation(required = true)
        public Integer cycleDuration;

        public static DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat self = new DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

    }

    public static class DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatList extends TeaModel {
        @NameInMap("RecordFormat")
        @Validation(required = true)
        public java.util.List<DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat> recordFormat;

        public static DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatList self = new DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatList setRecordFormat(java.util.List<DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat> recordFormat) {
            this.recordFormat = recordFormat;
            return this;
        }
        public java.util.List<DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatListRecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

    }

    public static class DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("OssEndpoint")
        @Validation(required = true)
        public String ossEndpoint;

        @NameInMap("OssBucket")
        @Validation(required = true)
        public String ossBucket;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("OnDemond")
        @Validation(required = true)
        public Integer onDemond;

        @NameInMap("RecordFormatList")
        @Validation(required = true)
        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatList recordFormatList;

        public static DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord self = new DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setOnDemond(Integer onDemond) {
            this.onDemond = onDemond;
            return this;
        }
        public Integer getOnDemond() {
            return this.onDemond;
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord setRecordFormatList(DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatList recordFormatList) {
            this.recordFormatList = recordFormatList;
            return this;
        }
        public DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecordRecordFormatList getRecordFormatList() {
            return this.recordFormatList;
        }

    }

    public static class DescribeLiveRecordConfigResponseLiveAppRecordList extends TeaModel {
        @NameInMap("LiveAppRecord")
        @Validation(required = true)
        public java.util.List<DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord> liveAppRecord;

        public static DescribeLiveRecordConfigResponseLiveAppRecordList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordConfigResponseLiveAppRecordList self = new DescribeLiveRecordConfigResponseLiveAppRecordList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordConfigResponseLiveAppRecordList setLiveAppRecord(java.util.List<DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord> liveAppRecord) {
            this.liveAppRecord = liveAppRecord;
            return this;
        }
        public java.util.List<DescribeLiveRecordConfigResponseLiveAppRecordListLiveAppRecord> getLiveAppRecord() {
            return this.liveAppRecord;
        }

    }

}
