// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class KillJobsRequest extends TeaModel {
    /**
     * <p>The list of jobs to terminate. The instanceId is obtained from the job instance ID returned by ListJobInfos, and the projectName is obtained from the project name returned by ListProjects.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;instanceId&quot;: &quot;&quot;,
     *             &quot;projectName&quot;: &quot;&quot;
     *       },
     *       {
     *             &quot;instanceId&quot;: &quot;&quot;,
     *             &quot;projectName&quot;: &quot;&quot;
     *       }
     * ]</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>478403690625249</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static KillJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        KillJobsRequest self = new KillJobsRequest();
        return TeaModel.build(map, self);
    }

    public KillJobsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public KillJobsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public KillJobsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
