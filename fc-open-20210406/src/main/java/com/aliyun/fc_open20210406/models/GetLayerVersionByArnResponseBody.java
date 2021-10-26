// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetLayerVersionByArnResponseBody extends TeaModel {
    @NameInMap("acl")
    public Integer acl;

    @NameInMap("arn")
    public String arn;

    @NameInMap("code")
    public OutputCodeLocation code;

    @NameInMap("codeChecksum")
    public String codeChecksum;

    @NameInMap("codesize")
    public Long codesize;

    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("layerName")
    public String layerName;

    @NameInMap("version")
    public Integer version;

    public static GetLayerVersionByArnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLayerVersionByArnResponseBody self = new GetLayerVersionByArnResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLayerVersionByArnResponseBody setAcl(Integer acl) {
        this.acl = acl;
        return this;
    }
    public Integer getAcl() {
        return this.acl;
    }

    public GetLayerVersionByArnResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public GetLayerVersionByArnResponseBody setCode(OutputCodeLocation code) {
        this.code = code;
        return this;
    }
    public OutputCodeLocation getCode() {
        return this.code;
    }

    public GetLayerVersionByArnResponseBody setCodeChecksum(String codeChecksum) {
        this.codeChecksum = codeChecksum;
        return this;
    }
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    public GetLayerVersionByArnResponseBody setCodesize(Long codesize) {
        this.codesize = codesize;
        return this;
    }
    public Long getCodesize() {
        return this.codesize;
    }

    public GetLayerVersionByArnResponseBody setCompatibleRuntime(java.util.List<String> compatibleRuntime) {
        this.compatibleRuntime = compatibleRuntime;
        return this;
    }
    public java.util.List<String> getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    public GetLayerVersionByArnResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetLayerVersionByArnResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetLayerVersionByArnResponseBody setLayerName(String layerName) {
        this.layerName = layerName;
        return this;
    }
    public String getLayerName() {
        return this.layerName;
    }

    public GetLayerVersionByArnResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
