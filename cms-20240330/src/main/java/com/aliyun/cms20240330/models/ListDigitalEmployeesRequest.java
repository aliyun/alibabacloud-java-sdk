// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeesRequest extends TeaModel {
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("employeeType")
    public String employeeType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public java.util.List<Tag> tags;

    public static ListDigitalEmployeesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeesRequest self = new ListDigitalEmployeesRequest();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeesRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListDigitalEmployeesRequest setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
        return this;
    }
    public String getEmployeeType() {
        return this.employeeType;
    }

    public ListDigitalEmployeesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDigitalEmployeesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDigitalEmployeesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDigitalEmployeesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListDigitalEmployeesRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
