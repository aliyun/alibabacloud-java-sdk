// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("Level")
    public Integer level;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssConfigName")
    public String ossConfigName;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OssInputPath")
    public String ossInputPath;

    @NameInMap("OssOutputPath")
    public String ossOutputPath;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("TaskDescription")
    public String taskDescription;

    @NameInMap("TaskName")
    public String taskName;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public CreateTaskRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateTaskRequest setOssConfigName(String ossConfigName) {
        this.ossConfigName = ossConfigName;
        return this;
    }
    public String getOssConfigName() {
        return this.ossConfigName;
    }

    public CreateTaskRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public CreateTaskRequest setOssInputPath(String ossInputPath) {
        this.ossInputPath = ossInputPath;
        return this;
    }
    public String getOssInputPath() {
        return this.ossInputPath;
    }

    public CreateTaskRequest setOssOutputPath(String ossOutputPath) {
        this.ossOutputPath = ossOutputPath;
        return this;
    }
    public String getOssOutputPath() {
        return this.ossOutputPath;
    }

    public CreateTaskRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTaskRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public CreateTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
