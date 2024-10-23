// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListFunctionsRequest extends TeaModel {
    /**
     * <p>The version of Function Compute to which the functions belong. Valid values: v3 and v2. v3: only lists functions of Function Compute 3.0. v2: only lists functions of Function Compute 2.0. By default, this parameter is left empty and functions in both Function Compute 2.0 and Function Compute 3.0 are listed.</p>
     * 
     * <strong>example:</strong>
     * <p>v3</p>
     */
    @NameInMap("fcVersion")
    public String fcVersion;

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

    public static ListFunctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsRequest self = new ListFunctionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionsRequest setFcVersion(String fcVersion) {
        this.fcVersion = fcVersion;
        return this;
    }
    public String getFcVersion() {
        return this.fcVersion;
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

}
