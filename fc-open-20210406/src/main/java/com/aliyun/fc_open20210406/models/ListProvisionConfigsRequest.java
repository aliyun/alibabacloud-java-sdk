// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsRequest extends TeaModel {
    // The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number.
    @NameInMap("limit")
    public Long limit;

    // The token used to obtain more results. You do not need to provide this parameter in the first call. The tokens for subsequent queries are obtained from the returned results.
    @NameInMap("nextToken")
    public String nextToken;

    // The qualifier of the service to which resources belong. The qualifier must be aliasName and used together with the serviceName parameter.
    @NameInMap("qualifier")
    public String qualifier;

    // The name of the service to which resources belong.
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
