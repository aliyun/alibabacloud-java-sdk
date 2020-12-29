// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyResponseBody extends TeaModel {
    @NameInMap("RR")
    public String RR;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Value")
    public String value;

    public static GetTxtRecordForVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTxtRecordForVerifyResponseBody self = new GetTxtRecordForVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTxtRecordForVerifyResponseBody setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public GetTxtRecordForVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTxtRecordForVerifyResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetTxtRecordForVerifyResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
