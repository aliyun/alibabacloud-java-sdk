// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("FileSystemStatistics")
    @Validation(required = true)
    public DescribeFileSystemStatisticsResponseFileSystemStatistics fileSystemStatistics;

    public static DescribeFileSystemStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemStatisticsResponse self = new DescribeFileSystemStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileSystemStatisticsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFileSystemStatisticsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemStatisticsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemStatisticsResponse setFileSystemStatistics(DescribeFileSystemStatisticsResponseFileSystemStatistics fileSystemStatistics) {
        this.fileSystemStatistics = fileSystemStatistics;
        return this;
    }
    public DescribeFileSystemStatisticsResponseFileSystemStatistics getFileSystemStatistics() {
        return this.fileSystemStatistics;
    }

    public static class DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic extends TeaModel {
        @NameInMap("FileSystemType")
        @Validation(required = true)
        public String fileSystemType;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("MeteredSize")
        @Validation(required = true)
        public Long meteredSize;

        @NameInMap("ExpiredCount")
        @Validation(required = true)
        public Integer expiredCount;

        @NameInMap("ExpiringCount")
        @Validation(required = true)
        public Integer expiringCount;

        public static DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic self = new DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic setExpiredCount(Integer expiredCount) {
            this.expiredCount = expiredCount;
            return this;
        }
        public Integer getExpiredCount() {
            return this.expiredCount;
        }

        public DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic setExpiringCount(Integer expiringCount) {
            this.expiringCount = expiringCount;
            return this;
        }
        public Integer getExpiringCount() {
            return this.expiringCount;
        }

    }

    public static class DescribeFileSystemStatisticsResponseFileSystemStatistics extends TeaModel {
        @NameInMap("FileSystemStatistic")
        @Validation(required = true)
        public java.util.List<DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic> fileSystemStatistic;

        public static DescribeFileSystemStatisticsResponseFileSystemStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseFileSystemStatistics self = new DescribeFileSystemStatisticsResponseFileSystemStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseFileSystemStatistics setFileSystemStatistic(java.util.List<DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic> fileSystemStatistic) {
            this.fileSystemStatistic = fileSystemStatistic;
            return this;
        }
        public java.util.List<DescribeFileSystemStatisticsResponseFileSystemStatisticsFileSystemStatistic> getFileSystemStatistic() {
            return this.fileSystemStatistic;
        }

    }

}
