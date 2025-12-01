// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeJobErrorCodeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language of the error message. Valid values:</p>
     * <ul>
     * <li><strong>en</strong> (default): English</li>
     * <li><strong>cn</strong>: Chinese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the full backup or restore task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeJobErrorCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobErrorCodeRequest self = new DescribeJobErrorCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobErrorCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public DescribeJobErrorCodeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
