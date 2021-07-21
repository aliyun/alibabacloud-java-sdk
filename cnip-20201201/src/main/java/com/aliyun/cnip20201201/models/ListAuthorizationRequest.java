// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAuthorizationRequest extends TeaModel {
    // 默认为false, 代表获取作为授权人，授权给其他人的资源列表；如果为true，则返回其他人授权给自己的资源列表
    @NameInMap("asGrantee")
    public Boolean asGrantee;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("resourceIdentifier")
    public String resourceIdentifier;

    @NameInMap("pageNum")
    public Long pageNum;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("sortKey")
    public String sortKey;

    @NameInMap("sortDirect")
    public String sortDirect;

    public static ListAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRequest self = new ListAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRequest setAsGrantee(Boolean asGrantee) {
        this.asGrantee = asGrantee;
        return this;
    }
    public Boolean getAsGrantee() {
        return this.asGrantee;
    }

    public ListAuthorizationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAuthorizationRequest setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public ListAuthorizationRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListAuthorizationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizationRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public ListAuthorizationRequest setSortDirect(String sortDirect) {
        this.sortDirect = sortDirect;
        return this;
    }
    public String getSortDirect() {
        return this.sortDirect;
    }

}
