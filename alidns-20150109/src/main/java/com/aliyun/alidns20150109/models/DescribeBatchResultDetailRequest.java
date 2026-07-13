// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultDetailRequest extends TeaModel {
    /**
     * <p>The type of the batch operation. Valid values:</p>
     * <ul>
     * <li><p><strong>DOMAIN_ADD</strong>: Add domain names in batches.</p>
     * </li>
     * <li><p><strong>DOMAIN_DEL</strong>: Delete domain names in batches.</p>
     * </li>
     * <li><p><strong>RR_ADD</strong>: Add DNS records in batches.</p>
     * </li>
     * <li><p><strong>RR_DEL</strong>: Delete DNS records in batches.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you leave this parameter empty, the results are not filtered by operation type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DOMAIN_ADD</p>
     */
    @NameInMap("BatchType")
    public String batchType;

    /**
     * <p>The language of the request and response. The default value is <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The current page number. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the task. If you do not specify this parameter, the details of tasks in all states are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8*******</p>
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
