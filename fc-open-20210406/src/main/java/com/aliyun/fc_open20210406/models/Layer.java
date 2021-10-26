// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class Layer extends TeaModel {
    // 层访问类型
    @NameInMap("acl")
    public Integer acl;

    // arn
    @NameInMap("arn")
    public String arn;

    // 层代码
    @NameInMap("code")
    public LayerCode code;

    // 层Checksum
    @NameInMap("codeChecksum")
    public String codeChecksum;

    // 层代码大小
    @NameInMap("codeSize")
    public Long codeSize;

    // compatibleRuntime
    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    // 层创建时间
    @NameInMap("createTime")
    public String createTime;

    // 层描述
    @NameInMap("description")
    public String description;

    // 层名称
    @NameInMap("layerName")
    public String layerName;

    // 层版本
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

    public Layer setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
