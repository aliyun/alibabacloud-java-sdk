// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenerCertificatesRequest extends TeaModel {
    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The type of the certificate. Valid values: **Ca** and **Server**.</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <p>The listener ID. You must specify the ID of an HTTPS listener or a QUIC listener.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The maximum number of entries to return. Valid values: **1 to 100**. If you do not specify this parameter, the default value **20** is used.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of **NextToken**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListListenerCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListenerCertificatesRequest self = new ListListenerCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public ListListenerCertificatesRequest setCertificateIds(java.util.List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }
    public java.util.List<String> getCertificateIds() {
        return this.certificateIds;
    }

    public ListListenerCertificatesRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public ListListenerCertificatesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public ListListenerCertificatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenerCertificatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
