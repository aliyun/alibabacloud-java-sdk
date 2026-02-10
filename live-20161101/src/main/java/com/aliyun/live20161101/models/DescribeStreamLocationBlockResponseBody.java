// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeStreamLocationBlockResponseBody extends TeaModel {
    /**
     * <p>The total number of entries that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7C69682-7F88-40DD-A198-10D0309E439B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamBlockList")
    public DescribeStreamLocationBlockResponseBodyStreamBlockList streamBlockList;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeStreamLocationBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamLocationBlockResponseBody self = new DescribeStreamLocationBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamLocationBlockResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeStreamLocationBlockResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeStreamLocationBlockResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStreamLocationBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamLocationBlockResponseBody setStreamBlockList(DescribeStreamLocationBlockResponseBodyStreamBlockList streamBlockList) {
        this.streamBlockList = streamBlockList;
        return this;
    }
    public DescribeStreamLocationBlockResponseBodyStreamBlockList getStreamBlockList() {
        return this.streamBlockList;
    }

    public DescribeStreamLocationBlockResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BlockType")
        public String blockType;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("LocationList")
        public String locationList;

        @NameInMap("ReleaseTime")
        public String releaseTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock build(java.util.Map<String, ?> map) throws Exception {
            DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock self = new DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock();
            return TeaModel.build(map, self);
        }

        public DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock setBlockType(String blockType) {
            this.blockType = blockType;
            return this;
        }
        public String getBlockType() {
            return this.blockType;
        }

        public DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock setLocationList(String locationList) {
            this.locationList = locationList;
            return this;
        }
        public String getLocationList() {
            return this.locationList;
        }

        public DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeStreamLocationBlockResponseBodyStreamBlockList extends TeaModel {
        @NameInMap("StreamBlock")
        public java.util.List<DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock> streamBlock;

        public static DescribeStreamLocationBlockResponseBodyStreamBlockList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStreamLocationBlockResponseBodyStreamBlockList self = new DescribeStreamLocationBlockResponseBodyStreamBlockList();
            return TeaModel.build(map, self);
        }

        public DescribeStreamLocationBlockResponseBodyStreamBlockList setStreamBlock(java.util.List<DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock> streamBlock) {
            this.streamBlock = streamBlock;
            return this;
        }
        public java.util.List<DescribeStreamLocationBlockResponseBodyStreamBlockListStreamBlock> getStreamBlock() {
            return this.streamBlock;
        }

    }

}
