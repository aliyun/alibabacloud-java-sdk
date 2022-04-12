// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class PageQueryResourcePackageListRequest extends TeaModel {
    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    // 资源包类型,PackageType[CU(cu),code,cssResourceType,desc]
    @NameInMap("PackageType")
    public String packageType;

    // 当前页码，默认1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页项数，默认20,最大100
    @NameInMap("PageSize")
    public Integer pageSize;

    // 查询过期的资源包类型,ResourcePackageValidQueryConditionType[All(查询所有资源包),CurrentlyValid(查询当前有效的资源包(已开始，未结束)),PendingValid(未开始,即将生效的资源包),AllValid(已开始未结束 + 即将开始 的资源包),PendingInvalid5m(5min内即将到期的资源包),HasInvalid(已经过期的资源包),queryType,desc]
    @NameInMap("QueryValidType")
    public String queryValidType;

    public static PageQueryResourcePackageListRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQueryResourcePackageListRequest self = new PageQueryResourcePackageListRequest();
        return TeaModel.build(map, self);
    }

    public PageQueryResourcePackageListRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public PageQueryResourcePackageListRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public PageQueryResourcePackageListRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public PageQueryResourcePackageListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public PageQueryResourcePackageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageQueryResourcePackageListRequest setQueryValidType(String queryValidType) {
        this.queryValidType = queryValidType;
        return this;
    }
    public String getQueryValidType() {
        return this.queryValidType;
    }

}
