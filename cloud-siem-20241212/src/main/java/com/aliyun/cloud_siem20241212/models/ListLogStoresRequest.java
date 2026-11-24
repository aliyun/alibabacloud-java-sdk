// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListLogStoresRequest extends TeaModel {
    /**
     * <p>The language of the returned message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * Note: This parameter is actually required. If it is not provided, the API returns a 400 error (The specified Lang can not be empty.).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the Simple Log Service project. The project name follows the naming convention aliyun-cloudsiem-data-{userId}-{regionId}. You can call the GetDataStorage operation and obtain a valid project name from the Data.LogProject field in the response. This parameter is actually required. You can call the GetDataStorage operation to obtain valid values.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
     */
    @NameInMap("LogProjectName")
    public String logProjectName;

    /**
     * <p>The log storage region ID. This parameter is required when LogProjectName is provided, and the log storage region must be consistent with the log project. You can call the GetDataStorage operation to obtain valid values.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LogRegionId")
    public String logRegionId;

    /**
     * <p>The ID of the data ingestion user.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("LogUserId")
    public Long logUserId;

    /**
     * <p>The maximum number of entries to return for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. If this is the first query or no subsequent query is required, you do not need to specify this parameter. If a subsequent query is required, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region of the data management center for threat analysis. You must select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListLogStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogStoresRequest self = new ListLogStoresRequest();
        return TeaModel.build(map, self);
    }

    public ListLogStoresRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListLogStoresRequest setLogProjectName(String logProjectName) {
        this.logProjectName = logProjectName;
        return this;
    }
    public String getLogProjectName() {
        return this.logProjectName;
    }

    public ListLogStoresRequest setLogRegionId(String logRegionId) {
        this.logRegionId = logRegionId;
        return this;
    }
    public String getLogRegionId() {
        return this.logRegionId;
    }

    public ListLogStoresRequest setLogUserId(Long logUserId) {
        this.logUserId = logUserId;
        return this;
    }
    public Long getLogUserId() {
        return this.logUserId;
    }

    public ListLogStoresRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLogStoresRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLogStoresRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListLogStoresRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
