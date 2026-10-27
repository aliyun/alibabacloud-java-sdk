// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaPendingDesktopsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The name of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-computer</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The maximum number of entries per page for a paged query.</p>
     * <ul>
     * <li>Maximum value: 100</li>
     * <li>Default value: 20</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set the value to the <code>NextToken</code> value returned from the previous call to this operation. You do not need to specify this parameter for the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the office network. You can call the <a href="https://help.aliyun.com/document_detail/216071.html">DescribeOfficeSites</a> operation to obtain this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+dir-428216****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the list of regions supported by cloud computers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about the image upgrade task. You can call the <a href="https://help.aliyun.com/document_detail/437001.html">DescribeFotaTasks</a> operation to obtain this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>aot-c4khwrp9ocml4****</p>
     */
    @NameInMap("TaskUid")
    public String taskUid;

    public static DescribeFotaPendingDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFotaPendingDesktopsRequest self = new DescribeFotaPendingDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFotaPendingDesktopsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeFotaPendingDesktopsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribeFotaPendingDesktopsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFotaPendingDesktopsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFotaPendingDesktopsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeFotaPendingDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFotaPendingDesktopsRequest setTaskUid(String taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public String getTaskUid() {
        return this.taskUid;
    }

}
