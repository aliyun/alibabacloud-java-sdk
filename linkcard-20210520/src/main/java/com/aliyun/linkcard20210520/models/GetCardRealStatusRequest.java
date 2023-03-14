// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardRealStatusRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("Msisdn")
    public String msisdn;

    @NameInMap("SerialNo")
    public java.util.List<String> serialNo;

    public static GetCardRealStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardRealStatusRequest self = new GetCardRealStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetCardRealStatusRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public GetCardRealStatusRequest setMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }
    public String getMsisdn() {
        return this.msisdn;
    }

    public GetCardRealStatusRequest setSerialNo(java.util.List<String> serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public java.util.List<String> getSerialNo() {
        return this.serialNo;
    }

}
