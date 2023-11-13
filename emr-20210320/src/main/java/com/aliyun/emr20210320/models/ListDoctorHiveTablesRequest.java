// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHiveTablesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The basis on which you want to sort the query results. Valid value:</p>
     * <br>
     * <p>*   partitionNum: the number of partitions.</p>
     * <p>*   totalFileCount: the total number of files.</p>
     * <p>*   largeFileCount: the number of large files. Large files are those with a size greater than 1 GB.</p>
     * <p>*   mediumFileCount: the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
     * <p>*   smallFileCount: the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
     * <p>*   tinyFileCount: the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
     * <p>*   emptyFileCount: the number of empty files. Empty files are those with a size of 0 MB.</p>
     * <p>*   largeFileRatio: the proportion of large files. Large files are those with a size greater than 1 GB.</p>
     * <p>*   mediumFileRatio: the proportion of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
     * <p>*   smallFileRatio: the proportion of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
     * <p>*   tinyFileRatio: the proportion of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
     * <p>*   emptyFileRatio: the proportion of empty files. Empty files are those with a size of 0 MB.</p>
     * <p>*   hotDataSize: the amount of hot data. Hot data refers to data that is accessed in recent seven days.</p>
     * <p>*   warmDataSize: the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.</p>
     * <p>*   coldDataSize: the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.</p>
     * <p>*   freezeDataSize: the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
     * <p>*   totalDataSize: the total amount of data.</p>
     * <p>*   hotDataRatio: the proportion of hot data. Hot data refers to data that is accessed in recent seven days.</p>
     * <p>*   awmDataRatio: the proportion of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.</p>
     * <p>*   coldDataRatio: the proportion of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.</p>
     * <p>*   freezeDataRatio: the proportion of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
     * <p>*   totalFileDayGrowthCount: the daily increment of the total number of files.</p>
     * <p>*   largeFileDayGrowthCount: the daily increment of the number of large files. Large files are those with a size greater than 1 GB.</p>
     * <p>*   mediumFileDayGrowthCount: the daily increment of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
     * <p>*   smallFileDayGrowthCount: the daily increment of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
     * <p>*   tinyFileDayGrowthCount: the daily increment of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
     * <p>*   emptyFileDayGrowthCount: the daily increment of the number of empty files. Empty files are those with a size of 0 MB.</p>
     * <p>*   hotDataDayGrowthSize: The daily increment of the amount of hot data. Hot data refers to data that is accessed in recent seven days.</p>
     * <p>*   warmDataDayGrowthSize: the daily increment of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.</p>
     * <p>*   coldDataDayGrowthSize: The daily increment of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.</p>
     * <p>*   freezeDataDayGrowthSize: The daily increment of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
     * <p>*   totalDataDayGrowthSize: the daily incremental of the total data volume.</p>
     * <p>*   totalFileCountDayGrowthRatio: the day-to-day growth rate of the total number of files.</p>
     * <p>*   largeFileCountDayGrowthRatio: the day-to-day growth rate of the number of large files. Large files are those with a size greater than 1 GB.</p>
     * <p>*   mediumFileCountDayGrowthRatio: the day-to-day growth rate of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
     * <p>*   smallFileCountDayGrowthRatio: the day-to-day growth rate of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
     * <p>*   tinyFileCountDayGrowthRatio: the day-to-day growth rate of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
     * <p>*   emptyFileCountDayGrowthRatio: the day-to-day growth rate of the number of empty files. Empty files are those with a size of 0 MB.</p>
     * <p>*   hotDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of hot data. Hot data refers to data that is accessed in recent seven days.</p>
     * <p>*   warmDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.</p>
     * <p>*   coldDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.</p>
     * <p>*   freezeDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
     * <p>*   totalDataSizeDayGrowthRatio: the day-to-day growth rate of the total data volume.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the query results. Valid value:</p>
     * <br>
     * <p>*   ASC: in ascending order</p>
     * <p>*   DESC: in descending order</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The table names, which are used to filter the query results.</p>
     */
    @NameInMap("TableNames")
    public java.util.List<String> tableNames;

    public static ListDoctorHiveTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHiveTablesRequest self = new ListDoctorHiveTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListDoctorHiveTablesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDoctorHiveTablesRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public ListDoctorHiveTablesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorHiveTablesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorHiveTablesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDoctorHiveTablesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDoctorHiveTablesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDoctorHiveTablesRequest setTableNames(java.util.List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

}
