// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstanceQuotasRequest extends TeaModel {
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
     * <p>preload, free_cert</p>
     */
    @NameInMap("QuotaNames")
    public String quotaNames;

    /**
     * <strong>example:</strong>
     * <p>2882900****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListInstanceQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceQuotasRequest self = new ListInstanceQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceQuotasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceQuotasRequest setQuotaNames(String quotaNames) {
        this.quotaNames = quotaNames;
        return this;
    }
    public String getQuotaNames() {
        return this.quotaNames;
    }

    public ListInstanceQuotasRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
