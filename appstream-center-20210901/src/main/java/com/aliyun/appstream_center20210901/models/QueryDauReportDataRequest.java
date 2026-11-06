// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryDauReportDataRequest extends TeaModel {
    /**
     * <p>The ID of the app instance group, which is used to filter data for a specific app instance group. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. If this parameter is not specified, data is not filtered by app instance group.</p>
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
     * <p>The end time of the statistics period. This parameter is required. Format: yyyy-MM-dd HH:mm:ss. The value cannot be earlier than StartDate. The service extracts the natural day in the yyyy-MM-dd format. The string does not contain a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-30 23:59:59</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The page number to query. Specify a value starting from 1. If this parameter is not specified, the service processes the request as the first page, but the response may return 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Default value: 200. If the specified value is greater than 1,500, the value is processed as 1,500.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. This parameter is optional. If this parameter is not specified or is unrecognized, the query defaults to CloudApp.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: Wuying Cloud App.</li>
     * <li>CloudBrowser: Cloud browser.</li>
     * <li>WuyingServer: Enterprise Edition workstation.</li>
     * <li>WuyingWorkstation: Personal Edition Linggou container workstation.</li>
     * <li>WuyingWorkstationTeam: Linggou Team Edition container workstation.</li>
     * <li>WuyingWorkstationBusiness: Linggou Dedicated Edition container workstation.</li>
     * <li>AndroidCloud: Cloud phone.</li>
     * <li>AIAgent: AgentBay (AI agent).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The start time of the statistics period. This parameter is required. Format: yyyy-MM-dd HH:mm:ss. The service extracts the natural day in the yyyy-MM-dd format. The date range is inclusive and cannot exceed 180 days. The string does not contain a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryDauReportDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDauReportDataRequest self = new QueryDauReportDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDauReportDataRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public QueryDauReportDataRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public QueryDauReportDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryDauReportDataRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDauReportDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDauReportDataRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryDauReportDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
