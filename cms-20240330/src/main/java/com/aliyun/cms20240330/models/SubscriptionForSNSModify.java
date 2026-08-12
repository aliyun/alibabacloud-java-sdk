// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionForSNSModify extends TeaModel {
    /**
     * <p>The filter configuration.</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>Specifies whether to subscribe to legacy product events (CMS 1.0, ARMS, or SLS events where workspace is null). Valid values:</p>
     * <ul>
     * <li>true: Subscribe.</li>
     * <li>false or null: Do not subscribe.</li>
     * </ul>
     */
    @NameInMap("subscribeLegacyEvent")
    public Boolean subscribeLegacyEvent;

    /**
     * <p>The workspace filter configuration.</p>
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
