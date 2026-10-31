// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiCallStatisticsShrinkRequest extends TeaModel {
    /**
     * <p>The search conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public String listQueryShrink;

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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The data service project ID.</p>
     * <blockquote>
     * <p>If this parameter is not specified:</p>
     * <ul>
     * <li>Super administrators can query data of all service projects.</li>
     * <li>Users other than super administrators can query data of service projects where they have the service project administrator or O&amp;M user permissions.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static ListDataServiceApiCallStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiCallStatisticsShrinkRequest self = new ListDataServiceApiCallStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiCallStatisticsShrinkRequest setListQueryShrink(String listQueryShrink) {
        this.listQueryShrink = listQueryShrink;
        return this;
    }
    public String getListQueryShrink() {
        return this.listQueryShrink;
    }

    public ListDataServiceApiCallStatisticsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataServiceApiCallStatisticsShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ListDataServiceApiCallStatisticsShrinkRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}
