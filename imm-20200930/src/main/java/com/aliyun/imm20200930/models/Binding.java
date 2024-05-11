// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Binding extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Phase")
    public String phase;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("State")
    public String state;

    @NameInMap("URI")
    public String URI;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static Binding build(java.util.Map<String, ?> map) throws Exception {
        Binding self = new Binding();
        return TeaModel.build(map, self);
    }

    public Binding setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Binding setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public Binding setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public Binding setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Binding setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public Binding setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Binding setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public Binding setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
