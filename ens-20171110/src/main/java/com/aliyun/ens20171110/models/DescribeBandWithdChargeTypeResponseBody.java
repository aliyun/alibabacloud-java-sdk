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
     * <ul>
     * <li>ChargeByUnified: unified metering.</li>
     * <li>ChargeByGrade: differential metering.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ChargeByGrade</p>
     */
    @NameInMap("ChargeContractType")
    public String chargeContractType;

    /**
     * <p>The metering cycle. Currently, this parameter is empty in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{null}</p>
     */
    @NameInMap("ChargeCycleInfo")
    public String chargeCycleInfo;

    /**
     * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>791049FD-49CE-4667-BD6C-F23094DEDA7A</p>
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
