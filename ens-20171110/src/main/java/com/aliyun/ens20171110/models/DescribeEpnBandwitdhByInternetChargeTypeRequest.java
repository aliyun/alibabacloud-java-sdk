// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandwitdhByInternetChargeTypeRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</li>
     * <li>If the value of the seconds place is not 00, the start time is automatically set to the next minute.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-06T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-changsha-unicom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

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
     * <p>telecom</p>
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
     * <p>Connection</p>
     */
    @NameInMap("NetworkingModel")
    public String networkingModel;

    /**
     * <p>The beginning of the time range to query.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</li>
     * <li>If the value of the seconds place is not 00, the start time is automatically set to the next minute.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-02T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeEpnBandwitdhByInternetChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandwitdhByInternetChargeTypeRequest self = new DescribeEpnBandwitdhByInternetChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
