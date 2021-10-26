// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsRequest extends TeaModel {
    // 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过100。返回结果可能小于指定的数量，但不会多于指定的数量	
    @NameInMap("limit")
    public Long limit;

    // 用来返回更多结果。第一次查询不需要提供这个参数，后续查询的token从返回结果中获取
    @NameInMap("nextToken")
    public String nextToken;

    // 限定返回的资源名称必须属于该qualifier。qualifier只能是aliasName，且必须和serviceName共同使用
    @NameInMap("qualifier")
    public String qualifier;

    // 限定返回的资源名称必须属于该service
    @NameInMap("serviceName")
    public String serviceName;

    public static ListProvisionConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionConfigsRequest self = new ListProvisionConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListProvisionConfigsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListProvisionConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProvisionConfigsRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListProvisionConfigsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
