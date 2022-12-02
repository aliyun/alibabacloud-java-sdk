// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConfigurationSpecificationsRequest extends TeaModel {
    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Model")
    public String model;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Role")
    public String role;

    @NameInMap("SpecificationName")
    public String specificationName;

    @NameInMap("Vendor")
    public String vendor;

    public static ListConfigurationSpecificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigurationSpecificationsRequest self = new ListConfigurationSpecificationsRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigurationSpecificationsRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public ListConfigurationSpecificationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConfigurationSpecificationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConfigurationSpecificationsRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListConfigurationSpecificationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConfigurationSpecificationsRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListConfigurationSpecificationsRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public ListConfigurationSpecificationsRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
