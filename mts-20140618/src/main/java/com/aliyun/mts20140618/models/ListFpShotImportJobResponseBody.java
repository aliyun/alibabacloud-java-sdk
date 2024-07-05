// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotImportJobResponseBody extends TeaModel {
    /**
     * <p>The jobs of importing text files to a text fingerprint library.</p>
     */
    @NameInMap("FpShotImportJobList")
    public java.util.List<ListFpShotImportJobResponseBodyFpShotImportJobList> fpShotImportJobList;

    /**
     * <p>The job IDs that do not exist. This parameter is not returned if all specified job IDs exist.</p>
     */
    @NameInMap("NonExistIds")
    public java.util.List<String> nonExistIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFpShotImportJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotImportJobResponseBody self = new ListFpShotImportJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFpShotImportJobResponseBody setFpShotImportJobList(java.util.List<ListFpShotImportJobResponseBodyFpShotImportJobList> fpShotImportJobList) {
        this.fpShotImportJobList = fpShotImportJobList;
        return this;
    }
    public java.util.List<ListFpShotImportJobResponseBodyFpShotImportJobList> getFpShotImportJobList() {
        return this.fpShotImportJobList;
    }

    public ListFpShotImportJobResponseBody setNonExistIds(java.util.List<String> nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public java.util.List<String> getNonExistIds() {
        return this.nonExistIds;
    }

    public ListFpShotImportJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFpShotImportJobResponseBodyFpShotImportJobList extends TeaModel {
        /**
         * <p>The error code returned when the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-30T00:33:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the job was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-30T00:34:02Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the text fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>2288c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("FpDBId")
        public String fpDBId;

        /**
         * <p>The import configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("FpImportConfig")
        public String fpImportConfig;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25bacf2824614bcf9273dc0744db****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The input file.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Bucket\&quot;:\&quot;mts-example****\&quot;,\&quot;Location\&quot;:\&quot;oss-cn-shanghai\&quot;,\&quot;Object\&quot;:\&quot;test-0828/video/test.mp4\&quot;}</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The error message returned when the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the job is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>ebb51ee30f0b49aba959823fa991****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The processing information of the job.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://testbucket.oss-cn-shanghai.aliyuncs.com/932ajjw***32ssoj_importResult.txt">http://testbucket.oss-cn-shanghai.aliyuncs.com/932ajjw***32ssoj_importResult.txt</a></p>
         */
        @NameInMap("ProcessMessage")
        public String processMessage;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li>Processing: The job is in progress.</li>
         * <li>Fail: The job fails.</li>
         * <li>Success: The job is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>001</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static ListFpShotImportJobResponseBodyFpShotImportJobList build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotImportJobResponseBodyFpShotImportJobList self = new ListFpShotImportJobResponseBodyFpShotImportJobList();
            return TeaModel.build(map, self);
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setFpImportConfig(String fpImportConfig) {
            this.fpImportConfig = fpImportConfig;
            return this;
        }
        public String getFpImportConfig() {
            return this.fpImportConfig;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setProcessMessage(String processMessage) {
            this.processMessage = processMessage;
            return this;
        }
        public String getProcessMessage() {
            return this.processMessage;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
