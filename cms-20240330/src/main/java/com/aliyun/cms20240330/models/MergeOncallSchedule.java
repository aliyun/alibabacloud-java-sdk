// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeOncallSchedule extends TeaModel {
    /**
     * <p>Details of the on-call schedule.</p>
     */
    @NameInMap("detail")
    public java.util.Map<String, ?> detail;

    /**
     * <p>The UTC time when the on-call schedule was created.</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The UTC time when the on-call schedule was last modified.</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The unique identifier of the on-call schedule.</p>
     */
    @NameInMap("identifier")
    public String identifier;

    /**
     * <p>The name of the on-call schedule.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The creation source of the on-call schedule.</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The workspace that the on-call schedule belongs to.</p>
     */
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
