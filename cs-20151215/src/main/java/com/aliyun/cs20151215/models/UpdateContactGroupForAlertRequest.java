// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateContactGroupForAlertRequest extends TeaModel {
    @NameInMap("alert_rule_group_name")
    public String alertRuleGroupName;

    @NameInMap("contact_group_ids")
    public java.util.List<Long> contactGroupIds;

    @NameInMap("cr_name")
    public String crName;

    @NameInMap("namespace")
    public String namespace;

    public static UpdateContactGroupForAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactGroupForAlertRequest self = new UpdateContactGroupForAlertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContactGroupForAlertRequest setAlertRuleGroupName(String alertRuleGroupName) {
        this.alertRuleGroupName = alertRuleGroupName;
        return this;
    }
    public String getAlertRuleGroupName() {
        return this.alertRuleGroupName;
    }

    public UpdateContactGroupForAlertRequest setContactGroupIds(java.util.List<Long> contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public java.util.List<Long> getContactGroupIds() {
        return this.contactGroupIds;
    }

    public UpdateContactGroupForAlertRequest setCrName(String crName) {
        this.crName = crName;
        return this;
    }
    public String getCrName() {
        return this.crName;
    }

    public UpdateContactGroupForAlertRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
