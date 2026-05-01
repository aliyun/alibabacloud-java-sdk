// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelTemplateResourceGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    public static ListModelTemplateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelTemplateResourceGroupRequest self = new ListModelTemplateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListModelTemplateResourceGroupRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public ListModelTemplateResourceGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelTemplateResourceGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelTemplateResourceGroupRequest setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

}
