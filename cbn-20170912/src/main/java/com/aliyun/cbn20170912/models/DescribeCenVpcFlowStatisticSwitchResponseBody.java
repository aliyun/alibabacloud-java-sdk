// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenVpcFlowStatisticSwitchResponseBody extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("InvalidDate")
    public String invalidDate;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    public static DescribeCenVpcFlowStatisticSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenVpcFlowStatisticSwitchResponseBody self = new DescribeCenVpcFlowStatisticSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenVpcFlowStatisticSwitchResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenVpcFlowStatisticSwitchResponseBody setInvalidDate(String invalidDate) {
        this.invalidDate = invalidDate;
        return this;
    }
    public String getInvalidDate() {
        return this.invalidDate;
    }

    public DescribeCenVpcFlowStatisticSwitchResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCenVpcFlowStatisticSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenVpcFlowStatisticSwitchResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
