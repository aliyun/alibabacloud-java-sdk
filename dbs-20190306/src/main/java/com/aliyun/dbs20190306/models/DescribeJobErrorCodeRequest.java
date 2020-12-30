// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeJobErrorCodeRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeJobErrorCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobErrorCodeRequest self = new DescribeJobErrorCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobErrorCodeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeJobErrorCodeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeJobErrorCodeRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeJobErrorCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
