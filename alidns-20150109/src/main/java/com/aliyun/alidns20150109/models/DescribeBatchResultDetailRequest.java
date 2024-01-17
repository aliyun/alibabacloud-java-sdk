// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultDetailRequest extends TeaModel {
    /**
     * <p>The type of the batch operation. Valid values:</p>
     * <br>
     * <p>*   **DOMAIN_ADD**: adds domain names in batches.</p>
     * <p>*   **DOMAIN_DEL**: deletes domain names in batches.</p>
     * <p>*   **RR_ADD**: adds Domain Name System (DNS) records in batches.</p>
     * <p>*   **RR_DEL**: deletes DNS records in batches.</p>
     */
    @NameInMap("BatchType")
    public String batchType;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The execution result. If you do not specify this parameter, all results are returned.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the batch operation task.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeBatchResultDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultDetailRequest self = new DescribeBatchResultDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultDetailRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public DescribeBatchResultDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeBatchResultDetailRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBatchResultDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBatchResultDetailRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeBatchResultDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
