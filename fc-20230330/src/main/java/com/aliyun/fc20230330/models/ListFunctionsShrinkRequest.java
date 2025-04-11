// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListFunctionsShrinkRequest extends TeaModel {
    /**
     * <p>The description of the functions to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>test_description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The version of Function Compute to which the functions belong.</p>
     * <ul>
     * <li>v3: Only lists functions of Function Compute 3.0.</li>
     * <li>v2: Only lists functions of Function Compute 2.0.</li>
     * </ul>
     * <p>By default, this parameter is left empty and functions in both Function Compute 3.0 and Function Compute 2.0 are listed.</p>
     * 
     * <strong>example:</strong>
     * <p>v3</p>
     */
    @NameInMap("fcVersion")
    public String fcVersion;

    /**
     * <p>The GPU type of the functions to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>fc.gpu.tesla.1</p>
     */
    @NameInMap("gpuType")
    public String gpuType;

    /**
     * <p>The number of functions to return. The minimum value is 1 and the maximum value is 100.</p>
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
     * <p>The prefix of the function name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-func</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The runtime of the functions to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>python3.10</p>
     */
    @NameInMap("runtime")
    public String runtime;

    /**
     * <p>The tag of the functions to retrieve.</p>
     */
    @NameInMap("tags")
    public String tagsShrink;

    public static ListFunctionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsShrinkRequest self = new ListFunctionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionsShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListFunctionsShrinkRequest setFcVersion(String fcVersion) {
        this.fcVersion = fcVersion;
        return this;
    }
    public String getFcVersion() {
        return this.fcVersion;
    }

    public ListFunctionsShrinkRequest setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public ListFunctionsShrinkRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFunctionsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFunctionsShrinkRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListFunctionsShrinkRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public ListFunctionsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
