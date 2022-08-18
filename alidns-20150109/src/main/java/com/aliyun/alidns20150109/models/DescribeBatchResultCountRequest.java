// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultCountRequest extends TeaModel {
    @NameInMap("BatchType")
    public String batchType;

    @NameInMap("Lang")
    public String lang;

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
