// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeBandWithdChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The information about the metering method.</p>
     */
    @NameInMap("BandWithTypeInfo")
    public String bandWithTypeInfo;

    /**
     * <p>The metering type.</p>
     * <br>
     * <p>*   ChargeByUnified: unified metering.</p>
     * <p>*   ChargeByGrade: differential metering.</p>
     */
    @NameInMap("ChargeContractType")
    public String chargeContractType;

    /**
     * <p>The metering cycle. Currently, this parameter is empty in the response.</p>
     */
    @NameInMap("ChargeCycleInfo")
    public String chargeCycleInfo;

    /**
     * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBandWithdChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandWithdChargeTypeResponseBody self = new DescribeBandWithdChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandWithdChargeTypeResponseBody setBandWithTypeInfo(String bandWithTypeInfo) {
        this.bandWithTypeInfo = bandWithTypeInfo;
        return this;
    }
    public String getBandWithTypeInfo() {
        return this.bandWithTypeInfo;
    }

    public DescribeBandWithdChargeTypeResponseBody setChargeContractType(String chargeContractType) {
        this.chargeContractType = chargeContractType;
        return this;
    }
    public String getChargeContractType() {
        return this.chargeContractType;
    }

    public DescribeBandWithdChargeTypeResponseBody setChargeCycleInfo(String chargeCycleInfo) {
        this.chargeCycleInfo = chargeCycleInfo;
        return this;
    }
    public String getChargeCycleInfo() {
        return this.chargeCycleInfo;
    }

    public DescribeBandWithdChargeTypeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeBandWithdChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
