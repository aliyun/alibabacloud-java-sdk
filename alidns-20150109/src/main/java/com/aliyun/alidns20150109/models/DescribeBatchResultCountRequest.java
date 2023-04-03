// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultCountRequest extends TeaModel {
    /**
     * <p>The type of the batch operation. Valid values:</p>
     * <br>
     * <p>*   **DOMAIN_ADD**: adds domain names in batches.</p>
     * <p>*   **DOMAIN_DEL**: deletes domain names in batches.</p>
     * <p>*   **RR_ADD**: adds DNS records in batches.</p>
     * <p>*   **RR_DEL**: deletes DNS records in batches.</p>
     */
    @NameInMap("BatchType")
    public String batchType;

    /**
     * <p>The language type.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the task.</p>
     * <br>
     * <p>If you specify TaskId, the execution result of the specified task is returned. If you do not specify TaskId, the execution result of the last task is returned.</p>
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
