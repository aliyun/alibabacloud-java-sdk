// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMembersRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMembersRequest self = new DescribeMembersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMembersRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeMembersRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public DescribeMembersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
