// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, it is not returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The top-level domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>com</p>
     */
    @NameInMap("ParentDomainName")
    public String parentDomainName;

    /**
     * <p>The hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunRetrieval</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9CC0D642-49D4-48DE-A1A5-9F218652E4A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The record value.</p>
     * <blockquote>
     * <p> The validity period is three days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c99419e6997f41daaa3e*****</p>
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

    public GetTxtRecordForVerifyResponseBody setParentDomainName(String parentDomainName) {
        this.parentDomainName = parentDomainName;
        return this;
    }
    public String getParentDomainName() {
        return this.parentDomainName;
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
