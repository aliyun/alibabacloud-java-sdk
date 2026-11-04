// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryMauReportDataRequest extends TeaModel {
    /**
     * <p>The ID of the app instance group, which is used to filter data for a specified app instance group. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. If this parameter is not specified, data is not filtered by app instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The ID of the business region, which is used to filter report data. You can call the <a href="~~ListRegions~~">ListRegions</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The end time of the statistical period. <strong>Required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The value cannot be earlier than <code>StartDate</code>. The statistical interval includes the start and end boundaries. The time span cannot exceed 60 months. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-02 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The page number to query. Specify a value starting from <code>1</code>. If this parameter is not specified, the service processes the request as the first page, but the response may return <code>0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. If this parameter is not specified, the default value is 200. If the specified value is greater than 1500, it is processed as 1500.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. <strong>Required</strong>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>CloudApp</code>: WUYING Cloud App.</li>
     * <li><code>CloudBrowser</code>: Cloud Browser.</li>
     * <li><code>WuyingServer</code>: Enterprise Edition workstation.</li>
     * <li><code>WuyingWorkstation</code>: Personal Edition Linggou container workstation.</li>
     * <li><code>WuyingWorkstationTeam</code>: Linggou Team Edition container workstation.</li>
     * <li><code>WuyingWorkstationBusiness</code>: Linggou Dedicated Edition container workstation.</li>
     * <li><code>AndroidCloud</code>: Cloud Phone.</li>
     * <li><code>AIAgent</code>: AgentBay (AI agent).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The start time of the statistical period. <strong>Required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The statistical interval includes the start and end boundaries. The time span cannot exceed 60 months. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryMauReportDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMauReportDataRequest self = new QueryMauReportDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryMauReportDataRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public QueryMauReportDataRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public QueryMauReportDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryMauReportDataRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryMauReportDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMauReportDataRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryMauReportDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
