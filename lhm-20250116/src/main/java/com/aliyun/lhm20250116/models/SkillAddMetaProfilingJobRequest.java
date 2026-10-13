// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SkillAddMetaProfilingJobRequest extends TeaModel {
    /**
     * <p>The component ID, which is the primary key identifier of the data source component.</p>
     * 
     * <strong>example:</strong>
     * <p>2001</p>
     */
    @NameInMap("componentId")
    public Long componentId;

    /**
     * <p>The description of the profiling task.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily full metadata profiling task</p>
     */
    @NameInMap("jobDesc")
    public String jobDesc;

    /**
     * <p>The profiling task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100256</p>
     */
    @NameInMap("jobId")
    public Long jobId;

    /**
     * <p>The name of the profiling task.</p>
     * 
     * <strong>example:</strong>
     * <p>profiling_daily</p>
     */
    @NameInMap("jobName")
    public String jobName;

    /**
     * <p>The list of metadata object IDs to be profiled or operated on.</p>
     */
    @NameInMap("metaIds")
    public java.util.List<String> metaIds;

    /**
     * <p>The profiling plugin ID, which specifies the plugin used to perform the profiling.</p>
     * 
     * <strong>example:</strong>
     * <p>profiling-plugin-001</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    /**
     * <p>Specifies whether to enable data profiling.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("profilingFlag")
    public Integer profilingFlag;

    /**
     * <p>The profiling permission configuration identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("profilingPermission")
    public Integer profilingPermission;

    /**
     * <p>The profiling rule configuration content.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("profilingRule")
    public String profilingRule;

    /**
     * <p>The list of schemas to be profiled.</p>
     */
    @NameInMap("profilingSchemaList")
    public java.util.List<String> profilingSchemaList;

    /**
     * <p>The profiling type identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("profilingType")
    public Integer profilingType;

    public static SkillAddMetaProfilingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SkillAddMetaProfilingJobRequest self = new SkillAddMetaProfilingJobRequest();
        return TeaModel.build(map, self);
    }

    public SkillAddMetaProfilingJobRequest setComponentId(Long componentId) {
        this.componentId = componentId;
        return this;
    }
    public Long getComponentId() {
        return this.componentId;
    }

    public SkillAddMetaProfilingJobRequest setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
        return this;
    }
    public String getJobDesc() {
        return this.jobDesc;
    }

    public SkillAddMetaProfilingJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public SkillAddMetaProfilingJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SkillAddMetaProfilingJobRequest setMetaIds(java.util.List<String> metaIds) {
        this.metaIds = metaIds;
        return this;
    }
    public java.util.List<String> getMetaIds() {
        return this.metaIds;
    }

    public SkillAddMetaProfilingJobRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public SkillAddMetaProfilingJobRequest setProfilingFlag(Integer profilingFlag) {
        this.profilingFlag = profilingFlag;
        return this;
    }
    public Integer getProfilingFlag() {
        return this.profilingFlag;
    }

    public SkillAddMetaProfilingJobRequest setProfilingPermission(Integer profilingPermission) {
        this.profilingPermission = profilingPermission;
        return this;
    }
    public Integer getProfilingPermission() {
        return this.profilingPermission;
    }

    public SkillAddMetaProfilingJobRequest setProfilingRule(String profilingRule) {
        this.profilingRule = profilingRule;
        return this;
    }
    public String getProfilingRule() {
        return this.profilingRule;
    }

    public SkillAddMetaProfilingJobRequest setProfilingSchemaList(java.util.List<String> profilingSchemaList) {
        this.profilingSchemaList = profilingSchemaList;
        return this;
    }
    public java.util.List<String> getProfilingSchemaList() {
        return this.profilingSchemaList;
    }

    public SkillAddMetaProfilingJobRequest setProfilingType(Integer profilingType) {
        this.profilingType = profilingType;
        return this;
    }
    public Integer getProfilingType() {
        return this.profilingType;
    }

}
