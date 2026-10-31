// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDirectoryTreeRequest extends TeaModel {
    /**
     * <p>The directory type. Valid values:</p>
     * <ul>
     * <li>tempCode: Ad hoc query.</li>
     * <li>codeManage: Code task.</li>
     * <li>offlinePipeline: Offline pipeline.</li>
     * <li>offlinePipelineCustomPlugin: Custom pipeline component.</li>
     * <li>dataX: Synchronization task.</li>
     * <li>streamMeta: Real-time metadata table.</li>
     * <li>streamCustomDataSource: Real-time custom source.</li>
     * <li>streamTemplate: Real-time computing template.</li>
     * <li>resourceManage: Resource management.</li>
     * <li>udfResource: Offline function.</li>
     * <li>streamFunction: Real-time function.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>codeManage</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operating user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7081229106458752</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetDirectoryTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryTreeRequest self = new GetDirectoryTreeRequest();
        return TeaModel.build(map, self);
    }

    public GetDirectoryTreeRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetDirectoryTreeRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetDirectoryTreeRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetDirectoryTreeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
