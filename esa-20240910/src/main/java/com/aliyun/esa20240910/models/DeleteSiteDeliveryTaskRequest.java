// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteSiteDeliveryTaskRequest extends TeaModel {
    /**
     * <p>The site ID. You can obtain the site ID by calling <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456******</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cdn-test-task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DeleteSiteDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteDeliveryTaskRequest self = new DeleteSiteDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSiteDeliveryTaskRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DeleteSiteDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
