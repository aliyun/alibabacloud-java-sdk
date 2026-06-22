// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHDFSDirectoriesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The date. The value is in the ISO 8601 format. For example, 2023-01-01 represents January 1, 2023.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The path of the directory. The directory depth cannot exceed five levels. If you do not specify this parameter, the analysis results of all directories are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>/tmp/test</p>
     */
    @NameInMap("DirPath")
    public String dirPath;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The property based on which to sort the query results. Valid values:</p>
     * <ul>
     * <li><p>totalFileCount: the total number of files.</p>
     * </li>
     * <li><p>largeFileCount: the number of large files. A large file is 1 GB or larger.</p>
     * </li>
     * <li><p>mediumFileCount: the number of medium-sized files. A medium-sized file is larger than 128 MB and smaller than 1 GB.</p>
     * </li>
     * <li><p>smallFileCount: the number of small files. A small file is larger than 10 MB and less than or equal to 128 MB.</p>
     * </li>
     * <li><p>tinyFileCount: the number of tiny files. A tiny file is larger than 0 MB and less than or equal to 10 MB.</p>
     * </li>
     * <li><p>emptyFileCount: the number of empty files. An empty file is 0 MB in size.</p>
     * </li>
     * <li><p>hotDataSize: the size of hot data. Hot data is data that was accessed in the last 7 days.</p>
     * </li>
     * <li><p>warmDataSize: the size of warm data. Warm data is data that was not accessed in the last 7 days but was accessed in the last 30 days.</p>
     * </li>
     * <li><p>coldDataSize: the size of cold data. Cold data is data that was not accessed in the last 30 days but was accessed in the last 90 days.</p>
     * </li>
     * <li><p>freezeDataSize: the size of freeze data. Freeze data is data that was not accessed in the last 90 days.</p>
     * </li>
     * <li><p>totalDataSize: the total data size.</p>
     * </li>
     * <li><p>totalFileDayGrowthCount: the daily increase in the total number of files.</p>
     * </li>
     * <li><p>largeFileDayGrowthCount: the daily increase in the number of large files. A large file is 1 GB or larger.</p>
     * </li>
     * <li><p>mediumFileDayGrowthCount: the daily increase in the number of medium-sized files. A medium-sized file is larger than 128 MB and smaller than 1 GB.</p>
     * </li>
     * <li><p>smallFileDayGrowthCount: the daily increase in the number of small files. A small file is larger than 10 MB and less than or equal to 128 MB.</p>
     * </li>
     * <li><p>tinyFileDayGrowthCount: the daily increase in the number of tiny files. A tiny file is larger than 0 MB and less than or equal to 10 MB.</p>
     * </li>
     * <li><p>emptyFileDayGrowthCount: the daily increase in the number of empty files. An empty file is 0 MB in size.</p>
     * </li>
     * <li><p>hotDataDayGrowthSize: the daily increase in the size of hot data. Hot data is data that was accessed in the last 7 days.</p>
     * </li>
     * <li><p>warmDataDayGrowthSize: the daily increase in the size of warm data. Warm data is data that was not accessed in the last 7 days but was accessed in the last 30 days.</p>
     * </li>
     * <li><p>coldDataDayGrowthSize: the daily increase in the size of cold data. Cold data is data that was not accessed in the last 30 days but was accessed in the last 90 days.</p>
     * </li>
     * <li><p>freezeDataDayGrowthSize: the daily increase in the size of freeze data. Freeze data is data that was not accessed in the last 90 days.</p>
     * </li>
     * <li><p>totalDataDayGrowthSize: the daily increase in the total data size.</p>
     * </li>
     * <li><p>totalFileCountDayGrowthRatio: the day-over-day growth ratio of the total number of files.</p>
     * </li>
     * <li><p>largeFileCountDayGrowthRatio: the day-over-day growth ratio of the number of large files. A large file is 1 GB or larger.</p>
     * </li>
     * <li><p>mediumFileCountDayGrowthRatio: the day-over-day growth ratio of the number of medium-sized files. A medium-sized file is larger than 128 MB and smaller than 1 GB.</p>
     * </li>
     * <li><p>smallFileCountDayGrowthRatio: the day-over-day growth ratio of the number of small files. A small file is larger than 10 MB and less than or equal to 128 MB.</p>
     * </li>
     * <li><p>tinyFileCountDayGrowthRatio: the day-over-day growth ratio of the number of tiny files. A tiny file is larger than 0 MB and less than or equal to 10 MB.</p>
     * </li>
     * <li><p>emptyFileCountDayGrowthRatio: the day-over-day growth ratio of the number of empty files. An empty file is 0 MB in size.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>smallFileCount</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>ASC: ascending</p>
     * </li>
     * <li><p>DESC: descending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListDoctorHDFSDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHDFSDirectoriesRequest self = new ListDoctorHDFSDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListDoctorHDFSDirectoriesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDoctorHDFSDirectoriesRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public ListDoctorHDFSDirectoriesRequest setDirPath(String dirPath) {
        this.dirPath = dirPath;
        return this;
    }
    public String getDirPath() {
        return this.dirPath;
    }

    public ListDoctorHDFSDirectoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorHDFSDirectoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorHDFSDirectoriesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDoctorHDFSDirectoriesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDoctorHDFSDirectoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
