// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCAInstanceStatusRequest extends TeaModel {
    /**
     * <p>The unique identifier of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the private CA instance.</p>
     * <blockquote>
     * <p> After you purchase a private CA instance by using the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">SSL Certificates Service console</a>, you can click <strong>Details</strong> for the private CA instance on the <strong>Private Certificates</strong> page to query the ID of the private CA instance.</p>
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
