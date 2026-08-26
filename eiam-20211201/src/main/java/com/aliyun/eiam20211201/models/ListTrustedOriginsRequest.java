// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListTrustedOriginsRequest extends TeaModel {
    /**
     * <p>The ID of the IDaaS EIAM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_example</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100. If you set this parameter to 0, the default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The NextToken returned by the previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>NT_example</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Filters by the exact normalized origin.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://console.qoder.com">https://console.qoder.com</a></p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>Filters by exact status. Valid values: Enabled or Disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Filters by exact name.</p>
     * 
     * <strong>example:</strong>
     * <p>Qoder Production Console</p>
     */
    @NameInMap("TrustOriginName")
    public String trustOriginName;

    /**
     * <p>Filters by exact trusted origin scene. You can specify at most one value.</p>
     * 
     * <strong>example:</strong>
     * <p>iframe_embed</p>
     */
    @NameInMap("TrustedOriginScene")
    public java.util.List<String> trustedOriginScene;

    public static ListTrustedOriginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrustedOriginsRequest self = new ListTrustedOriginsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrustedOriginsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTrustedOriginsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTrustedOriginsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrustedOriginsRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ListTrustedOriginsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTrustedOriginsRequest setTrustOriginName(String trustOriginName) {
        this.trustOriginName = trustOriginName;
        return this;
    }
    public String getTrustOriginName() {
        return this.trustOriginName;
    }

    public ListTrustedOriginsRequest setTrustedOriginScene(java.util.List<String> trustedOriginScene) {
        this.trustedOriginScene = trustedOriginScene;
        return this;
    }
    public java.util.List<String> getTrustedOriginScene() {
        return this.trustedOriginScene;
    }

}
