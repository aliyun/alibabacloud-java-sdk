// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosOriginInstanceBillRequest extends TeaModel {
    /**
     * <p>The end timestamp of the query. Unit: milliseconds. The time span cannot exceed 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1711382399410</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Specifies whether to display billing details. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Displays billing information.</li>
     * <li><strong>false</strong>: Displays only global instance information without billing details.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsShowList")
    public Boolean isShowList;

    /**
     * <p>The start timestamp of the query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1711209600410</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The bill type. Valid values:</p>
     * <ul>
     * <li><strong>flow_cn</strong>: clean traffic bill for EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland.</li>
     * <li><strong>flow_ov</strong>: clean traffic bill for EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland.</li>
     * <li><strong>standard_assets_flow_cn</strong>: clean traffic bill for Regular Alibaba Cloud services in the Chinese mainland.</li>
     * <li><strong>standard_assets_flow_ov</strong>: clean traffic bill for Regular Alibaba Cloud services outside the Chinese mainland.</li>
     * <li><strong>function</strong>: feature activation bill.</li>
     * <li><strong>ip_count</strong>: protected IP address count bill.</li>
     * <li><strong>monthly_summary</strong>: monthly summary bill.</li>
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
