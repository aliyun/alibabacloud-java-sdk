// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductDeploymentsRequest extends TeaModel {
    @NameInMap("environmentUID")
    public String environmentUID;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static ListProductDeploymentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductDeploymentsRequest self = new ListProductDeploymentsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductDeploymentsRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public ListProductDeploymentsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListProductDeploymentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductDeploymentsRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
