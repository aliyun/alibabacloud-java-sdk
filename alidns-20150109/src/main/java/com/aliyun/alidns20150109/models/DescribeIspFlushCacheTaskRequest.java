// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeIspFlushCacheTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheTaskRequest self = new DescribeIspFlushCacheTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeIspFlushCacheTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
