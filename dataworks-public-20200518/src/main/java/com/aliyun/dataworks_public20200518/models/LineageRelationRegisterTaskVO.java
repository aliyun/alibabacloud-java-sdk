// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class LineageRelationRegisterTaskVO extends TeaModel {
    @NameInMap("Attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <strong>example:</strong>
     * <p>1684327487964</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("InputEntities")
    public java.util.List<LineageEntityVO> inputEntities;

    /**
     * <strong>example:</strong>
     * <p>pai-task name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OutputEntities")
    public java.util.List<LineageEntityVO> outputEntities;

    /**
     * <strong>example:</strong>
     * <p>pai_dlcjob-task.12304</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    public static LineageRelationRegisterTaskVO build(java.util.Map<String, ?> map) throws Exception {
        LineageRelationRegisterTaskVO self = new LineageRelationRegisterTaskVO();
        return TeaModel.build(map, self);
    }

    public LineageRelationRegisterTaskVO setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public LineageRelationRegisterTaskVO setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public LineageRelationRegisterTaskVO setInputEntities(java.util.List<LineageEntityVO> inputEntities) {
        this.inputEntities = inputEntities;
        return this;
    }
    public java.util.List<LineageEntityVO> getInputEntities() {
        return this.inputEntities;
    }

    public LineageRelationRegisterTaskVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LineageRelationRegisterTaskVO setOutputEntities(java.util.List<LineageEntityVO> outputEntities) {
        this.outputEntities = outputEntities;
        return this;
    }
    public java.util.List<LineageEntityVO> getOutputEntities() {
        return this.outputEntities;
    }

    public LineageRelationRegisterTaskVO setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

}
