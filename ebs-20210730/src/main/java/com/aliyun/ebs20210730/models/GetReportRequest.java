// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class GetReportRequest extends TeaModel {
    /**
     * <p>Optional. This parameter takes effect only when ReportType is set to present.</p>
     * 
     * <strong>example:</strong>
     * <p>App1</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The region ID. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>When ReportType is set to history, this parameter is required. The system queries the historical report based on the specified ReportId.</p>
     * 
     * <strong>example:</strong>
     * <p>report-74fbea80e802xxxx</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>Valid values:</p>
     * <ul>
     * <li>history</li>
     * <li>present</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>history</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    public static GetReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportRequest self = new GetReportRequest();
        return TeaModel.build(map, self);
    }

    public GetReportRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetReportRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

}
