// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7f217ae0-61f5-42e2-a1c3-42bad0124****</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CancelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelTaskRequest self = new CancelTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CancelTaskRequest setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

    public CancelTaskRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
