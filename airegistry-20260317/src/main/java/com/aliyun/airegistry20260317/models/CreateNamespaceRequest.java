// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreateNamespaceRequest extends TeaModel {
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
     * <p>The scan policy.</p>
     * <p>This parameter contains two configuration items:</p>
     * <ul>
     * <li>minBlockRiskLevel: the risk level for blocking.<ul>
     * <li>high: blocks high-risk items.</li>
     * <li>medium: blocks medium-risk and high-risk items.</li>
     * <li>low: blocks all risk levels including high, medium, and low.</li>
     * </ul>
     * </li>
     * <li>maxSkipRatio: the max false positive rate. If the scan skip ratio exceeds this value, the scan is considered as failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;minBlockRiskLevel&quot;:&quot;medium&quot;,&quot;maxSkipRatio&quot;:0.2}</p>
     */
    @NameInMap("ScanPolicy")
    public String scanPolicy;

    /**
     * <p>The tags. Separate multiple tags with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service,production</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static CreateNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceRequest self = new CreateNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNamespaceRequest setScanPolicy(String scanPolicy) {
        this.scanPolicy = scanPolicy;
        return this;
    }
    public String getScanPolicy() {
        return this.scanPolicy;
    }

    public CreateNamespaceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
