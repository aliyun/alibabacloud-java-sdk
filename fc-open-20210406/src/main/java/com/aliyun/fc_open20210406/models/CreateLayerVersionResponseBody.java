// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateLayerVersionResponseBody extends TeaModel {
    // The access mode of the layer.
    @NameInMap("acl")
    public Integer acl;

    // The name of the layer.
    @NameInMap("arn")
    public String arn;

    // The information about the layer code package.
    @NameInMap("code")
    public OutputCodeLocation code;

    // The checksum of the layer code package.
    @NameInMap("codeChecksum")
    public String codeChecksum;

    // The size of the layer code package. Unit: Byte.
    @NameInMap("codesize")
    public Long codesize;

    // The list of runtime environments that are supported by the layer.
    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    // The time when the layer version was created. The time follows the **yyyy-MM-ddTHH:mm:ssZ** format.
    @NameInMap("createTime")
    public String createTime;

    // The description of the layer version.
    @NameInMap("description")
    public String description;

    // The name of the layer.
    @NameInMap("layerName")
    public String layerName;

    // The version of the layer.
    @NameInMap("version")
    public Integer version;

    public static CreateLayerVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerVersionResponseBody self = new CreateLayerVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLayerVersionResponseBody setAcl(Integer acl) {
        this.acl = acl;
        return this;
    }
    public Integer getAcl() {
        return this.acl;
    }

    public CreateLayerVersionResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public CreateLayerVersionResponseBody setCode(OutputCodeLocation code) {
        this.code = code;
        return this;
    }
    public OutputCodeLocation getCode() {
        return this.code;
    }

    public CreateLayerVersionResponseBody setCodeChecksum(String codeChecksum) {
        this.codeChecksum = codeChecksum;
        return this;
    }
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    public CreateLayerVersionResponseBody setCodesize(Long codesize) {
        this.codesize = codesize;
        return this;
    }
    public Long getCodesize() {
        return this.codesize;
    }

    public CreateLayerVersionResponseBody setCompatibleRuntime(java.util.List<String> compatibleRuntime) {
        this.compatibleRuntime = compatibleRuntime;
        return this;
    }
    public java.util.List<String> getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    public CreateLayerVersionResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateLayerVersionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLayerVersionResponseBody setLayerName(String layerName) {
        this.layerName = layerName;
        return this;
    }
    public String getLayerName() {
        return this.layerName;
    }

    public CreateLayerVersionResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
