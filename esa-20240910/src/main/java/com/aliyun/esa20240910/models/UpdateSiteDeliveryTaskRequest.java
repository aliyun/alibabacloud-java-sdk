// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteDeliveryTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dcdn_log_er</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ClientIP,UserAgent</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cdn-test-task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static UpdateSiteDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteDeliveryTaskRequest self = new UpdateSiteDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteDeliveryTaskRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public UpdateSiteDeliveryTaskRequest setDiscardRate(Float discardRate) {
        this.discardRate = discardRate;
        return this;
    }
    public Float getDiscardRate() {
        return this.discardRate;
    }

    public UpdateSiteDeliveryTaskRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public UpdateSiteDeliveryTaskRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateSiteDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
