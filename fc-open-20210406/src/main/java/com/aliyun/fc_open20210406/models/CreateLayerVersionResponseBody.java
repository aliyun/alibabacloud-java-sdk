// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateLayerVersionResponseBody extends TeaModel {
    /**
     * <p>Creates a layer version.</p>
     */
    @NameInMap("acl")
    public Integer acl;

    @NameInMap("arn")
    public String arn;

    /**
     * <p>The access mode of the layer.</p>
     */
    @NameInMap("code")
    public OutputCodeLocation code;

    /**
     * <p>Example 1</p>
     */
    @NameInMap("codeChecksum")
    public String codeChecksum;

    /**
     * <p>The size of the layer code package. Unit: Byte.</p>
     */
    @NameInMap("codesize")
    public Long codesize;

    /**
     * <p>Luoni</p>
     */
    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    /**
     * <p>Creates a layer version.</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The name of the layer.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of runtime environments that are supported by the layer.</p>
     */
    @NameInMap("layerName")
    public String layerName;

    /**
     * <p>The time when the layer version was created. The time follows the **yyyy-MM-ddTHH:mm:ssZ** format.</p>
     */
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
