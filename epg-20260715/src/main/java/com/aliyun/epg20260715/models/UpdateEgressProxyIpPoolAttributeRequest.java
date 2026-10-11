// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyIpPoolAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eppool-gw80606a59ecc101****</p>
     */
    @NameInMap("EgressProxyIpPoolId")
    public String egressProxyIpPoolId;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyIpPoolName")
    public String egressProxyIpPoolName;

    /**
     * <strong>example:</strong>
     * <p>SourceIP</p>
     */
    @NameInMap("HashFactor")
    public String hashFactor;

    /**
     * <strong>example:</strong>
     * <p>X-Forwarded-For</p>
     */
    @NameInMap("HashHeaderName")
    public String hashHeaderName;

    /**
     * <strong>example:</strong>
     * <p>Random</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    public static UpdateEgressProxyIpPoolAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyIpPoolAttributeRequest self = new UpdateEgressProxyIpPoolAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyIpPoolAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEgressProxyIpPoolAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEgressProxyIpPoolAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateEgressProxyIpPoolAttributeRequest setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public UpdateEgressProxyIpPoolAttributeRequest setEgressProxyIpPoolName(String egressProxyIpPoolName) {
        this.egressProxyIpPoolName = egressProxyIpPoolName;
        return this;
    }
    public String getEgressProxyIpPoolName() {
        return this.egressProxyIpPoolName;
    }

    public UpdateEgressProxyIpPoolAttributeRequest setHashFactor(String hashFactor) {
        this.hashFactor = hashFactor;
        return this;
    }
    public String getHashFactor() {
        return this.hashFactor;
    }

    public UpdateEgressProxyIpPoolAttributeRequest setHashHeaderName(String hashHeaderName) {
        this.hashHeaderName = hashHeaderName;
        return this;
    }
    public String getHashHeaderName() {
        return this.hashHeaderName;
    }

    public UpdateEgressProxyIpPoolAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

}
