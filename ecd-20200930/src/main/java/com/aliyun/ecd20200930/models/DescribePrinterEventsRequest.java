// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePrinterEventsRequest extends TeaModel {
    /**
     * <p>The cloud computer ID. If you do not specify this parameter, all cloud computers in the region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The cloud computer name.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop-001</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The end time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC+0. If you do not specify this parameter, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-31T06:32:31Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The logon user information, which is a RAM user ID or an Active Directory (AD) username. If you do not specify this parameter, events of all users in the region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>user001</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The list of end user IDs.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The number of entries per page in a paged query. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the value of NextToken that was returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The printer driver name.</p>
     * 
     * <strong>example:</strong>
     * <p>HP LaserJet PCL 6</p>
     */
    @NameInMap("PrinterDriver")
    public String printerDriver;

    /**
     * <p>The printer name.</p>
     * 
     * <strong>example:</strong>
     * <p>HP LaserJet Pro</p>
     */
    @NameInMap("PrinterName")
    public String printerName;

    /**
     * <p>The printer redirection type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PrinterRedirType")
    public Integer printerRedirType;

    /**
     * <p>The region ID. You can call DescribeRegions to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC+0. If you do not specify this parameter, the query starts from the time that is calculated backward from the time specified by <code>EndTime</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-23T04:10:21Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePrinterEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrinterEventsRequest self = new DescribePrinterEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrinterEventsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribePrinterEventsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribePrinterEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePrinterEventsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribePrinterEventsRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribePrinterEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePrinterEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePrinterEventsRequest setPrinterDriver(String printerDriver) {
        this.printerDriver = printerDriver;
        return this;
    }
    public String getPrinterDriver() {
        return this.printerDriver;
    }

    public DescribePrinterEventsRequest setPrinterName(String printerName) {
        this.printerName = printerName;
        return this;
    }
    public String getPrinterName() {
        return this.printerName;
    }

    public DescribePrinterEventsRequest setPrinterRedirType(Integer printerRedirType) {
        this.printerRedirType = printerRedirType;
        return this;
    }
    public Integer getPrinterRedirType() {
        return this.printerRedirType;
    }

    public DescribePrinterEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePrinterEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
