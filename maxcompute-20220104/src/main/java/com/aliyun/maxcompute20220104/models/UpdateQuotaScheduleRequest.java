// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaScheduleRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * 
     * <strong>example:</strong>
     * <h1>The quota plan immediately takes effect.</h1>
     * <p>[
     *   {
     *     &quot;type&quot;: &quot;once&quot;,
     *     &quot;plan&quot;: &quot;planA&quot;,
     *     &quot;operator&quot;: &quot;userA&quot;
     *   }
     * ]</p>
     * <h1>The quota plan is scheduled on a regular basis.</h1>
     * <p>[
     *   {
     *     &quot;id&quot;: &quot;etl_time&quot;,
     *     &quot;type&quot;: &quot;daily&quot;,
     *     &quot;condition&quot;: {
     *       &quot;at&quot;: &quot;0800&quot;
     *     },
     *     &quot;plan&quot;: &quot;planA&quot;
     *   },
     *   {
     *     &quot;id&quot;: &quot;bi&quot;,
     *     &quot;type&quot;: &quot;daily&quot;,
     *     &quot;condition&quot;: {
     *       &quot;at&quot;: &quot;0900&quot;
     *     },
     *     &quot;plan&quot;: &quot;planB&quot;
     *   }
     * ]</p>
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
