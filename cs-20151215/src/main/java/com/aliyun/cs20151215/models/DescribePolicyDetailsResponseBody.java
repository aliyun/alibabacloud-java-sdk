// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyDetailsResponseBody extends TeaModel {
    /**
     * <p>The action of the policy. Valid values:</p>
     * <ul>
     * <li><code>enforce</code>: blocks deployments that match the policy.</li>
     * <li><code>inform</code>: generates alerts for deployments that match the policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enforce</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The type of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-general</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The description of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Requires container images to begin with a repo string from a specified list</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the policy is deleted. Valid values:</p>
     * <ul>
     * <li>0: The policy is not deleted.</li>
     * <li>1: The policy is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("is_deleted")
    public Integer isDeleted;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>ACKAllowedRepos</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Indicates whether parameters are required. Valid values:</p>
     * <ul>
     * <li>0: Parameters are required.</li>
     * <li>1: Parameters are optional.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("no_config")
    public Integer noConfig;

    /**
     * <p>The severity level of the policy. Valid values:</p>
     * <ul>
     * <li><code>high</code></li>
     * <li><code>medium</code></li>
     * <li><code>low</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The content of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>For more information, see sample requests.</p>
     */
    @NameInMap("template")
    public String template;

    public static DescribePolicyDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyDetailsResponseBody self = new DescribePolicyDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyDetailsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DescribePolicyDetailsResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribePolicyDetailsResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePolicyDetailsResponseBody setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    public DescribePolicyDetailsResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePolicyDetailsResponseBody setNoConfig(Integer noConfig) {
        this.noConfig = noConfig;
        return this;
    }
    public Integer getNoConfig() {
        return this.noConfig;
    }

    public DescribePolicyDetailsResponseBody setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public DescribePolicyDetailsResponseBody setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
