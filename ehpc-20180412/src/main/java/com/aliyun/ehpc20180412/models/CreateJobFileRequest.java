// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobFileRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Content")
    public String content;

    @NameInMap("RunasUser")
    public String runasUser;

    @NameInMap("RunasUserPassword")
    public String runasUserPassword;

    @NameInMap("TargetFile")
    public String targetFile;

    public static CreateJobFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobFileRequest self = new CreateJobFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobFileRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateJobFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateJobFileRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public CreateJobFileRequest setRunasUserPassword(String runasUserPassword) {
        this.runasUserPassword = runasUserPassword;
        return this;
    }
    public String getRunasUserPassword() {
        return this.runasUserPassword;
    }

    public CreateJobFileRequest setTargetFile(String targetFile) {
        this.targetFile = targetFile;
        return this;
    }
    public String getTargetFile() {
        return this.targetFile;
    }

}
