// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosOriginInstanceBillRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a timestamp. Unit: milliseconds. The time span between StartTime and EndTime cannot exceed 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1711382399410</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Specifies whether to display the bill details. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsShowList")
    public Boolean isShowList;

    /**
     * <p>The beginning of the time range to query. The value is a timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1711209600410</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The bill type. Valid values:</p>
     * <ul>
     * <li><strong>flow_cn</strong>: the bill for the clean bandwidth of elastic IP addresses (EIPs) with Anti-DDoS (Enhanced) enabled in the Chinese mainland.</li>
     * <li><strong>flow_ov</strong>: the bill for the clean bandwidth of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland.</li>
     * <li><strong>standard_assets_flow_cn</strong>: the bill for the clean bandwidth of regular Alibaba Cloud services in the Chinese mainland.</li>
     * <li><strong>standard_assets_flow_ov</strong>: the bill for the clean bandwidth of regular Alibaba Cloud services outside the Chinese mainland.</li>
     * <li><strong>function</strong>: the bill for the basic fee.</li>
     * <li><strong>ip_count</strong>: the bill for protected IP addresses.</li>
     * <li><strong>monthly_summary</strong>: the monthly summary bill.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>function</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDdosOriginInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosOriginInstanceBillRequest self = new DescribeDdosOriginInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosOriginInstanceBillRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDdosOriginInstanceBillRequest setIsShowList(Boolean isShowList) {
        this.isShowList = isShowList;
        return this;
    }
    public Boolean getIsShowList() {
        return this.isShowList;
    }

    public DescribeDdosOriginInstanceBillRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDdosOriginInstanceBillRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
