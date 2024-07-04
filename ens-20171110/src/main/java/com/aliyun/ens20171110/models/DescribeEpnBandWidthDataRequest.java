// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandWidthDataRequest extends TeaModel {
    /**
     * <p>The ID of the EPN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-20200825134537VyK81T</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    /**
     * <p>The end of the time range to query.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</li>
     * <li>If the value of the seconds place is not 00, the start time is automatically set to the next minute.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-16T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-cmcc</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5sg1owx0g4ojy66ab2tez77r2</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The Internet service provider (ISP). Valid values:</p>
     * <ul>
     * <li>cmcc: China Mobile</li>
     * <li>telecom: China Telecom</li>
     * <li>unicom: China Unicom</li>
     * <li>multiCarrier: multi-line ISP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cmcc</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The networking mode. Valid values:</p>
     * <ul>
     * <li><strong>SpeedUp</strong>: intelligent acceleration network (Internet)</li>
     * <li><strong>Connection</strong>: internal network</li>
     * <li><strong>SpeedUpAndConnection</strong>: intelligent acceleration network and internal network</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SpeedUp</p>
     */
    @NameInMap("NetworkingModel")
    public String networkingModel;

    /**
     * <p>The precision of the monitoring data that you want to obtain. Valid values: 300, 1200, 3600, and 14400. Default value: 300. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The beginning of the time range to query.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</li>
     * <li>If the value of the seconds place is not 00, the start time is automatically set to the next minute.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeEpnBandWidthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandWidthDataRequest self = new DescribeEpnBandWidthDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandWidthDataRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public DescribeEpnBandWidthDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEpnBandWidthDataRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeEpnBandWidthDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeEpnBandWidthDataRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeEpnBandWidthDataRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    public DescribeEpnBandWidthDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeEpnBandWidthDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
