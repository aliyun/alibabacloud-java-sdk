// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ListModelsByPageRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AlgorithmId")
    public Long algorithmId;

    @NameInMap("SizeType")
    public String sizeType;

    @NameInMap("ModelPackageStandard")
    public String modelPackageStandard;

    @NameInMap("Hardware")
    public String hardware;

    @NameInMap("NamePattern")
    public String namePattern;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static ListModelsByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsByPageRequest self = new ListModelsByPageRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsByPageRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public ListModelsByPageRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public ListModelsByPageRequest setAlgorithmId(Long algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

    public ListModelsByPageRequest setSizeType(String sizeType) {
        this.sizeType = sizeType;
        return this;
    }
    public String getSizeType() {
        return this.sizeType;
    }

    public ListModelsByPageRequest setModelPackageStandard(String modelPackageStandard) {
        this.modelPackageStandard = modelPackageStandard;
        return this;
    }
    public String getModelPackageStandard() {
        return this.modelPackageStandard;
    }

    public ListModelsByPageRequest setHardware(String hardware) {
        this.hardware = hardware;
        return this;
    }
    public String getHardware() {
        return this.hardware;
    }

    public ListModelsByPageRequest setNamePattern(String namePattern) {
        this.namePattern = namePattern;
        return this;
    }
    public String getNamePattern() {
        return this.namePattern;
    }

    public ListModelsByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelsByPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
