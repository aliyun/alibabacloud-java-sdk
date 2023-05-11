// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EscalationRule extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("Escalations")
    public java.util.List<EscalationRuleEscalations> escalations;

    @NameInMap("Name")
    public String name;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Uuid")
    public String uuid;

    public static EscalationRule build(java.util.Map<String, ?> map) throws Exception {
        EscalationRule self = new EscalationRule();
        return TeaModel.build(map, self);
    }

    public EscalationRule setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public EscalationRule setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EscalationRule setEscalations(java.util.List<EscalationRuleEscalations> escalations) {
        this.escalations = escalations;
        return this;
    }
    public java.util.List<EscalationRuleEscalations> getEscalations() {
        return this.escalations;
    }

    public EscalationRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EscalationRule setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public EscalationRule setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public EscalationRule setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class EscalationRuleEscalationsContactGroupsByLevel extends TeaModel {
        @NameInMap("Critical")
        public java.util.List<String> critical;

        @NameInMap("Error")
        public java.util.List<String> error;

        @NameInMap("Info")
        public java.util.List<String> info;

        @NameInMap("Resolve")
        public java.util.List<String> resolve;

        @NameInMap("Warning")
        public java.util.List<String> warning;

        public static EscalationRuleEscalationsContactGroupsByLevel build(java.util.Map<String, ?> map) throws Exception {
            EscalationRuleEscalationsContactGroupsByLevel self = new EscalationRuleEscalationsContactGroupsByLevel();
            return TeaModel.build(map, self);
        }

        public EscalationRuleEscalationsContactGroupsByLevel setCritical(java.util.List<String> critical) {
            this.critical = critical;
            return this;
        }
        public java.util.List<String> getCritical() {
            return this.critical;
        }

        public EscalationRuleEscalationsContactGroupsByLevel setError(java.util.List<String> error) {
            this.error = error;
            return this;
        }
        public java.util.List<String> getError() {
            return this.error;
        }

        public EscalationRuleEscalationsContactGroupsByLevel setInfo(java.util.List<String> info) {
            this.info = info;
            return this;
        }
        public java.util.List<String> getInfo() {
            return this.info;
        }

        public EscalationRuleEscalationsContactGroupsByLevel setResolve(java.util.List<String> resolve) {
            this.resolve = resolve;
            return this;
        }
        public java.util.List<String> getResolve() {
            return this.resolve;
        }

        public EscalationRuleEscalationsContactGroupsByLevel setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

    }

    public static class EscalationRuleEscalations extends TeaModel {
        @NameInMap("ContactGroups")
        public java.util.List<String> contactGroups;

        @NameInMap("ContactGroupsByLevel")
        public EscalationRuleEscalationsContactGroupsByLevel contactGroupsByLevel;

        @NameInMap("EscalateMin")
        public Long escalateMin;

        public static EscalationRuleEscalations build(java.util.Map<String, ?> map) throws Exception {
            EscalationRuleEscalations self = new EscalationRuleEscalations();
            return TeaModel.build(map, self);
        }

        public EscalationRuleEscalations setContactGroups(java.util.List<String> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public java.util.List<String> getContactGroups() {
            return this.contactGroups;
        }

        public EscalationRuleEscalations setContactGroupsByLevel(EscalationRuleEscalationsContactGroupsByLevel contactGroupsByLevel) {
            this.contactGroupsByLevel = contactGroupsByLevel;
            return this;
        }
        public EscalationRuleEscalationsContactGroupsByLevel getContactGroupsByLevel() {
            return this.contactGroupsByLevel;
        }

        public EscalationRuleEscalations setEscalateMin(Long escalateMin) {
            this.escalateMin = escalateMin;
            return this;
        }
        public Long getEscalateMin() {
            return this.escalateMin;
        }

    }

}
