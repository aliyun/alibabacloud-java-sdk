// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteDeliveryTaskStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the delivery task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The name of the delivery task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cdn-test-task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static UpdateSiteDeliveryTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteDeliveryTaskStatusRequest self = new UpdateSiteDeliveryTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteDeliveryTaskStatusRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public UpdateSiteDeliveryTaskStatusRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateSiteDeliveryTaskStatusRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
