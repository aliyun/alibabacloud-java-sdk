// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelProvidersRequest extends TeaModel {
    /**
     * <p>The name of the model to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>aa</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <p>The model type to filter by. Valid values:</p>
     * <ul>
     * <li><p><code>system</code>: A system model.</p>
     * </li>
     * <li><p><code>deployment</code>: A custom deployment model.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pop</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The page number to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public String pageNumber;

    /**
     * <p>The number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The cloud provider. To specify Alibaba Cloud, use the value \&quot;Aliyun\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("provider")
    public String provider;

    public static ListModelProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelProvidersRequest self = new ListModelProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListModelProvidersRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListModelProvidersRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListModelProvidersRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListModelProvidersRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListModelProvidersRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
