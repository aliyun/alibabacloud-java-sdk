// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobFileRequest extends TeaModel {
    /**
     * <p>Indicates whether to use an asynchronous link to submit job files.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The content of the job file. The content is encoded in Base64.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The user to which the job file belongs.</p>
     * <br>
     * <p>You can call the [ListUsers](~~188572~~) operation to query the users of the cluster.</p>
     */
    @NameInMap("RunasUser")
    public String runasUser;

    /**
     * <p>The user password.</p>
     */
    @NameInMap("RunasUserPassword")
    public String runasUserPassword;

    /**
     * <p>The name of the job file.</p>
     */
    @NameInMap("TargetFile")
    public String targetFile;

    public static CreateJobFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobFileRequest self = new CreateJobFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobFileRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
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
