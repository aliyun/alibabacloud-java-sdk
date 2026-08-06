// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateNamespaceRequest extends TeaModel {
    /**
     * <p>The workspace description.</p>
     * 
     * <strong>example:</strong>
     * <p>用于管理客服场景的Prompt</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>我的Prompt空间</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The scan policy.</p>
     * <p>The policy contains two configuration items:</p>
     * <ul>
     * <li>minBlockRiskLevel: the risk level for blocking.<ul>
     * <li>high: blocks high-risk items.</li>
     * <li>medium: blocks medium-risk and high-risk items.</li>
     * <li>low: blocks all risk levels including high, medium, and low.</li>
     * </ul>
     * </li>
     * <li>maxSkipRatio: the max false positive rate. If the scan skip ratio exceeds this value, the scan is considered failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;minBlockRiskLevel&quot;:&quot;medium&quot;,&quot;maxSkipRatio&quot;:0.2}</p>
     */
    @NameInMap("ScanPolicy")
    public String scanPolicy;

    /**
     * <p>The tags, separated by commas. Pass an empty string to clear all tags.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service,production</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static UpdateNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceRequest self = new UpdateNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateNamespaceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNamespaceRequest setScanPolicy(String scanPolicy) {
        this.scanPolicy = scanPolicy;
        return this;
    }
    public String getScanPolicy() {
        return this.scanPolicy;
    }

    public UpdateNamespaceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
