// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyDetailsResponseBody extends TeaModel {
    // 规则治理动作 ● enforce: 拦截违规部署 ● inform：告警
    @NameInMap("action")
    public String action;

    // 规则模板类型
    @NameInMap("category")
    public String category;

    // 规则模板描述
    @NameInMap("description")
    public String description;

    // 软删除标志：0表示未删除 1表示删除
    @NameInMap("is_deleted")
    public Integer isDeleted;

    // 策略治理规则名称
    @NameInMap("name")
    public String name;

    // 是否需要配置策略： 0表示需要参数配置 1表示无需参数配置
    @NameInMap("no_config")
    public Integer noConfig;

    // 规则治理等级
    @NameInMap("severity")
    public String severity;

    // 规则模板详情
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
