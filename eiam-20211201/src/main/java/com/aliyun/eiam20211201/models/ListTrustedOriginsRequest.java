// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListTrustedOriginsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_example</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of results per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>NT_example</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The origin filter.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://console.qoder.com">https://console.qoder.com</a></p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The status filter. Valid values:</p>
     * <ul>
     * <li>Enabled: Enabled.</li>
     * <li>Disabled: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>Qoder Production Console</p>
     */
    @NameInMap("TrustOriginName")
    public String trustOriginName;

    /**
     * <p>The trusted origin scene filter.</p>
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
