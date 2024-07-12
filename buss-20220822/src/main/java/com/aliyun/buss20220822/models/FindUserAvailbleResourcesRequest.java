// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class FindUserAvailbleResourcesRequest extends TeaModel {
    @NameInMap("bussinessCode")
    public String bussinessCode;

    @NameInMap("currPage")
    public Integer currPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("userId")
    public String userId;

    public static FindUserAvailbleResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        FindUserAvailbleResourcesRequest self = new FindUserAvailbleResourcesRequest();
        return TeaModel.build(map, self);
    }

    public FindUserAvailbleResourcesRequest setBussinessCode(String bussinessCode) {
        this.bussinessCode = bussinessCode;
        return this;
    }
    public String getBussinessCode() {
        return this.bussinessCode;
    }

    public FindUserAvailbleResourcesRequest setCurrPage(Integer currPage) {
        this.currPage = currPage;
        return this;
    }
    public Integer getCurrPage() {
        return this.currPage;
    }

    public FindUserAvailbleResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FindUserAvailbleResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public FindUserAvailbleResourcesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
