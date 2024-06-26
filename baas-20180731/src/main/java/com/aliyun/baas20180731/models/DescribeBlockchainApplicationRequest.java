// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainApplicationRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    public static DescribeBlockchainApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainApplicationRequest self = new DescribeBlockchainApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainApplicationRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeBlockchainApplicationRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public DescribeBlockchainApplicationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBlockchainApplicationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
