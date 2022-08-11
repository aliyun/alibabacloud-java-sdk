// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class Layer extends TeaModel {
    @NameInMap("acl")
    public Integer acl;

    @NameInMap("arn")
    public String arn;

    @NameInMap("arnV2")
    public String arnV2;

    @NameInMap("code")
    public LayerCode code;

    @NameInMap("codeChecksum")
    public String codeChecksum;

    @NameInMap("codeSize")
    public Long codeSize;

    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("layerName")
    public String layerName;

    @NameInMap("license")
    public String license;

    @NameInMap("version")
    public Integer version;

    public static Layer build(java.util.Map<String, ?> map) throws Exception {
        Layer self = new Layer();
        return TeaModel.build(map, self);
    }

    public Layer setAcl(Integer acl) {
        this.acl = acl;
        return this;
    }
    public Integer getAcl() {
        return this.acl;
    }

    public Layer setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public Layer setArnV2(String arnV2) {
        this.arnV2 = arnV2;
        return this;
    }
    public String getArnV2() {
        return this.arnV2;
    }

    public Layer setCode(LayerCode code) {
        this.code = code;
        return this;
    }
    public LayerCode getCode() {
        return this.code;
    }

    public Layer setCodeChecksum(String codeChecksum) {
        this.codeChecksum = codeChecksum;
        return this;
    }
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    public Layer setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
        return this;
    }
    public Long getCodeSize() {
        return this.codeSize;
    }

    public Layer setCompatibleRuntime(java.util.List<String> compatibleRuntime) {
        this.compatibleRuntime = compatibleRuntime;
        return this;
    }
    public java.util.List<String> getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    public Layer setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Layer setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Layer setLayerName(String layerName) {
        this.layerName = layerName;
        return this;
    }
    public String getLayerName() {
        return this.layerName;
    }

    public Layer setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public Layer setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
