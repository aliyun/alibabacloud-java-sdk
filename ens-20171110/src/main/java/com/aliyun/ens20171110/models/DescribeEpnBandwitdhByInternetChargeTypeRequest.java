// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandwitdhByInternetChargeTypeRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>*   Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>*   If the value of the seconds place is not 00, the start time is automatically set to the next minute.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

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
     * <p>The networking mode. Valid values:</p>
     * <br>
     * <p>*   **SpeedUp**: intelligent acceleration network (Internet)</p>
     * <p>*   **Connection**: internal network</p>
     * <p>*   **SpeedUpAndConnection**: intelligent acceleration network and internal network</p>
     */
    @NameInMap("NetworkingModel")
    public String networkingModel;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>*   Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>*   If the value of the seconds place is not 00, the start time is automatically set to the next minute.</p>
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
