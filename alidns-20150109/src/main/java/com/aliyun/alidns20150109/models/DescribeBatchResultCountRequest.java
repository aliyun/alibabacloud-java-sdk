// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultCountRequest extends TeaModel {
    /**
     * <p>The type of the batch operation. Valid values:</p>
     * <ul>
     * <li><p><strong>DOMAIN_ADD</strong>: Batch add domain names.</p>
     * </li>
     * <li><p><strong>DOMAIN_DEL</strong>: Batch delete domain names.</p>
     * </li>
     * <li><p><strong>RR_ADD</strong>: Batch add DNS records.</p>
     * </li>
     * <li><p><strong>RR_DEL</strong>: Batch delete DNS records.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you leave this parameter empty, no filter is applied.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DOMAIN_ADD</p>
     */
    @NameInMap("BatchType")
    public String batchType;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The task ID.</p>
     * <blockquote>
     * <p>If you specify a task ID, the results of that task are returned. If you leave this parameter empty, the results of the most recent task are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeBatchResultCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultCountRequest self = new DescribeBatchResultCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultCountRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public DescribeBatchResultCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeBatchResultCountRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
