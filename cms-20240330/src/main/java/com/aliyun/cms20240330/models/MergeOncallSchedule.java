// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeOncallSchedule extends TeaModel {
    /**
     * <p>The extension details.</p>
     */
    @NameInMap("detail")
    public java.util.Map<String, ?> detail;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The last modified time.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The unique identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("identifier")
    public String identifier;

    /**
     * <p>The schedule name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The source.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
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
