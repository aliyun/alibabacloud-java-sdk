// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsDbInfosRequest extends TeaModel {
    @NameInMap("RdsInstId")
    public String rdsInstId;

    @NameInMap("Search")
    public String search;

    public static DescribeRdsDbInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsDbInfosRequest self = new DescribeRdsDbInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsDbInfosRequest setRdsInstId(String rdsInstId) {
        this.rdsInstId = rdsInstId;
        return this;
    }
    public String getRdsInstId() {
        return this.rdsInstId;
    }

    public DescribeRdsDbInfosRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}
