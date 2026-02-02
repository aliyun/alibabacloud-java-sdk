// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeesShrinkRequest extends TeaModel {
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
    public String tagsShrink;

    public static ListDigitalEmployeesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeesShrinkRequest self = new ListDigitalEmployeesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeesShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListDigitalEmployeesShrinkRequest setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
        return this;
    }
    public String getEmployeeType() {
        return this.employeeType;
    }

    public ListDigitalEmployeesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDigitalEmployeesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDigitalEmployeesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDigitalEmployeesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListDigitalEmployeesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
