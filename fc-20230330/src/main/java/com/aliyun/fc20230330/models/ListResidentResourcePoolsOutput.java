// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListResidentResourcePoolsOutput extends TeaModel {
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("residentResourcePools")
    public java.util.List<ResidentResourcePool> residentResourcePools;

    public static ListResidentResourcePoolsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListResidentResourcePoolsOutput self = new ListResidentResourcePoolsOutput();
        return TeaModel.build(map, self);
    }

    public ListResidentResourcePoolsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResidentResourcePoolsOutput setResidentResourcePools(java.util.List<ResidentResourcePool> residentResourcePools) {
        this.residentResourcePools = residentResourcePools;
        return this;
    }
    public java.util.List<ResidentResourcePool> getResidentResourcePools() {
        return this.residentResourcePools;
    }

}
