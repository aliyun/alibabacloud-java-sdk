// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreateNamespaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>用于管理客服场景的Prompt</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>我的Prompt空间</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>{&quot;minBlockRiskLevel&quot;:&quot;medium&quot;,&quot;maxSkipRatio&quot;:0.2}</p>
     */
    @NameInMap("ScanPolicy")
    public String scanPolicy;

    /**
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
