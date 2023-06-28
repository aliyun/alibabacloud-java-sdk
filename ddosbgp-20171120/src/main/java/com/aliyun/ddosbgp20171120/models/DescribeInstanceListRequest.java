// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeInstanceListRequest extends TeaModel {
    @NameInMap("InstanceIdList")
    public String instanceIdList;

    @NameInMap("PackIdList")
    public String packIdList;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceListRequest self = new DescribeInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceListRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceListRequest setPackIdList(String packIdList) {
        this.packIdList = packIdList;
        return this;
    }
    public String getPackIdList() {
        return this.packIdList;
    }

    public DescribeInstanceListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
