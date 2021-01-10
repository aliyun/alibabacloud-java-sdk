// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ListAlgorithmsByPageRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("NamePattern")
    public String namePattern;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static ListAlgorithmsByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmsByPageRequest self = new ListAlgorithmsByPageRequest();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmsByPageRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public ListAlgorithmsByPageRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public ListAlgorithmsByPageRequest setNamePattern(String namePattern) {
        this.namePattern = namePattern;
        return this;
    }
    public String getNamePattern() {
        return this.namePattern;
    }

    public ListAlgorithmsByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlgorithmsByPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
