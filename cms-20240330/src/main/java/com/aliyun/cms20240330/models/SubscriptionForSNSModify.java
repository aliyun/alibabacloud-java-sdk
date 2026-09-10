// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionForSNSModify extends TeaModel {
    /**
     * <p>The event content filter that matches conditions based on event fields such as labels, source, and severity. If this parameter is not specified, no events are received.</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>Specifies whether to subscribe to legacy product events (CMS 1.0, ARMS, or SLS events where workspace is null). Valid values:</p>
     * <ul>
     * <li>true: Subscribe to legacy product events.</li>
     * <li>false or null: Do not subscribe to legacy product events.</li>
     * </ul>
     */
    @NameInMap("subscribeLegacyEvent")
    public Boolean subscribeLegacyEvent;

    /**
     * <p>The global subscription configuration. If the subscription needs to receive events from other workspaces, specify the target workspace list by using workspaceUuids. If this parameter is not configured, only events from the current workspace are received.</p>
     */
    @NameInMap("workspaceFilterSetting")
    public WorkspaceFilterSetting workspaceFilterSetting;

    public static SubscriptionForSNSModify build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionForSNSModify self = new SubscriptionForSNSModify();
        return TeaModel.build(map, self);
    }

    public SubscriptionForSNSModify setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public SubscriptionForSNSModify setSubscribeLegacyEvent(Boolean subscribeLegacyEvent) {
        this.subscribeLegacyEvent = subscribeLegacyEvent;
        return this;
    }
    public Boolean getSubscribeLegacyEvent() {
        return this.subscribeLegacyEvent;
    }

    public SubscriptionForSNSModify setWorkspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
        this.workspaceFilterSetting = workspaceFilterSetting;
        return this;
    }
    public WorkspaceFilterSetting getWorkspaceFilterSetting() {
        return this.workspaceFilterSetting;
    }

}
