// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class ListMyAlgorithmRequest extends TeaModel {
    @NameInMap("AlgorithmName")
    public String algorithmName;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListMyAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyAlgorithmRequest self = new ListMyAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public ListMyAlgorithmRequest setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public ListMyAlgorithmRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMyAlgorithmRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
