// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeOncallSchedule extends TeaModel {
    @NameInMap("detail")
    public java.util.Map<String, ?> detail;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("identifier")
    public String identifier;

    @NameInMap("name")
    public String name;

    @NameInMap("source")
    public String source;

    @NameInMap("workspace")
    public String workspace;

    public static MergeOncallSchedule build(java.util.Map<String, ?> map) throws Exception {
        MergeOncallSchedule self = new MergeOncallSchedule();
        return TeaModel.build(map, self);
    }

    public MergeOncallSchedule setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public MergeOncallSchedule setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MergeOncallSchedule setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MergeOncallSchedule setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public MergeOncallSchedule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MergeOncallSchedule setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public MergeOncallSchedule setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
