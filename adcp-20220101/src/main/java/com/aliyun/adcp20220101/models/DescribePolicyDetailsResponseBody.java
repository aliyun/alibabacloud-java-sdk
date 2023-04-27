// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyDetailsResponseBody extends TeaModel {
    @NameInMap("Policy")
    public DescribePolicyDetailsResponseBodyPolicy policy;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("Category")
        public String category;

        @NameInMap("Created")
        public String created;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("NoConfig")
        public Integer noConfig;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Template")
        public String template;

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
