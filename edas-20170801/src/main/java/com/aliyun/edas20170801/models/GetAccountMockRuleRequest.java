// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetAccountMockRuleRequest extends TeaModel {
    @NameInMap("ConsumerAppName")
    public String consumerAppName;

    @NameInMap("MockType")
    public Long mockType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ProviderAppName")
    public String providerAppName;

    @NameInMap("Region")
    public String region;

    public static GetAccountMockRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMockRuleRequest self = new GetAccountMockRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountMockRuleRequest setConsumerAppName(String consumerAppName) {
        this.consumerAppName = consumerAppName;
        return this;
    }
    public String getConsumerAppName() {
        return this.consumerAppName;
    }

    public GetAccountMockRuleRequest setMockType(Long mockType) {
        this.mockType = mockType;
        return this;
    }
    public Long getMockType() {
        return this.mockType;
    }

    public GetAccountMockRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAccountMockRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetAccountMockRuleRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public GetAccountMockRuleRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetAccountMockRuleRequest setProviderAppName(String providerAppName) {
        this.providerAppName = providerAppName;
        return this;
    }
    public String getProviderAppName() {
        return this.providerAppName;
    }

    public GetAccountMockRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
