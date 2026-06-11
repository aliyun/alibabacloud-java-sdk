// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateSkillFileCheckResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateSkillFileCheckResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSkillFileCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillFileCheckResponseBody self = new CreateSkillFileCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillFileCheckResponseBody setData(CreateSkillFileCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSkillFileCheckResponseBodyData getData() {
        return this.data;
    }

    public CreateSkillFileCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSkillFileCheckResponseBodyDataUploadResults extends TeaModel {
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("FileHash")
        public String fileHash;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("IdentifyId")
        public String identifyId;

        @NameInMap("Success")
        public Boolean success;

        public static CreateSkillFileCheckResponseBodyDataUploadResults build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillFileCheckResponseBodyDataUploadResults self = new CreateSkillFileCheckResponseBodyDataUploadResults();
            return TeaModel.build(map, self);
        }

        public CreateSkillFileCheckResponseBodyDataUploadResults setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public CreateSkillFileCheckResponseBodyDataUploadResults setFileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }
        public String getFileHash() {
            return this.fileHash;
        }

        public CreateSkillFileCheckResponseBodyDataUploadResults setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateSkillFileCheckResponseBodyDataUploadResults setIdentifyId(String identifyId) {
            this.identifyId = identifyId;
            return this;
        }
        public String getIdentifyId() {
            return this.identifyId;
        }

        public CreateSkillFileCheckResponseBodyDataUploadResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateSkillFileCheckResponseBodyData extends TeaModel {
        @NameInMap("FailCount")
        public Integer failCount;

        @NameInMap("RootTaskId")
        public String rootTaskId;

        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("UploadResults")
        public java.util.List<CreateSkillFileCheckResponseBodyDataUploadResults> uploadResults;

        public static CreateSkillFileCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillFileCheckResponseBodyData self = new CreateSkillFileCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSkillFileCheckResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public CreateSkillFileCheckResponseBodyData setRootTaskId(String rootTaskId) {
            this.rootTaskId = rootTaskId;
            return this;
        }
        public String getRootTaskId() {
            return this.rootTaskId;
        }

        public CreateSkillFileCheckResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public CreateSkillFileCheckResponseBodyData setUploadResults(java.util.List<CreateSkillFileCheckResponseBodyDataUploadResults> uploadResults) {
            this.uploadResults = uploadResults;
            return this;
        }
        public java.util.List<CreateSkillFileCheckResponseBodyDataUploadResults> getUploadResults() {
            return this.uploadResults;
        }

    }

}
