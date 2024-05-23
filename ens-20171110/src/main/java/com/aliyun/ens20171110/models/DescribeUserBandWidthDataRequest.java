// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeUserBandWidthDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>*   Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>*   If the value of the seconds place is not 00, the start time is automatically set to the next minute.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the node. You can specify only one node ID. By default, all nodes are queried.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the instance for which you want to query the data. You can specify only one instance ID. By default, all instances are queried.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The Internet service provider (ISP). Valid values:</p>
     * <br>
     * <p>*   cmcc: China Mobile</p>
     * <p>*   telecom: China Telecom</p>
     * <p>*   unicom: China Unicom</p>
     * <p>*   multiCarrier: multi-line ISP</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The precision of the monitoring data that you want to obtain. Valid values: 300, 1200, 3600, and 14400. Default value: 300. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>*   Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>*   If the value of the seconds place is not 00, the start time is automatically set to the next minute.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeUserBandWidthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBandWidthDataRequest self = new DescribeUserBandWidthDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserBandWidthDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUserBandWidthDataRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeUserBandWidthDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserBandWidthDataRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeUserBandWidthDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeUserBandWidthDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
