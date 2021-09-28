// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotImportJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistIds")
    public java.util.List<String> nonExistIds;

    @NameInMap("FpShotImportJobList")
    public java.util.List<ListFpShotImportJobResponseBodyFpShotImportJobList> fpShotImportJobList;

    public static ListFpShotImportJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotImportJobResponseBody self = new ListFpShotImportJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFpShotImportJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFpShotImportJobResponseBody setNonExistIds(java.util.List<String> nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public java.util.List<String> getNonExistIds() {
        return this.nonExistIds;
    }

    public ListFpShotImportJobResponseBody setFpShotImportJobList(java.util.List<ListFpShotImportJobResponseBodyFpShotImportJobList> fpShotImportJobList) {
        this.fpShotImportJobList = fpShotImportJobList;
        return this;
    }
    public java.util.List<ListFpShotImportJobResponseBodyFpShotImportJobList> getFpShotImportJobList() {
        return this.fpShotImportJobList;
    }

    public static class ListFpShotImportJobResponseBodyFpShotImportJobList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("FpDBId")
        public String fpDBId;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("FpImportConfig")
        public String fpImportConfig;

        @NameInMap("Status")
        public String status;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Input")
        public String input;

        public static ListFpShotImportJobResponseBodyFpShotImportJobList build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotImportJobResponseBodyFpShotImportJobList self = new ListFpShotImportJobResponseBodyFpShotImportJobList();
            return TeaModel.build(map, self);
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setFpImportConfig(String fpImportConfig) {
            this.fpImportConfig = fpImportConfig;
            return this;
        }
        public String getFpImportConfig() {
            return this.fpImportConfig;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
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

        public ListFpShotImportJobResponseBodyFpShotImportJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public ListFpShotImportJobResponseBodyFpShotImportJobList setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

    }

}
