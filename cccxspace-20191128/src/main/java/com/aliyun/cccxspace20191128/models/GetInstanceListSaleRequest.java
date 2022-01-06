// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetInstanceListSaleRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UserId")
    public String userId;

    public static GetInstanceListSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListSaleRequest self = new GetInstanceListSaleRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceListSaleRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetInstanceListSaleRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetInstanceListSaleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetInstanceListSaleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
