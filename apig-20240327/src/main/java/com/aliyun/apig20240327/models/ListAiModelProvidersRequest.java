// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListAiModelProvidersRequest extends TeaModel {
    /**
     * <p>The ID of the AI gateway instance. The target instance must exist, belong to the current account, and be of the AI gateway type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-8c13d2b4f8a1</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The page number. Default value: 1. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The fuzzy match condition for the model provider identifier. If left empty, all model providers under the current gateway are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("provider")
    public String provider;

    public static ListAiModelProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAiModelProvidersRequest self = new ListAiModelProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListAiModelProvidersRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListAiModelProvidersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAiModelProvidersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAiModelProvidersRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
