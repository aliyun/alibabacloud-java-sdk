// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListFunctionsRequest extends TeaModel {
    /**
     * <p>The function description to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>test_description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The version to which the function belongs. Valid values:</p>
     * <ul>
     * <li>v3: lists only FC 3.0 functions.</li>
     * <li>v2: lists only FC 2.0 functions.</li>
     * </ul>
     * <p>If not specified, both FC 3.0 and FC 2.0 functions are listed.</p>
     * 
     * <strong>example:</strong>
     * <p>v3</p>
     */
    @NameInMap("fcVersion")
    public String fcVersion;

    /**
     * <p>The function name.</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The function GPU type to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>fc.gpu.tesla.1</p>
     */
    @NameInMap("gpuType")
    public String gpuType;

    /**
     * <p>The number of functions to return. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNCNhYmM=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The function name prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>my-func</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The function runtime to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>python3.10</p>
     */
    @NameInMap("runtime")
    public String runtime;

    /**
     * <p>The function tags to filter by.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    public static ListFunctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsRequest self = new ListFunctionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListFunctionsRequest setFcVersion(String fcVersion) {
        this.fcVersion = fcVersion;
        return this;
    }
    public String getFcVersion() {
        return this.fcVersion;
    }

    public ListFunctionsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ListFunctionsRequest setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public ListFunctionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFunctionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFunctionsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListFunctionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListFunctionsRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public ListFunctionsRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
