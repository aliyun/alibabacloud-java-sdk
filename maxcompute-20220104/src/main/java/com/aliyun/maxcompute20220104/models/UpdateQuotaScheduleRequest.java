// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaScheduleRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>\# The quota plan immediately takes effect. [ { &quot;type&quot;: &quot;once&quot;, &quot;plan&quot;: &quot;planA&quot;, &quot;operator&quot;:&quot;userA&quot; } ] # The quota plan is scheduled on a regular basis. [ { &quot;id&quot;: &quot;etl_time&quot;, &quot;type&quot;: &quot;daily&quot;, &quot;condition&quot;: { &quot;at&quot;: &quot;0800&quot;, &quot;after&quot;: &quot;2022-04-25T04:23:04Z&quot; // optional }, &quot;plan&quot;: &quot;planA&quot; }, { &quot;id&quot;: &quot;bi&quot;, &quot;type&quot;: &quot;daily&quot;, &quot;condition&quot;: { &quot;at&quot;: &quot;0900&quot;, &quot;after&quot;: &quot;2022-04-25T04:23:04Z&quot; // optional }, &quot;plan&quot;: &quot;planB&quot; }, ]</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>478403690625249</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateQuotaScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaScheduleRequest self = new UpdateQuotaScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaScheduleRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateQuotaScheduleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateQuotaScheduleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
