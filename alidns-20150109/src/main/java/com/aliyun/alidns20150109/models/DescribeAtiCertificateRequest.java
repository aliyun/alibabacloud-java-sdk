// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate to query. Call the ListAtiCertificates operation to query the target certificate information and obtain the ID from the response.</p>
     * 
     * <strong>example:</strong>
     * <p>2074041094504542210</p>
     */
    @NameInMap("AgentCertificateId")
    public String agentCertificateId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to ensure that the value is unique among different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeAtiCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiCertificateRequest self = new DescribeAtiCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAtiCertificateRequest setAgentCertificateId(String agentCertificateId) {
        this.agentCertificateId = agentCertificateId;
        return this;
    }
    public String getAgentCertificateId() {
        return this.agentCertificateId;
    }

    public DescribeAtiCertificateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
