// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumDataForPageRequest extends TeaModel {
    /**
     * <p>The group to which the application belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AppGroup")
    public String appGroup;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The beginning of the time range to query. The time is accurate to seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1713774233</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>iixxxjcnuk@582846f37******</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>A query statement that complies with the query syntax of Simple Log Service Logstore. For more information, see the parameters corresponding to this operation on the console page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>and app.id: xxxx@586810fbxxxx19f</li>
     * </ul>
     */
    @NameInMap("Query")
    public String query;

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
     * <p>The beginning of the time range to query. The time is accurate to seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1713687833</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("Workspace")
    public String workspace;

    public static GetRumDataForPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumDataForPageRequest self = new GetRumDataForPageRequest();
        return TeaModel.build(map, self);
    }

    public GetRumDataForPageRequest setAppGroup(String appGroup) {
        this.appGroup = appGroup;
        return this;
    }
    public String getAppGroup() {
        return this.appGroup;
    }

    public GetRumDataForPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetRumDataForPageRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public GetRumDataForPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRumDataForPageRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRumDataForPageRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetRumDataForPageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRumDataForPageRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public GetRumDataForPageRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
