// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseDataBackupsRequest extends TeaModel {
    /**
     * <p>The ID of the backup set. You can obtain the ID from the BackupSetId parameter returned by the ListSupabaseDataBackups operation.</p>
     * 
     * <strong>example:</strong>
     * <p>327329803</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The backup pattern. Valid values: Automated: automatic backup. Manual: manual backup.</p>
     * 
     * <strong>example:</strong>
     * <p>Automated</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The status of the backup set. Valid values: Success: the backup is successful; Failed: the backup fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("BackupStatus")
    public String backupStatus;

    /**
     * <p>The backup type. Valid values: DATA: full backup; RESTOREPOI: restorable point.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The end time of the query. The end time must be later than the start time. Format: yyyy-MM-ddTHH:mmZ (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2011-06-01T16:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of entries to return for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The paging token for paged query. Do not specify this parameter for the first request. For subsequent requests, specify the NextToken value returned by the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of an integer. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li>30</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Instance ID of the Supabase instance. You can obtain instance ID from the Supabase page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-263****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the query. Format: yyyy-MM-ddTHH:mmZ (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2011-06-01T15:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListSupabaseDataBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseDataBackupsRequest self = new ListSupabaseDataBackupsRequest();
        return TeaModel.build(map, self);
    }

    public ListSupabaseDataBackupsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public ListSupabaseDataBackupsRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public ListSupabaseDataBackupsRequest setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }
    public String getBackupStatus() {
        return this.backupStatus;
    }

    public ListSupabaseDataBackupsRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ListSupabaseDataBackupsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListSupabaseDataBackupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSupabaseDataBackupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupabaseDataBackupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSupabaseDataBackupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSupabaseDataBackupsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListSupabaseDataBackupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSupabaseDataBackupsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
