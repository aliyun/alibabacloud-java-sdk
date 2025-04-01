// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListServiceDeploymentsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ServiceDeployment> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListServiceDeploymentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceDeploymentsResponseBody self = new ListServiceDeploymentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceDeploymentsResponseBody setData(java.util.List<ServiceDeployment> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ServiceDeployment> getData() {
        return this.data;
    }

    public ListServiceDeploymentsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceDeploymentsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListServiceDeploymentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
