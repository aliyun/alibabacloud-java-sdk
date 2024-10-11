// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFilteringAlgorithmsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("algorithmId")
    public String algorithmId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static ListFilteringAlgorithmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFilteringAlgorithmsRequest self = new ListFilteringAlgorithmsRequest();
        return TeaModel.build(map, self);
    }

    public ListFilteringAlgorithmsRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public ListFilteringAlgorithmsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListFilteringAlgorithmsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListFilteringAlgorithmsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
