// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListEnterpriseSupportPlanRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListEnterpriseSupportPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseSupportPlanRequest self = new ListEnterpriseSupportPlanRequest();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseSupportPlanRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListEnterpriseSupportPlanRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
