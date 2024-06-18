// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesSummaryShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607452e01401526ee39609e1</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    @NameInMap("summaryTypeList")
    public String summaryTypeListShrink;

    public static QueryMinutesSummaryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesSummaryShrinkRequest self = new QueryMinutesSummaryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMinutesSummaryShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public QueryMinutesSummaryShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public QueryMinutesSummaryShrinkRequest setSummaryTypeListShrink(String summaryTypeListShrink) {
        this.summaryTypeListShrink = summaryTypeListShrink;
        return this;
    }
    public String getSummaryTypeListShrink() {
        return this.summaryTypeListShrink;
    }

}
