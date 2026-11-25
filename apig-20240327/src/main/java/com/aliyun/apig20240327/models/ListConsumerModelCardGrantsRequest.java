// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerModelCardGrantsRequest extends TeaModel {
    /**
     * <p>Filters by model card ID for reverse lookup.</p>
     * 
     * <strong>example:</strong>
     * <p>msc-d00000000000000000000</p>
     */
    @NameInMap("modelCardId")
    public String modelCardId;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filters by principal ID. This parameter must be paired with principalType.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-d00000000000000000000</p>
     */
    @NameInMap("principalId")
    public String principalId;

    /**
     * <p>Filters by principal type. Valid values: Consumer and ConsumerGroup. This parameter must be paired with principalId.</p>
     * 
     * <strong>example:</strong>
     * <p>Consumer</p>
     */
    @NameInMap("principalType")
    public String principalType;

    public static ListConsumerModelCardGrantsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerModelCardGrantsRequest self = new ListConsumerModelCardGrantsRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumerModelCardGrantsRequest setModelCardId(String modelCardId) {
        this.modelCardId = modelCardId;
        return this;
    }
    public String getModelCardId() {
        return this.modelCardId;
    }

    public ListConsumerModelCardGrantsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConsumerModelCardGrantsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConsumerModelCardGrantsRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public ListConsumerModelCardGrantsRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
