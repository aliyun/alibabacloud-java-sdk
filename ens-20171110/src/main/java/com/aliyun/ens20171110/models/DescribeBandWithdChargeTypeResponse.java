// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeBandWithdChargeTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("BandWithTypeInfo")
    @Validation(required = true)
    public String bandWithTypeInfo;

    @NameInMap("ChargeCycleInfo")
    @Validation(required = true)
    public String chargeCycleInfo;

    @NameInMap("ChargeContractType")
    @Validation(required = true)
    public String chargeContractType;

    public static DescribeBandWithdChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandWithdChargeTypeResponse self = new DescribeBandWithdChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandWithdChargeTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBandWithdChargeTypeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeBandWithdChargeTypeResponse setBandWithTypeInfo(String bandWithTypeInfo) {
        this.bandWithTypeInfo = bandWithTypeInfo;
        return this;
    }
    public String getBandWithTypeInfo() {
        return this.bandWithTypeInfo;
    }

    public DescribeBandWithdChargeTypeResponse setChargeCycleInfo(String chargeCycleInfo) {
        this.chargeCycleInfo = chargeCycleInfo;
        return this;
    }
    public String getChargeCycleInfo() {
        return this.chargeCycleInfo;
    }

    public DescribeBandWithdChargeTypeResponse setChargeContractType(String chargeContractType) {
        this.chargeContractType = chargeContractType;
        return this;
    }
    public String getChargeContractType() {
        return this.chargeContractType;
    }

}
