// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultCountRequest extends TeaModel {
    /**
     * <p>The type of the batch operation. Valid values:</p>
     * <ul>
     * <li><strong>DOMAIN_ADD</strong>: adds domain names in batches.</li>
     * <li><strong>DOMAIN_DEL</strong>: deletes domain names in batches.</li>
     * <li><strong>RR_ADD</strong>: adds Domain Name System (DNS) records in batches.</li>
     * <li><strong>RR_DEL</strong>: deletes DNS records in batches.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, filtering is not required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DOMAIN_ADD</p>
     */
    @NameInMap("BatchType")
    public String batchType;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
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
     * <p> If you specify TaskId, the execution result of the specified task is returned. If you do not specify TaskId, the execution result of the last task is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
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
