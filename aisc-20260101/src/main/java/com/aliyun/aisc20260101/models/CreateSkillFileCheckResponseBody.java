// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateSkillFileCheckResponseBody extends TeaModel {
    /**
     * <p>The task creation result.</p>
     */
    @NameInMap("Data")
    public CreateSkillFileCheckResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9FDE3D6F-26BD-5937-B0E5-8F47962B****</p>
     */
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
        /**
         * <p>The error message returned when the file fails to be uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>Network error.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The SHA256 value of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>514f44ebed1d0c1df5e16a116080b64b</p>
         */
        @NameInMap("FileHash")
        public String fileHash;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test-file</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The unique ID of the uploaded file. You can use this ID to query the task result.</p>
         * 
         * <strong>example:</strong>
         * <p>1824jcadg01bsl10b</p>
         */
        @NameInMap("IdentifyId")
        public String identifyId;

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The number of files that failed to be uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The ID of the root task returned after the task is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>c6e7fa8a77df6e182ac3fcf1478ab83a</p>
         */
        @NameInMap("RootTaskId")
        public String rootTaskId;

        /**
         * <p>The number of files that are uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The upload results.</p>
         */
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
