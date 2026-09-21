// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineEnvironmentVariablesResponseBody extends TeaModel {
    /**
     * <p>The number of environment variables.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The environment variable dictionary.</p>
     */
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, EnvironmentVariablesValue> environmentVariables;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of environment variables.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRoutineEnvironmentVariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineEnvironmentVariablesResponseBody self = new ListRoutineEnvironmentVariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoutineEnvironmentVariablesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListRoutineEnvironmentVariablesResponseBody setEnvironmentVariables(java.util.Map<String, EnvironmentVariablesValue> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, EnvironmentVariablesValue> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public ListRoutineEnvironmentVariablesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRoutineEnvironmentVariablesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRoutineEnvironmentVariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoutineEnvironmentVariablesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
