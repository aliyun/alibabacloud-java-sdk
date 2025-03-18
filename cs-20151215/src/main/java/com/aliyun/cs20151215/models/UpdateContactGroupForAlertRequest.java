// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateContactGroupForAlertRequest extends TeaModel {
    /**
     * <p>The name of the alert contact group.</p>
     * 
     * <strong>example:</strong>
     * <p>sample</p>
     */
    @NameInMap("alert_rule_group_name")
    public String alertRuleGroupName;

    /**
     * <p>The list of contact group IDs.</p>
     */
    @NameInMap("contact_group_ids")
    public java.util.List<Long> contactGroupIds;

    /**
     * <p>The name of the container registry instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sample</p>
     */
    @NameInMap("cr_name")
    public String crName;

    /**
     * <p>The namespace in which the resource resides.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
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
