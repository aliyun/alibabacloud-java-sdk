// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineRunResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 流水线运行实例
    @NameInMap("pipelineRun")
    public GetPipelineRunResponseBodyPipelineRun pipelineRun;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    // 错误码
    @NameInMap("errorCode")
    public Boolean errorCode;

    public static GetPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunResponseBody self = new GetPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetPipelineRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPipelineRunResponseBody setErrorCode(Boolean errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Boolean getErrorCode() {
        return this.errorCode;
    }

    public static class GetPipelineRunResponseBodyPipelineRunSourcesData extends TeaModel {
        // 分支
        @NameInMap("branch")
        public String branch;

        // 提交信息 json数据
        @NameInMap("commint")
        public String commint;

        // 代码库地址
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
        // 代码源唯一标识
        @NameInMap("sign")
        public String sign;

        // 代码库类型
        @NameInMap("type")
        public String type;

        // 代码源信息
        @NameInMap("data")
        public GetPipelineRunResponseBodyPipelineRunSourcesData data;

        public static GetPipelineRunResponseBodyPipelineRunSources build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRunSources self = new GetPipelineRunResponseBodyPipelineRunSources();
            return TeaModel.build(map, self);
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

        public GetPipelineRunResponseBodyPipelineRunSources setData(GetPipelineRunResponseBodyPipelineRunSourcesData data) {
            this.data = data;
            return this;
        }
        public GetPipelineRunResponseBodyPipelineRunSourcesData getData() {
            return this.data;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs extends TeaModel {
        // 结束时间
        @NameInMap("endTime")
        public Long endTime;

        // 任务Id
        @NameInMap("id")
        public Long id;

        // 任务名称
        @NameInMap("name")
        public String name;

        // 触发参数
        @NameInMap("params")
        public String params;

        // 状态
        @NameInMap("status")
        public String status;

        // 开始时间
        @NameInMap("startTime")
        public Long startTime;

        public static GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs self = new GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs();
            return TeaModel.build(map, self);
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

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineRunStagesStageInfo extends TeaModel {
        // 结束时间
        @NameInMap("endTime")
        public Long endTime;

        // 开始时间
        @NameInMap("startTime")
        public Long startTime;

        // 阶段名称
        @NameInMap("name")
        public String name;

        // 状态
        @NameInMap("status")
        public String status;

        // 任务
        @NameInMap("jobs")
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs> jobs;

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

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineRunResponseBodyPipelineRunStagesStageInfo setJobs(java.util.List<GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStagesStageInfoJobs> getJobs() {
            return this.jobs;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineRunStages extends TeaModel {
        // 阶段名称
        @NameInMap("name")
        public String name;

        // 阶段详情
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
        // 创建者阿里云账号id
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        // 创建时间
        @NameInMap("createTime")
        public Long createTime;

        // 更新时间
        @NameInMap("updateTime")
        public Long updateTime;

        // 更新人阿里云账号id
        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        // 流水线Id
        @NameInMap("pipelineId")
        public Long pipelineId;

        // 流水线运行实例id
        @NameInMap("pipelineRunId")
        public Long pipelineRunId;

        // 状态 FAIL 运行失败 SUCCESS 运行成功 RUNNING 运行中
        @NameInMap("status")
        public String status;

        // 触发模式 1人工触发 2定时触发 3代码提交触发
        @NameInMap("triggerMode")
        public Integer triggerMode;

        // 阶段拓扑信息
        @NameInMap("stageGroup")
        public java.util.List<java.util.List<String>> stageGroup;

        // 代码源
        @NameInMap("sources")
        public java.util.List<GetPipelineRunResponseBodyPipelineRunSources> sources;

        // 阶段信息
        @NameInMap("stages")
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStages> stages;

        public static GetPipelineRunResponseBodyPipelineRun build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineRun self = new GetPipelineRunResponseBodyPipelineRun();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineRun setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public GetPipelineRunResponseBodyPipelineRun setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPipelineRunResponseBodyPipelineRun setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
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

        public GetPipelineRunResponseBodyPipelineRun setStageGroup(java.util.List<java.util.List<String>> stageGroup) {
            this.stageGroup = stageGroup;
            return this;
        }
        public java.util.List<java.util.List<String>> getStageGroup() {
            return this.stageGroup;
        }

        public GetPipelineRunResponseBodyPipelineRun setSources(java.util.List<GetPipelineRunResponseBodyPipelineRunSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<GetPipelineRunResponseBodyPipelineRunSources> getSources() {
            return this.sources;
        }

        public GetPipelineRunResponseBodyPipelineRun setStages(java.util.List<GetPipelineRunResponseBodyPipelineRunStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetPipelineRunResponseBodyPipelineRunStages> getStages() {
            return this.stages;
        }

    }

}
