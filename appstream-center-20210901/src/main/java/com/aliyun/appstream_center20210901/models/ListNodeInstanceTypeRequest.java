// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodeInstanceTypeRequest extends TeaModel {
    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("Language")
    public String language;

    @NameInMap("NodeInstanceType")
    public String nodeInstanceType;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductType")
    public String productType;

    public static ListNodeInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInstanceTypeRequest self = new ListNodeInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeInstanceTypeRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListNodeInstanceTypeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListNodeInstanceTypeRequest setNodeInstanceType(String nodeInstanceType) {
        this.nodeInstanceType = nodeInstanceType;
        return this;
    }
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    public ListNodeInstanceTypeRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListNodeInstanceTypeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodeInstanceTypeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodeInstanceTypeRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
