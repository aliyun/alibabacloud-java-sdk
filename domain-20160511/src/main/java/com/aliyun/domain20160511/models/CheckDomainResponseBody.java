// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class CheckDomainResponseBody extends TeaModel {
    @NameInMap("Avail")
    public Integer avail;

    @NameInMap("FeeCommand")
    public String feeCommand;

    @NameInMap("FeeCurrency")
    public String feeCurrency;

    @NameInMap("FeeFee")
    public String feeFee;

    @NameInMap("FeePeriod")
    public Integer feePeriod;

    @NameInMap("Name")
    public String name;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RmbFee")
    public String rmbFee;

    public static CheckDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainResponseBody self = new CheckDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDomainResponseBody setAvail(Integer avail) {
        this.avail = avail;
        return this;
    }
    public Integer getAvail() {
        return this.avail;
    }

    public CheckDomainResponseBody setFeeCommand(String feeCommand) {
        this.feeCommand = feeCommand;
        return this;
    }
    public String getFeeCommand() {
        return this.feeCommand;
    }

    public CheckDomainResponseBody setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
        return this;
    }
    public String getFeeCurrency() {
        return this.feeCurrency;
    }

    public CheckDomainResponseBody setFeeFee(String feeFee) {
        this.feeFee = feeFee;
        return this;
    }
    public String getFeeFee() {
        return this.feeFee;
    }

    public CheckDomainResponseBody setFeePeriod(Integer feePeriod) {
        this.feePeriod = feePeriod;
        return this;
    }
    public Integer getFeePeriod() {
        return this.feePeriod;
    }

    public CheckDomainResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CheckDomainResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CheckDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDomainResponseBody setRmbFee(String rmbFee) {
        this.rmbFee = rmbFee;
        return this;
    }
    public String getRmbFee() {
        return this.rmbFee;
    }

}
