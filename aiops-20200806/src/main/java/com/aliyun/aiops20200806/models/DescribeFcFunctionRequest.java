// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeFcFunctionRequest extends TeaModel {
    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("ServiceName")
    public String serviceName;

    public static DescribeFcFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFcFunctionRequest self = new DescribeFcFunctionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFcFunctionRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeFcFunctionRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFcFunctionRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeFcFunctionRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public DescribeFcFunctionRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public DescribeFcFunctionRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
