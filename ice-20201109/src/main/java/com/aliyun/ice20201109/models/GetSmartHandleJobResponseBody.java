// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSmartHandleJobResponseBody extends TeaModel {
    // 任务Id
    @NameInMap("JobId")
    public String jobId;

    // 任务结果
    @NameInMap("Output")
    public String output;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 智能任务信息
    @NameInMap("SmartJobInfo")
    public GetSmartHandleJobResponseBodySmartJobInfo smartJobInfo;

    // 任务状态
    @NameInMap("State")
    public String state;

    // 用户自定义信息
    @NameInMap("UserData")
    public String userData;

    public static GetSmartHandleJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmartHandleJobResponseBody self = new GetSmartHandleJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmartHandleJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetSmartHandleJobResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public GetSmartHandleJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmartHandleJobResponseBody setSmartJobInfo(GetSmartHandleJobResponseBodySmartJobInfo smartJobInfo) {
        this.smartJobInfo = smartJobInfo;
        return this;
    }
    public GetSmartHandleJobResponseBodySmartJobInfo getSmartJobInfo() {
        return this.smartJobInfo;
    }

    public GetSmartHandleJobResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetSmartHandleJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class GetSmartHandleJobResponseBodySmartJobInfoInputConfig extends TeaModel {
        // OSS地址 或 内容库素材ID
        @NameInMap("InputFile")
        public String inputFile;

        public static GetSmartHandleJobResponseBodySmartJobInfoInputConfig build(java.util.Map<String, ?> map) throws Exception {
            GetSmartHandleJobResponseBodySmartJobInfoInputConfig self = new GetSmartHandleJobResponseBodySmartJobInfoInputConfig();
            return TeaModel.build(map, self);
        }

        public GetSmartHandleJobResponseBodySmartJobInfoInputConfig setInputFile(String inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public String getInputFile() {
            return this.inputFile;
        }

    }

    public static class GetSmartHandleJobResponseBodySmartJobInfoOutputConfig extends TeaModel {
        // OSS Bucket
        @NameInMap("Bucket")
        public String bucket;

        // OSS Object
        @NameInMap("Object")
        public String object;

        public static GetSmartHandleJobResponseBodySmartJobInfoOutputConfig build(java.util.Map<String, ?> map) throws Exception {
            GetSmartHandleJobResponseBodySmartJobInfoOutputConfig self = new GetSmartHandleJobResponseBodySmartJobInfoOutputConfig();
            return TeaModel.build(map, self);
        }

        public GetSmartHandleJobResponseBodySmartJobInfoOutputConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetSmartHandleJobResponseBodySmartJobInfoOutputConfig setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetSmartHandleJobResponseBodySmartJobInfo extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 任务描述
        @NameInMap("Description")
        public String description;

        // 输入参数
        @NameInMap("InputConfig")
        public GetSmartHandleJobResponseBodySmartJobInfoInputConfig inputConfig;

        // 任务类型
        @NameInMap("JobType")
        public String jobType;

        // 修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 输出配置
        @NameInMap("OutputConfig")
        public GetSmartHandleJobResponseBodySmartJobInfoOutputConfig outputConfig;

        // 任务标题
        @NameInMap("Title")
        public String title;

        // userid
        @NameInMap("UserId")
        public String userId;

        public static GetSmartHandleJobResponseBodySmartJobInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSmartHandleJobResponseBodySmartJobInfo self = new GetSmartHandleJobResponseBodySmartJobInfo();
            return TeaModel.build(map, self);
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setInputConfig(GetSmartHandleJobResponseBodySmartJobInfoInputConfig inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public GetSmartHandleJobResponseBodySmartJobInfoInputConfig getInputConfig() {
            return this.inputConfig;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setOutputConfig(GetSmartHandleJobResponseBodySmartJobInfoOutputConfig outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public GetSmartHandleJobResponseBodySmartJobInfoOutputConfig getOutputConfig() {
            return this.outputConfig;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
