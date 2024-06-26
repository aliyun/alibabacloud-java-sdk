// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainApplicationsRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    public static DescribeAntChainApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainApplicationsRequest self = new DescribeAntChainApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainApplicationsRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeAntChainApplicationsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public DescribeAntChainApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAntChainApplicationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
