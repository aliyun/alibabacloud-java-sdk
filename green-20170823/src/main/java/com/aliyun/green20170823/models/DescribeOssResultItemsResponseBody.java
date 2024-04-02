// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssResultItemsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryId")
    public String queryId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScanResultList")
    public java.util.List<DescribeOssResultItemsResponseBodyScanResultList> scanResultList;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOssResultItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssResultItemsResponseBody self = new DescribeOssResultItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssResultItemsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOssResultItemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOssResultItemsResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeOssResultItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssResultItemsResponseBody setScanResultList(java.util.List<DescribeOssResultItemsResponseBodyScanResultList> scanResultList) {
        this.scanResultList = scanResultList;
        return this;
    }
    public java.util.List<DescribeOssResultItemsResponseBodyScanResultList> getScanResultList() {
        return this.scanResultList;
    }

    public DescribeOssResultItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOssResultItemsResponseBodyScanResultListFrameResults extends TeaModel {
        @NameInMap("Offset")
        public Integer offset;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("Url")
        public String url;

        public static DescribeOssResultItemsResponseBodyScanResultListFrameResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssResultItemsResponseBodyScanResultListFrameResults self = new DescribeOssResultItemsResponseBodyScanResultListFrameResults();
            return TeaModel.build(map, self);
        }

        public DescribeOssResultItemsResponseBodyScanResultListFrameResults setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public DescribeOssResultItemsResponseBodyScanResultListFrameResults setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public DescribeOssResultItemsResponseBodyScanResultListFrameResults setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults extends TeaModel {
        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("Label")
        public String label;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("Text")
        public String text;

        public static DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults self = new DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults();
            return TeaModel.build(map, self);
        }

        public DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class DescribeOssResultItemsResponseBodyScanResultList extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Content")
        public String content;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("FrameResults")
        public java.util.List<DescribeOssResultItemsResponseBodyScanResultListFrameResults> frameResults;

        @NameInMap("HandleStatus")
        public Integer handleStatus;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NewUrl")
        public String newUrl;

        @NameInMap("Object")
        public String object;

        @NameInMap("RequestTime")
        public String requestTime;

        @NameInMap("ResourceStatus")
        public Integer resourceStatus;

        @NameInMap("ScanFinishedTime")
        public String scanFinishedTime;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("VoiceSegmentAntispamResults")
        public java.util.List<DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults> voiceSegmentAntispamResults;

        public static DescribeOssResultItemsResponseBodyScanResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssResultItemsResponseBodyScanResultList self = new DescribeOssResultItemsResponseBodyScanResultList();
            return TeaModel.build(map, self);
        }

        public DescribeOssResultItemsResponseBodyScanResultList setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setFrameResults(java.util.List<DescribeOssResultItemsResponseBodyScanResultListFrameResults> frameResults) {
            this.frameResults = frameResults;
            return this;
        }
        public java.util.List<DescribeOssResultItemsResponseBodyScanResultListFrameResults> getFrameResults() {
            return this.frameResults;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setHandleStatus(Integer handleStatus) {
            this.handleStatus = handleStatus;
            return this;
        }
        public Integer getHandleStatus() {
            return this.handleStatus;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setNewUrl(String newUrl) {
            this.newUrl = newUrl;
            return this;
        }
        public String getNewUrl() {
            return this.newUrl;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setResourceStatus(Integer resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public Integer getResourceStatus() {
            return this.resourceStatus;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setScanFinishedTime(String scanFinishedTime) {
            this.scanFinishedTime = scanFinishedTime;
            return this;
        }
        public String getScanFinishedTime() {
            return this.scanFinishedTime;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public DescribeOssResultItemsResponseBodyScanResultList setVoiceSegmentAntispamResults(java.util.List<DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults> voiceSegmentAntispamResults) {
            this.voiceSegmentAntispamResults = voiceSegmentAntispamResults;
            return this;
        }
        public java.util.List<DescribeOssResultItemsResponseBodyScanResultListVoiceSegmentAntispamResults> getVoiceSegmentAntispamResults() {
            return this.voiceSegmentAntispamResults;
        }

    }

}
