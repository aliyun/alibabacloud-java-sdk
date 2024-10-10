// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstanceQuotasWithUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customHttpCert</p>
     */
    @NameInMap("QuotaNames")
    public String quotaNames;

    /**
     * <strong>example:</strong>
     * <p>1232223****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListInstanceQuotasWithUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceQuotasWithUsageRequest self = new ListInstanceQuotasWithUsageRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceQuotasWithUsageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceQuotasWithUsageRequest setQuotaNames(String quotaNames) {
        this.quotaNames = quotaNames;
        return this;
    }
    public String getQuotaNames() {
        return this.quotaNames;
    }

    public ListInstanceQuotasWithUsageRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
