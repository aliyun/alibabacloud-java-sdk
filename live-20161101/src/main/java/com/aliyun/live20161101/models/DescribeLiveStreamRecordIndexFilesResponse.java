// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordIndexFilesResponse extends TeaModel {
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

    @NameInMap("RecordIndexInfoList")
    @Validation(required = true)
    public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoList recordIndexInfoList;

    public static DescribeLiveStreamRecordIndexFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordIndexFilesResponse self = new DescribeLiveStreamRecordIndexFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordIndexFilesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamRecordIndexFilesResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamRecordIndexFilesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamRecordIndexFilesResponse setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveStreamRecordIndexFilesResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamRecordIndexFilesResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveStreamRecordIndexFilesResponse setRecordIndexInfoList(DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoList recordIndexInfoList) {
        this.recordIndexInfoList = recordIndexInfoList;
        return this;
    }
    public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoList getRecordIndexInfoList() {
        return this.recordIndexInfoList;
    }

    public static class DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo extends TeaModel {
        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("RecordUrl")
        @Validation(required = true)
        public String recordUrl;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("OssBucket")
        @Validation(required = true)
        public String ossBucket;

        @NameInMap("OssEndpoint")
        @Validation(required = true)
        public String ossEndpoint;

        @NameInMap("OssObject")
        @Validation(required = true)
        public String ossObject;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public Float duration;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo self = new DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoList extends TeaModel {
        @NameInMap("RecordIndexInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo> recordIndexInfo;

        public static DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoList self = new DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoList setRecordIndexInfo(java.util.List<DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo> recordIndexInfo) {
            this.recordIndexInfo = recordIndexInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamRecordIndexFilesResponseRecordIndexInfoListRecordIndexInfo> getRecordIndexInfo() {
            return this.recordIndexInfo;
        }

    }

}
