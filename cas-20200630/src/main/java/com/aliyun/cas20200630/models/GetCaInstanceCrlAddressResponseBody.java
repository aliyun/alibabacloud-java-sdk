// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCaInstanceCrlAddressResponseBody extends TeaModel {
    /**
     * <p>The status of the CA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("CaInstanceStatus")
    public String caInstanceStatus;

    /**
     * <p>The cron expression.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://crl-cn-publish.oss-cn-hangzhou.aliyuncs.com/pca/crl/35118048/1f0be094-14bd-6caa-bd7f-db45730d510a.crl">https://crl-cn-publish.oss-cn-hangzhou.aliyuncs.com/pca/crl/35118048/1f0be094-14bd-6caa-bd7f-db45730d510a.crl</a></p>
     */
    @NameInMap("CrlUrl")
    public String crlUrl;

    /**
     * <p>Used to identify whether there are new revoked certificates in the revocation list.</p>
     * 
     * <strong>example:</strong>
     * <p>5481d1b1228fXXX40ee70dc8cd</p>
     */
    @NameInMap("HashCode")
    public String hashCode;

    /**
     * <p>The next update time of the revocation list.</p>
     * 
     * <strong>example:</strong>
     * <p>1778688000000</p>
     */
    @NameInMap("NextUpdateTime")
    public String nextUpdateTime;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C53C2341-F321-55A5-895C-D0746E6DA58E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCaInstanceCrlAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCaInstanceCrlAddressResponseBody self = new GetCaInstanceCrlAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCaInstanceCrlAddressResponseBody setCaInstanceStatus(String caInstanceStatus) {
        this.caInstanceStatus = caInstanceStatus;
        return this;
    }
    public String getCaInstanceStatus() {
        return this.caInstanceStatus;
    }

    public GetCaInstanceCrlAddressResponseBody setCrlUrl(String crlUrl) {
        this.crlUrl = crlUrl;
        return this;
    }
    public String getCrlUrl() {
        return this.crlUrl;
    }

    public GetCaInstanceCrlAddressResponseBody setHashCode(String hashCode) {
        this.hashCode = hashCode;
        return this;
    }
    public String getHashCode() {
        return this.hashCode;
    }

    public GetCaInstanceCrlAddressResponseBody setNextUpdateTime(String nextUpdateTime) {
        this.nextUpdateTime = nextUpdateTime;
        return this;
    }
    public String getNextUpdateTime() {
        return this.nextUpdateTime;
    }

    public GetCaInstanceCrlAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
