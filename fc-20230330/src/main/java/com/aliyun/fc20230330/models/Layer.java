// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Layer extends TeaModel {
    @NameInMap("acl")
    public String acl;

    @NameInMap("code")
    public OutputCodeLocation code;

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

    @NameInMap("layerVersionArn")
    public String layerVersionArn;

    @NameInMap("license")
    public String license;

    @NameInMap("version")
    public Integer version;

    public static Layer build(java.util.Map<String, ?> map) throws Exception {
        Layer self = new Layer();
        return TeaModel.build(map, self);
    }

    public Layer setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public Layer setCode(OutputCodeLocation code) {
        this.code = code;
        return this;
    }
    public OutputCodeLocation getCode() {
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

    public Layer setLayerVersionArn(String layerVersionArn) {
        this.layerVersionArn = layerVersionArn;
        return this;
    }
    public String getLayerVersionArn() {
        return this.layerVersionArn;
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
