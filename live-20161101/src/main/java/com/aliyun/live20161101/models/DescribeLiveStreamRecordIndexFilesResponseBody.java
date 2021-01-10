// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordIndexFilesResponseBody extends TeaModel {
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

    @NameInMap("RecordIndexInfoList")
    public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoList recordIndexInfoList;

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

    public DescribeLiveStreamRecordIndexFilesResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamRecordIndexFilesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
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

    public static class DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo extends TeaModel {
        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("RecordUrl")
        public String recordUrl;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("OssObject")
        public String ossObject;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        public static DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo self = new DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBodyRecordIndexInfoListRecordIndexInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
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
