// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListDirectionalDetailRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDirectionalDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDirectionalDetailRequest self = new ListDirectionalDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListDirectionalDetailRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public ListDirectionalDetailRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListDirectionalDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
