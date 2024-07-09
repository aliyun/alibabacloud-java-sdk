// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteUsersRequest extends TeaModel {
    /**
     * <p>The query string for fuzzy query.</p>
     * 
     * <strong>example:</strong>
     * <p><em>jin</em></p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Valid values: 1 to 100.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request or if no next query exists. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The organizational unit (OU) of the specified AD domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/Domain Controllers</p>
     */
    @NameInMap("OUPath")
    public String OUPath;

    /**
     * <p>The office network ID. The office network must be of the enterprise AD account type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListOfficeSiteUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteUsersRequest self = new ListOfficeSiteUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListOfficeSiteUsersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOfficeSiteUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeSiteUsersRequest setOUPath(String OUPath) {
        this.OUPath = OUPath;
        return this;
    }
    public String getOUPath() {
        return this.OUPath;
    }

    public ListOfficeSiteUsersRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListOfficeSiteUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
