// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class Artifact extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bizId")
    public String bizId;

    @NameInMap("catagoryBizId")
    public String catagoryBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("creator")
    public Long creator;

    @NameInMap("credential")
    public Credential credential;

    @NameInMap("fullPath")
    public java.util.List<String> fullPath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("gmtCreated")
    public String gmtCreated;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("modifier")
    public Long modifier;

    @NameInMap("modifierName")
    public String modifierName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    public static Artifact build(java.util.Map<String, ?> map) throws Exception {
        Artifact self = new Artifact();
        return TeaModel.build(map, self);
    }

    public Artifact setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public Artifact setCatagoryBizId(String catagoryBizId) {
        this.catagoryBizId = catagoryBizId;
        return this;
    }
    public String getCatagoryBizId() {
        return this.catagoryBizId;
    }

    public Artifact setCreator(Long creator) {
        this.creator = creator;
        return this;
    }
    public Long getCreator() {
        return this.creator;
    }

    public Artifact setCredential(Credential credential) {
        this.credential = credential;
        return this;
    }
    public Credential getCredential() {
        return this.credential;
    }

    public Artifact setFullPath(java.util.List<String> fullPath) {
        this.fullPath = fullPath;
        return this;
    }
    public java.util.List<String> getFullPath() {
        return this.fullPath;
    }

    public Artifact setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public Artifact setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Artifact setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public Artifact setModifier(Long modifier) {
        this.modifier = modifier;
        return this;
    }
    public Long getModifier() {
        return this.modifier;
    }

    public Artifact setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public Artifact setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
