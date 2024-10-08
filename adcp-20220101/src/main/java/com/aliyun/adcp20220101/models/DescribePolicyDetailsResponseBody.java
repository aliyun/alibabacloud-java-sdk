// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyDetailsResponseBody extends TeaModel {
    /**
     * <p>The policies.</p>
     */
    @NameInMap("Policy")
    public DescribePolicyDetailsResponseBodyPolicy policy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D676EFC-8C04-5CCE-A08E-BB97D24B47E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolicyDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyDetailsResponseBody self = new DescribePolicyDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyDetailsResponseBody setPolicy(DescribePolicyDetailsResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public DescribePolicyDetailsResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public DescribePolicyDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolicyDetailsResponseBodyPolicy extends TeaModel {
        /**
         * <p>The action of the policy. Valid values:</p>
         * <ul>
         * <li>enforce: blocks deployments that match the policy.</li>
         * <li>inform: generates alerts for deployments that match the policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enforce</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-general</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-18T10:52:17+08:00</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Requires container images to begin with a repo string from a specified list</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ACKAllowedRepos</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether parameters are required. Valid values:</p>
         * <ul>
         * <li>0: Parameters are required.</li>
         * <li>1: Parameters are not required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NoConfig")
        public Integer noConfig;

        /**
         * <p>The severity level of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The content of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>The content of the policy.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The time when the policy was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-18T10:52:17+08:00</p>
         */
        @NameInMap("Updated")
        public String updated;

        public static DescribePolicyDetailsResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyDetailsResponseBodyPolicy self = new DescribePolicyDetailsResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public DescribePolicyDetailsResponseBodyPolicy setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribePolicyDetailsResponseBodyPolicy setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePolicyDetailsResponseBodyPolicy setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribePolicyDetailsResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolicyDetailsResponseBodyPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolicyDetailsResponseBodyPolicy setNoConfig(Integer noConfig) {
            this.noConfig = noConfig;
            return this;
        }
        public Integer getNoConfig() {
            return this.noConfig;
        }

        public DescribePolicyDetailsResponseBodyPolicy setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyDetailsResponseBodyPolicy setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public DescribePolicyDetailsResponseBodyPolicy setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

}
