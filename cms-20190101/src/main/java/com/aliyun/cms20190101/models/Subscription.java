// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class Subscription extends TeaModel {
    @NameInMap("Conditions")
    public java.util.List<SubscriptionConditions> conditions;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Name")
    public String name;

    @NameInMap("Product")
    public String product;

    @NameInMap("Relation")
    public String relation;

    @NameInMap("StrategyUuid")
    public String strategyUuid;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Uuid")
    public String uuid;

    public static Subscription build(java.util.Map<String, ?> map) throws Exception {
        Subscription self = new Subscription();
        return TeaModel.build(map, self);
    }

    public Subscription setConditions(java.util.List<SubscriptionConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<SubscriptionConditions> getConditions() {
        return this.conditions;
    }

    public Subscription setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Subscription setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Subscription setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public Subscription setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Subscription setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public Subscription setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public Subscription setStrategyUuid(String strategyUuid) {
        this.strategyUuid = strategyUuid;
        return this;
    }
    public String getStrategyUuid() {
        return this.strategyUuid;
    }

    public Subscription setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public Subscription setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class SubscriptionConditions extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static SubscriptionConditions build(java.util.Map<String, ?> map) throws Exception {
            SubscriptionConditions self = new SubscriptionConditions();
            return TeaModel.build(map, self);
        }

        public SubscriptionConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SubscriptionConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public SubscriptionConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
