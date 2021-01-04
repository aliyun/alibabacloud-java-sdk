// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemStatisticsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FileSystemStatistics")
    public DescribeFileSystemStatisticsResponseBodyFileSystemStatistics fileSystemStatistics;

    public static DescribeFileSystemStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemStatisticsResponseBody self = new DescribeFileSystemStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFileSystemStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileSystemStatisticsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemStatisticsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemStatisticsResponseBody setFileSystemStatistics(DescribeFileSystemStatisticsResponseBodyFileSystemStatistics fileSystemStatistics) {
        this.fileSystemStatistics = fileSystemStatistics;
        return this;
    }
    public DescribeFileSystemStatisticsResponseBodyFileSystemStatistics getFileSystemStatistics() {
        return this.fileSystemStatistics;
    }

    public static class DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic extends TeaModel {
        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("MeteredSize")
        public Long meteredSize;

        @NameInMap("ExpiringCount")
        public Integer expiringCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ExpiredCount")
        public Integer expiredCount;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic self = new DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setExpiringCount(Integer expiringCount) {
            this.expiringCount = expiringCount;
            return this;
        }
        public Integer getExpiringCount() {
            return this.expiringCount;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setExpiredCount(Integer expiredCount) {
            this.expiredCount = expiredCount;
            return this;
        }
        public Integer getExpiredCount() {
            return this.expiredCount;
        }

    }

    public static class DescribeFileSystemStatisticsResponseBodyFileSystemStatistics extends TeaModel {
        @NameInMap("FileSystemStatistic")
        public java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic> fileSystemStatistic;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemStatistics self = new DescribeFileSystemStatisticsResponseBodyFileSystemStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatistics setFileSystemStatistic(java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic> fileSystemStatistic) {
            this.fileSystemStatistic = fileSystemStatistic;
            return this;
        }
        public java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic> getFileSystemStatistic() {
            return this.fileSystemStatistic;
        }

    }

}
