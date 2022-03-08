// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConfigurationSpecificationsRequest extends TeaModel {
    // 架构类型
    @NameInMap("Architecture")
    public String architecture;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 型号
    @NameInMap("Model")
    public String model;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 角色
    @NameInMap("Role")
    public String role;

    // 配置规范名字
    @NameInMap("SpecificationName")
    public String specificationName;

    // 厂商
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
