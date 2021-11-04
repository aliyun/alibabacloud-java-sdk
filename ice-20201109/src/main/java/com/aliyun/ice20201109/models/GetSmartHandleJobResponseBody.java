// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSmartHandleJobResponseBody extends TeaModel {
    @NameInMap("FEExtend")
    public String FEExtend;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Output")
    public String output;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartJobInfo")
    public GetSmartHandleJobResponseBodySmartJobInfo smartJobInfo;

    @NameInMap("State")
    public String state;

    @NameInMap("UserData")
    public String userData;

    public static GetSmartHandleJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmartHandleJobResponseBody self = new GetSmartHandleJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmartHandleJobResponseBody setFEExtend(String FEExtend) {
        this.FEExtend = FEExtend;
        return this;
    }
    public String getFEExtend() {
        return this.FEExtend;
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
        @NameInMap("InputFile")
        public String inputFile;

        @NameInMap("JobParameters")
        public String jobParameters;

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

        public GetSmartHandleJobResponseBodySmartJobInfoInputConfig setJobParameters(String jobParameters) {
            this.jobParameters = jobParameters;
            return this;
        }
        public String getJobParameters() {
            return this.jobParameters;
        }

    }

    public static class GetSmartHandleJobResponseBodySmartJobInfoOutputConfig extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EditingConfig")
        public String editingConfig;

        @NameInMap("InputConfig")
        public GetSmartHandleJobResponseBodySmartJobInfoInputConfig inputConfig;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OutputConfig")
        public GetSmartHandleJobResponseBodySmartJobInfoOutputConfig outputConfig;

        @NameInMap("Title")
        public String title;

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

        public GetSmartHandleJobResponseBodySmartJobInfo setEditingConfig(String editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public String getEditingConfig() {
            return this.editingConfig;
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
