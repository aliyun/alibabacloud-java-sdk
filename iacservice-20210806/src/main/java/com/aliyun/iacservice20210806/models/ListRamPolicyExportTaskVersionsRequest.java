// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRamPolicyExportTaskVersionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("status")
    public String status;

    public static ListRamPolicyExportTaskVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRamPolicyExportTaskVersionsRequest self = new ListRamPolicyExportTaskVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRamPolicyExportTaskVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRamPolicyExportTaskVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRamPolicyExportTaskVersionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
