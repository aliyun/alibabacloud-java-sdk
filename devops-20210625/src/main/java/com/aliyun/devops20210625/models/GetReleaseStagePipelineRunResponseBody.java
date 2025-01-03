// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetReleaseStagePipelineRunResponseBody extends TeaModel {
    @NameInMap("pipelineRun")
    public GetReleaseStagePipelineRunResponseBodyPipelineRun pipelineRun;

    public static GetReleaseStagePipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReleaseStagePipelineRunResponseBody self = new GetReleaseStagePipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReleaseStagePipelineRunResponseBody setPipelineRun(GetReleaseStagePipelineRunResponseBodyPipelineRun pipelineRun) {
        this.pipelineRun = pipelineRun;
        return this;
    }
    public GetReleaseStagePipelineRunResponseBodyPipelineRun getPipelineRun() {
        return this.pipelineRun;
    }

    public static class GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData extends TeaModel {
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
        @NameInMap("commit")
        public String commit;

        /**
         * <strong>example:</strong>
         * <p><a href="http://codeup.aliyun.com/a.git">http://codeup.aliyun.com/a.git</a></p>
         */
        @NameInMap("repo")
        public String repo;

        public static GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData build(java.util.Map<String, ?> map) throws Exception {
            GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData self = new GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData();
            return TeaModel.build(map, self);
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData setCommit(String commit) {
            this.commit = commit;
            return this;
        }
        public String getCommit() {
            return this.commit;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

    }

    public static class GetReleaseStagePipelineRunResponseBodyPipelineRunSources extends TeaModel {
        @NameInMap("data")
        public GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData data;

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

        public static GetReleaseStagePipelineRunResponseBodyPipelineRunSources build(java.util.Map<String, ?> map) throws Exception {
            GetReleaseStagePipelineRunResponseBodyPipelineRunSources self = new GetReleaseStagePipelineRunResponseBodyPipelineRunSources();
            return TeaModel.build(map, self);
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunSources setData(GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData data) {
            this.data = data;
            return this;
        }
        public GetReleaseStagePipelineRunResponseBodyPipelineRunSourcesData getData() {
            return this.data;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunSources setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions extends TeaModel {
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
        public Object params;

        /**
         * <strong>example:</strong>
         * <p>PassPipelineValidate</p>
         */
        @NameInMap("type")
        public String type;

        public static GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions build(java.util.Map<String, ?> map) throws Exception {
            GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions self = new GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions();
            return TeaModel.build(map, self);
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions setDisable(Boolean disable) {
            this.disable = disable;
            return this;
        }
        public Boolean getDisable() {
            return this.disable;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs extends TeaModel {
        @NameInMap("actions")
        public java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions> actions;

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

        public static GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs build(java.util.Map<String, ?> map) throws Exception {
            GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs self = new GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs();
            return TeaModel.build(map, self);
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs setActions(java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobsActions> getActions() {
            return this.actions;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("jobs")
        public java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs> jobs;

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

        public static GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo self = new GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo();
            return TeaModel.build(map, self);
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo setJobs(java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfoJobs> getJobs() {
            return this.jobs;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetReleaseStagePipelineRunResponseBodyPipelineRunStages extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("stageInfo")
        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo stageInfo;

        public static GetReleaseStagePipelineRunResponseBodyPipelineRunStages build(java.util.Map<String, ?> map) throws Exception {
            GetReleaseStagePipelineRunResponseBodyPipelineRunStages self = new GetReleaseStagePipelineRunResponseBodyPipelineRunStages();
            return TeaModel.build(map, self);
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRunStages setStageInfo(GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo stageInfo) {
            this.stageInfo = stageInfo;
            return this;
        }
        public GetReleaseStagePipelineRunResponseBodyPipelineRunStagesStageInfo getStageInfo() {
            return this.stageInfo;
        }

    }

    public static class GetReleaseStagePipelineRunResponseBodyPipelineRun extends TeaModel {
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
        public java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunSources> sources;

        @NameInMap("stageGroup")
        public java.util.List<java.util.List<String>> stageGroup;

        @NameInMap("stages")
        public java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunStages> stages;

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

        public static GetReleaseStagePipelineRunResponseBodyPipelineRun build(java.util.Map<String, ?> map) throws Exception {
            GetReleaseStagePipelineRunResponseBodyPipelineRun self = new GetReleaseStagePipelineRunResponseBodyPipelineRun();
            return TeaModel.build(map, self);
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setPipelineRunId(Long pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setSources(java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunSources> getSources() {
            return this.sources;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setStageGroup(java.util.List<java.util.List<String>> stageGroup) {
            this.stageGroup = stageGroup;
            return this;
        }
        public java.util.List<java.util.List<String>> getStageGroup() {
            return this.stageGroup;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setStages(java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetReleaseStagePipelineRunResponseBodyPipelineRunStages> getStages() {
            return this.stages;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setTriggerMode(Integer triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public Integer getTriggerMode() {
            return this.triggerMode;
        }

        public GetReleaseStagePipelineRunResponseBodyPipelineRun setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
