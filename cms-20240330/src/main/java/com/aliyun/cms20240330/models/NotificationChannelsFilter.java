// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotificationChannelsFilter extends TeaModel {
    @NameInMap("containsContacts")
    public java.util.List<String> containsContacts;

    @NameInMap("containsCustomWebhooks")
    public java.util.List<String> containsCustomWebhooks;

    @NameInMap("containsDingWebhooks")
    public java.util.List<String> containsDingWebhooks;

    @NameInMap("containsFsWebhooks")
    public java.util.List<String> containsFsWebhooks;

    @NameInMap("containsGroups")
    public java.util.List<String> containsGroups;

    @NameInMap("containsSlackWebhooks")
    public java.util.List<String> containsSlackWebhooks;

    @NameInMap("containsWxWebhooks")
    public java.util.List<String> containsWxWebhooks;

    public static NotificationChannelsFilter build(java.util.Map<String, ?> map) throws Exception {
        NotificationChannelsFilter self = new NotificationChannelsFilter();
        return TeaModel.build(map, self);
    }

    public NotificationChannelsFilter setContainsContacts(java.util.List<String> containsContacts) {
        this.containsContacts = containsContacts;
        return this;
    }
    public java.util.List<String> getContainsContacts() {
        return this.containsContacts;
    }

    public NotificationChannelsFilter setContainsCustomWebhooks(java.util.List<String> containsCustomWebhooks) {
        this.containsCustomWebhooks = containsCustomWebhooks;
        return this;
    }
    public java.util.List<String> getContainsCustomWebhooks() {
        return this.containsCustomWebhooks;
    }

    public NotificationChannelsFilter setContainsDingWebhooks(java.util.List<String> containsDingWebhooks) {
        this.containsDingWebhooks = containsDingWebhooks;
        return this;
    }
    public java.util.List<String> getContainsDingWebhooks() {
        return this.containsDingWebhooks;
    }

    public NotificationChannelsFilter setContainsFsWebhooks(java.util.List<String> containsFsWebhooks) {
        this.containsFsWebhooks = containsFsWebhooks;
        return this;
    }
    public java.util.List<String> getContainsFsWebhooks() {
        return this.containsFsWebhooks;
    }

    public NotificationChannelsFilter setContainsGroups(java.util.List<String> containsGroups) {
        this.containsGroups = containsGroups;
        return this;
    }
    public java.util.List<String> getContainsGroups() {
        return this.containsGroups;
    }

    public NotificationChannelsFilter setContainsSlackWebhooks(java.util.List<String> containsSlackWebhooks) {
        this.containsSlackWebhooks = containsSlackWebhooks;
        return this;
    }
    public java.util.List<String> getContainsSlackWebhooks() {
        return this.containsSlackWebhooks;
    }

    public NotificationChannelsFilter setContainsWxWebhooks(java.util.List<String> containsWxWebhooks) {
        this.containsWxWebhooks = containsWxWebhooks;
        return this;
    }
    public java.util.List<String> getContainsWxWebhooks() {
        return this.containsWxWebhooks;
    }

}
