// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateUserDeliveryTaskRequest extends TeaModel {
    /**
     * <p>The real-time log type. Valid values:</p>
     * <ul>
     * <li><strong>dcdn_log_access_l1 (default)</strong>: access logs.</li>
     * <li><strong>dcdn_log_er</strong>: Edge Routine function logs.</li>
     * <li><strong>dcdn_log_waf</strong>: security protection logs.</li>
     * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration logs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_er</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The list of ER PODs to configure.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx,xxx</p>
     */
    @NameInMap("Details")
    public String details;

    /**
     * <p>The discard rate. If not specified, the default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>The selected fields, separated by commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ClientRequestID,ClientRequestHost</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The version of the filter rule.</p>
     * <blockquote>
     * <p>Compatible with legacy filter rules. The default value is v1. Newly created tasks use v2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("FilterVer")
    public String filterVer;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static UpdateUserDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDeliveryTaskRequest self = new UpdateUserDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserDeliveryTaskRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public UpdateUserDeliveryTaskRequest setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public UpdateUserDeliveryTaskRequest setDiscardRate(Float discardRate) {
        this.discardRate = discardRate;
        return this;
    }
    public Float getDiscardRate() {
        return this.discardRate;
    }

    public UpdateUserDeliveryTaskRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public UpdateUserDeliveryTaskRequest setFilterVer(String filterVer) {
        this.filterVer = filterVer;
        return this;
    }
    public String getFilterVer() {
        return this.filterVer;
    }

    public UpdateUserDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
