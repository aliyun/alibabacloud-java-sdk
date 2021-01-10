// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ListModelVersionsByPageRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AlgorithmName")
    public String algorithmName;

    @NameInMap("SizeType")
    public String sizeType;

    @NameInMap("ModelPackageStandard")
    public String modelPackageStandard;

    @NameInMap("Hardware")
    public String hardware;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static ListModelVersionsByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelVersionsByPageRequest self = new ListModelVersionsByPageRequest();
        return TeaModel.build(map, self);
    }

    public ListModelVersionsByPageRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public ListModelVersionsByPageRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public ListModelVersionsByPageRequest setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public ListModelVersionsByPageRequest setSizeType(String sizeType) {
        this.sizeType = sizeType;
        return this;
    }
    public String getSizeType() {
        return this.sizeType;
    }

    public ListModelVersionsByPageRequest setModelPackageStandard(String modelPackageStandard) {
        this.modelPackageStandard = modelPackageStandard;
        return this;
    }
    public String getModelPackageStandard() {
        return this.modelPackageStandard;
    }

    public ListModelVersionsByPageRequest setHardware(String hardware) {
        this.hardware = hardware;
        return this;
    }
    public String getHardware() {
        return this.hardware;
    }

    public ListModelVersionsByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelVersionsByPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
