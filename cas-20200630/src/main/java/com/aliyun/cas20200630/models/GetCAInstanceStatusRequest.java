// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCAInstanceStatusRequest extends TeaModel {
    /**
     * <p>The unique identifier of the client certificate or server-side certificate to query.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> to query the unique identifiers of all client certificates and server-side certificates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the private CA instance to query.</p>
     * <blockquote>
     * <p>After you purchase a private CA instance in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>, you can go to the <strong>Private Certificates</strong> page and view the <strong>details</strong> of the instance to obtain its ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cas-member-0hmi****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCAInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCAInstanceStatusRequest self = new GetCAInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetCAInstanceStatusRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public GetCAInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
