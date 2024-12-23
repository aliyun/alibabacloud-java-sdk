// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaPlanRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;name&quot;: &quot;planA&quot;, // The quota is a level-1 quota. You can select only the fields that are related to the quota plan. &quot;quota&quot;: { &quot;name&quot;: &quot;a&quot;, &quot;nickName&quot;: &quot;aaa_nick&quot;, &quot;tenantId&quot;: &quot;10001&quot;, &quot;regionId&quot;: &quot;cn-hangzhou&quot;, &quot;parentId&quot;: &quot;0&quot;, &quot;cluster&quot;: &quot;AT-ODPS-TEST3&quot;, &quot;parameter&quot;: { &quot;minCU&quot;: 40, &quot;maxCU&quot;: 40, &quot;adhocCU&quot;: 0, &quot;elasticMinCU&quot;: 40, &quot;elasticMaxCU&quot;: 40, &quot;enablePreemptiveScheduling&quot;: false, &quot;forceReservedMin&quot;:true, &quot;enablePriority&quot;:false, &quot;singleJobCULimit&quot;:100, &quot;adhocQuotaBeginTimeInSec&quot;: 1345, &quot;adhocQuotaEndTimeInSec&quot;: 1234, &quot;ignoreAdhocQuota&quot;:false }, &quot;subQuotaInfoList&quot;: [ { &quot;nickName&quot;: &quot;WlmFuxiSecondaryOnlineQuotaTest&quot;, &quot;name&quot;: &quot;WlmFuxiSecondaryOnlineQuotaTest&quot;, &quot;type&quot;: &quot;FUXI_ONLINE&quot;, &quot;tenantId&quot;: &quot;10001&quot;, &quot;regionId&quot;: &quot;cn-hangzhou&quot;, &quot;cluster&quot;: &quot;AT-ODPS-TEST3&quot;, &quot;parameter&quot;: { &quot;minCU&quot;: 40, &quot;maxCU&quot;: 40, &quot;adhocCU&quot;: 0, &quot;elasticMinCU&quot;: 40, &quot;elasticMaxCU&quot;: 40, &quot;enablePreemptiveScheduling&quot;: false, &quot;forceReservedMin&quot;:true, &quot;enablePriority&quot;:false, &quot;singleJobCULimit&quot;:100, &quot;adhocQuotaBeginTimeInSec&quot;: 1345, &quot;adhocQuotaEndTimeInSec&quot;: 1234, &quot;ignoreAdhocQuota&quot;:false } } ] } }</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>228451885265153</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateQuotaPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaPlanRequest self = new CreateQuotaPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaPlanRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateQuotaPlanRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateQuotaPlanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
