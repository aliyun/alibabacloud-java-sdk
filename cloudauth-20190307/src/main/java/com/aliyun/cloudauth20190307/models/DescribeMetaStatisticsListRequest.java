// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsListRequest extends TeaModel {
    /**
     * <p>The commodity code. Valid values:</p>
     * <ul>
     * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification</li>
     * <li><strong>ID_PERIOD</strong>: ID card validity period verification</li>
     * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration</li>
     * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status</li>
     * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition)</li>
     * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition)</li>
     * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification</li>
     * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition)</li>
     * <li><strong>MOBILE_DETECT</strong>: phone number detection</li>
     * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition)</li>
     * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition</li>
     * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition</li>
     * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query</li>
     * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MOBILE_ONLINE_LENGTH</p>
     */
    @NameInMap("Api")
    public String api;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1750694399999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1760112000000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeMetaStatisticsListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaStatisticsListRequest self = new DescribeMetaStatisticsListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetaStatisticsListRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public DescribeMetaStatisticsListRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeMetaStatisticsListRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
