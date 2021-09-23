// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Binding extends TeaModel {
    // ProjectName
    @NameInMap("ProjectName")
    public String projectName;

    // DatasetName
    @NameInMap("DatasetName")
    public String datasetName;

    // URI
    @NameInMap("URI")
    public String URI;

    // State
    @NameInMap("State")
    public String state;

    // Phase
    @NameInMap("Phase")
    public String phase;

    // Detail
    @NameInMap("Detail")
    public String detail;

    // CreateTime
    @NameInMap("CreateTime")
    public String createTime;

    // UpdateTime
    @NameInMap("UpdateTime")
    public String updateTime;

    public static Binding build(java.util.Map<String, ?> map) throws Exception {
        Binding self = new Binding();
        return TeaModel.build(map, self);
    }

    public Binding setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Binding setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public Binding setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public Binding setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Binding setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public Binding setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public Binding setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Binding setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
