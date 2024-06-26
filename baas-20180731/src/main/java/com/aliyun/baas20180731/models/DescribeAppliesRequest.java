// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAppliesRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    public static DescribeAppliesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppliesRequest self = new DescribeAppliesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppliesRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeAppliesRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public DescribeAppliesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppliesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
