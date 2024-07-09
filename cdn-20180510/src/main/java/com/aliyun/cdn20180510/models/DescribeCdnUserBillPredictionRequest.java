// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionRequest extends TeaModel {
    /**
     * <p>The billable region. Valid values:</p>
     * <ul>
     * <li><strong>CN</strong>: the Chinese mainland</li>
     * <li><strong>OverSeas</strong>: outside the Chinese mainland</li>
     * <li><strong>AP1</strong>: Asia Pacific 1</li>
     * <li><strong>AP2</strong>: Asia Pacific 2</li>
     * <li><strong>AP3</strong>: Asia Pacific 3</li>
     * <li><strong>NA</strong>: North America</li>
     * <li><strong>SA</strong>: South America</li>
     * <li><strong>EU</strong>: Europe</li>
     * <li><strong>MEAA</strong>: Middle East and Africa</li>
     * </ul>
     * <p>By default, the value of this parameter is determined by the metering method that is currently used. Regions inside and outside the Chinese mainland are classified into the <strong>CN</strong> and <strong>OverSeas</strong> billable regions. Billable regions inside the Chinese mainland include <strong>CN</strong>. Billable regions outside the Chinese mainland include <strong>AP1</strong>, <strong>AP2</strong>, <strong>AP3</strong>, <strong>NA</strong>, <strong>SA</strong>, <strong>EU</strong>, and <strong>MEAA</strong>.</p>
     * <blockquote>
     * <p>For more information about billable regions, see <a href="https://help.aliyun.com/document_detail/142221.html">Billable regions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CN,OverSeas</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The billable item. A value of flow specifies bandwidth.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The end time of the estimation. The default value is the current time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-10-25T10:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start time of the estimation. The default value is 00:00 on the first day of the current month. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-09-30T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCdnUserBillPredictionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillPredictionRequest self = new DescribeCdnUserBillPredictionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillPredictionRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeCdnUserBillPredictionRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeCdnUserBillPredictionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCdnUserBillPredictionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
