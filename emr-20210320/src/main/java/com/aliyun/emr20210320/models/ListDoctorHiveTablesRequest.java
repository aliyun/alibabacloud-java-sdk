// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHiveTablesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The basis on which you want to sort the query results. Valid values:</p>
     * <ul>
     * <li>partitionNum: the number of partitions.</li>
     * <li>totalFileCount: the total number of files.</li>
     * <li>largeFileCount: the number of large files. Large files are those with a size greater than 1 GB.</li>
     * <li>mediumFileCount: the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</li>
     * <li>smallFileCount: the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</li>
     * <li>tinyFileCount: the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</li>
     * <li>emptyFileCount: the number of empty files. Empty files are those with a size of 0 MB.</li>
     * <li>largeFileRatio: the proportion of large files. Large files are those with a size greater than 1 GB.</li>
     * <li>mediumFileRatio: the proportion of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</li>
     * <li>smallFileRatio: the proportion of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</li>
     * <li>tinyFileRatio: the proportion of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</li>
     * <li>emptyFileRatio: the proportion of empty files. Empty files are those with a size of 0 MB.</li>
     * <li>hotDataSize: the amount of hot data. Hot data refers to data that is accessed in previous seven days.</li>
     * <li>WarmDataSize: the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</li>
     * <li>coldDataSize: the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</li>
     * <li>freezeDataSize: the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</li>
     * <li>totalDataSize: the total amount of data.</li>
     * <li>hotDataRatio: the proportion of hot data. Hot data refers to data that is accessed in previous seven days.</li>
     * <li>WarmDataRatio: the proportion of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</li>
     * <li>coldDataRatio: the proportion of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</li>
     * <li>freezeDataRatio: the proportion of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</li>
     * <li>totalFileDayGrowthCount: the daily increment of the total number of files.</li>
     * <li>largeFileDayGrowthCount: the daily increment of the number of large files. Large files are those with a size greater than 1 GB.</li>
     * <li>mediumFileDayGrowthCount: the daily increment of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</li>
     * <li>smallFileDayGrowthCount: the daily increment of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</li>
     * <li>tinyFileDayGrowthCount: the daily increment of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</li>
     * <li>emptyFileDayGrowthCount: the daily increment of the number of empty files. Empty files are those with a size of 0 MB.</li>
     * <li>hotDataDayGrowthSize: the daily increment of the amount of hot data. Hot data refers to data that is accessed in previous seven days.</li>
     * <li>warmDataDayGrowthSize: the daily increment of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</li>
     * <li>coldDataDayGrowthSize: the daily increment of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</li>
     * <li>freezeDataDayGrowthSize: the daily increment of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</li>
     * <li>totalDataDayGrowthSize: the daily increment of the amount of total data.</li>
     * <li>totalFileCountDayGrowthRatio: the day-to-day growth rate of the total number of files.</li>
     * <li>largeFileCountDayGrowthRatio: the day-to-day growth rate of the number of large files. Large files are those with a size greater than 1 GB.</li>
     * <li>mediumFileCountDayGrowthRatio: the day-to-day growth rate of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</li>
     * <li>smallFileCountDayGrowthRatio: the day-to-day growth rate of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</li>
     * <li>tinyFileCountDayGrowthRatio: the day-to-day growth rate of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</li>
     * <li>emptyFileCountDayGrowthRatio: the day-to-day growth rate of the number of empty files. Empty files are those with a size of 0 MB.</li>
     * <li>hotDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of hot data. Hot data refers to data that is accessed in previous seven days.</li>
     * <li>warmDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</li>
     * <li>coldDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</li>
     * <li>freezeDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</li>
     * <li>totalDataSizeDayGrowthRatio: the day-to-day growth rate of the total amount of data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>totalFileCount</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the query results. Valid value:</p>
     * <ul>
     * <li>ASC: in ascending order</li>
     * <li>DESC: in descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The table names, which are used to filter the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
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
