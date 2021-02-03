// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("RR")
    @Validation(required = true)
    public String RR;

    @NameInMap("Value")
    @Validation(required = true)
    public String value;

    public static GetTxtRecordForVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTxtRecordForVerifyResponse self = new GetTxtRecordForVerifyResponse();
        return TeaModel.build(map, self);
    }

    public GetTxtRecordForVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTxtRecordForVerifyResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetTxtRecordForVerifyResponse setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public GetTxtRecordForVerifyResponse setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
