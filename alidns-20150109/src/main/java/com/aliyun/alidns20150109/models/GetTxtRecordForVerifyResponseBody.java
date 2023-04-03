// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <br>
     * <p>>  If you do not specify this parameter, it is not returned.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The host record.</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The value of the DNS record.</p>
     * <br>
     * <p>>  The validity period is three days.</p>
     */
    @NameInMap("Value")
    public String value;

    public static GetTxtRecordForVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTxtRecordForVerifyResponseBody self = new GetTxtRecordForVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTxtRecordForVerifyResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
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

    public GetTxtRecordForVerifyResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
