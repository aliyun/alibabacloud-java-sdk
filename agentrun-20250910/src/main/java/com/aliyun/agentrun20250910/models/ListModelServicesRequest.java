// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelServicesRequest extends TeaModel {
    /**
     * <p>The model type. Valid values:</p>
     * <ul>
     * <li><p><code>system</code>: A built-in model.</p>
     * </li>
     * <li><p><code>deployment</code>: A model from a custom deployment.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The cloud provider. Currently, only Alibaba Cloud is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>The provider type.</p>
     * 
     * <strong>example:</strong>
     * <p>providerType</p>
     */
    @NameInMap("providerType")
    public String providerType;

    @NameInMap("workspaceId")
    public String workspaceId;

    @NameInMap("workspaceIds")
    public String workspaceIds;

    public static ListModelServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelServicesRequest self = new ListModelServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListModelServicesRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListModelServicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelServicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelServicesRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListModelServicesRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public ListModelServicesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListModelServicesRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
