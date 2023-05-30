// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsRequest extends TeaModel {
    /**
     * <p>Queries provisioned instances.</p>
     */
    @NameInMap("limit")
    public Long limit;

    /**
     * <p>Alibaba Cloud provides SDKs for multiple programming languages to help you integrate Alibaba Cloud services by using APIs. We recommend that you use an SDK to call API operations. This frees you from manual signature verification.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The token used to obtain more results.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>It is a tool used to manage and configure Alibaba Cloud resources. After simple installation and configuration, you can use Alibaba Cloud CLI to manage multiple Alibaba Cloud services and migrate your data and business to the cloud with ease.</p>
     */
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
