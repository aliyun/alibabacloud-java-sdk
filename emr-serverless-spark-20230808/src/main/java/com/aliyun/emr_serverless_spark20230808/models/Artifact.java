// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class Artifact extends TeaModel {
    @NameInMap("bizId")
    public String bizId;

    @NameInMap("creator")
    public Long creator;

    @NameInMap("credential")
    public Credential credential;

    @NameInMap("gmtCreated")
    public String gmtCreated;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("location")
    public String location;

    @NameInMap("modifier")
    public Long modifier;

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

    public Artifact setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
