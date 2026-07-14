// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionDetail extends TeaModel {
    /**
     * <p>The filter conditions for event content.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>Specifies whether to subscribe to legacy product events (events with an empty workspace from CMS 1.0, ARMS, or SLS).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("subscribeLegacyEvent")
    public Boolean subscribeLegacyEvent;

    /**
     * <p>The cross-workspace event routing (global subscription) settings.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("workspaceFilterSetting")
    public WorkspaceFilterSetting workspaceFilterSetting;

    public static SubscriptionDetail build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionDetail self = new SubscriptionDetail();
        return TeaModel.build(map, self);
    }

    public SubscriptionDetail setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public SubscriptionDetail setSubscribeLegacyEvent(Boolean subscribeLegacyEvent) {
        this.subscribeLegacyEvent = subscribeLegacyEvent;
        return this;
    }
    public Boolean getSubscribeLegacyEvent() {
        return this.subscribeLegacyEvent;
    }

    public SubscriptionDetail setWorkspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
        this.workspaceFilterSetting = workspaceFilterSetting;
        return this;
    }
    public WorkspaceFilterSetting getWorkspaceFilterSetting() {
        return this.workspaceFilterSetting;
    }

}
