// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("pipelineRun")
    public GetPipelineRunResponseBodyPipelineRun pipelineRun;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunResponseBody self = new GetPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineRunResponseBody setPipelineRun(GetPipelineRunResponseBodyPipelineRun pipelineRun) {
        this.pipelineRun = pipelineRun;
        return this;
    }
    public GetPipelineRunResponseBodyPipelineRun getPipelineRun() {
        return this.pipelineRun;
    }

    public GetPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPipelineRunResponseBodyPipelineRunSourcesData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("branch")
        public String branch;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("commint")
        public String commint;

        /**
         * <strong>example:</strong>
         * <p><a href="http://codeup.aliyun.com/a.git">http://codeup.aliyun.com/a.git</a></p>
         */
        @NameInMap("repo")
        public String repo;

        public static GetPipelineRunResponseBodyPipelineRunSourcesData build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRunSourcesData self = new GetPipelineRunResponseBodyPipelineRunSourcesData();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineRunSourcesData setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetPipelineRunResponseBodyPipelineRunSourcesData setCommint(String commint) {
            this.commint = commint;
            return this;
        }
        public String getCommint() {
            return this.commint;
        }

        public GetPipelineRunResponseBodyPipelineRunSourcesData setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineRunSources extends TeaModel {
        @NameInMap("data")
        public GetPipelineRunResponseBodyPipelineRunSourcesData data;

        /**
         * <strong>example:</strong>
         * <p>assaaaaaasasasa</p>
         */
        @NameInMap("sign")
        public String sign;

        /**
         * <strong>example:</strong>
         * <p>Codeup</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineRunResponseBodyPipelineRunSources build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRunSources self = new GetPipelineRunResponseBodyPipelineRunSources();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineRunSources setData(GetPipelineRunResponseBodyPipelineRunSourcesData data) {
            this.data = data;
            return this;
        }
        public GetPipelineRunResponseBodyPipelineRunSourcesData getData() {
            return this.data;
        }

        public GetPipelineRunResponseBodyPipelineRunSources setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetPipelineRunResponseBodyPipelineRunSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("disable")
        public Boolean disable;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("params")
        public java.util.Map<String, ?> params;

        /**
         * <strong>example:</strong>
         * <p>PassPipelineValidate</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions self = new GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions setDisable(Boolean disable) {
            this.disable = disable;
            return this;
        }
        public Boolean getDisable() {
            return this.disable;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs extends TeaModel {
        @NameInMap("actions")
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions> actions;

        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>21212</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>java构建</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("params")
        public String params;

        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs self = new GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs setActions(java.util.List<GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions> getActions() {
            return this.actions;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineRunStagesStageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("jobs")
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs> jobs;

        /**
         * <strong>example:</strong>
         * <p>Java构建</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static GetPipelineRunResponseBodyPipelineRunStagesStageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRunStagesStageInfo self = new GetPipelineRunResponseBodyPipelineRunStagesStageInfo();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo setJobs(java.util.List<GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs> getJobs() {
            return this.jobs;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineRunStages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Java构建</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("stageInfo")
        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo stageInfo;

        public static GetPipelineRunResponseBodyPipelineRunStages build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRunStages self = new GetPipelineRunResponseBodyPipelineRunStages();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineRunStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineRunResponseBodyPipelineRunStages setStageInfo(GetPipelineRunResponseBodyPipelineRunStagesStageInfo stageInfo) {
            this.stageInfo = stageInfo;
            return this;
        }
        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo getStageInfo() {
            return this.stageInfo;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineRun extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        /**
         * <strong>example:</strong>
         * <p>11111111111</p>
         */
        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("pipelineId")
        public Long pipelineId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pipelineRunId")
        public Long pipelineRunId;

        @NameInMap("sources")
        public java.util.List<GetPipelineRunResponseBodyPipelineRunSources> sources;

        @NameInMap("stageGroup")
        public java.util.List<java.util.List<String>> stageGroup;

        @NameInMap("stages")
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStages> stages;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("triggerMode")
        public Integer triggerMode;

        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static GetPipelineRunResponseBodyPipelineRun build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRun self = new GetPipelineRunResponseBodyPipelineRun();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineRun setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPipelineRunResponseBodyPipelineRun setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public GetPipelineRunResponseBodyPipelineRun setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public GetPipelineRunResponseBodyPipelineRun setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public GetPipelineRunResponseBodyPipelineRun setPipelineRunId(Long pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        public GetPipelineRunResponseBodyPipelineRun setSources(java.util.List<GetPipelineRunResponseBodyPipelineRunSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<GetPipelineRunResponseBodyPipelineRunSources> getSources() {
            return this.sources;
        }

        public GetPipelineRunResponseBodyPipelineRun setStageGroup(java.util.List<java.util.List<String>> stageGroup) {
            this.stageGroup = stageGroup;
            return this;
        }
        public java.util.List<java.util.List<String>> getStageGroup() {
            return this.stageGroup;
        }

        public GetPipelineRunResponseBodyPipelineRun setStages(java.util.List<GetPipelineRunResponseBodyPipelineRunStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStages> getStages() {
            return this.stages;
        }

        public GetPipelineRunResponseBodyPipelineRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineRunResponseBodyPipelineRun setTriggerMode(Integer triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public Integer getTriggerMode() {
            return this.triggerMode;
        }

        public GetPipelineRunResponseBodyPipelineRun setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
