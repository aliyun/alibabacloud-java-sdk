// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateLayerVersionResponseBody extends TeaModel {
    /**
     * <p>The access mode of the layer. Digit 0 specifies that the layer is private and digit 1 specifies that the layer is public. By default, public layers are public. Custom layers can be set to private or public.</p>
     */
    @NameInMap("acl")
    public Integer acl;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the layer.</p>
     */
    @NameInMap("arn")
    public String arn;

    /**
     * <p>The information about the layer code package.</p>
     */
    @NameInMap("code")
    public OutputCodeLocation code;

    /**
     * <p>The CRC-64 value of the layer code package. The value is calculated based on the **ECMA-182 **standard.</p>
     */
    @NameInMap("codeChecksum")
    public String codeChecksum;

    /**
     * <p>The size of the layer code package. Unit: bytes.</p>
     */
    @NameInMap("codesize")
    public Long codesize;

    /**
     * <p>The runtimes that are supported by the layer.</p>
     */
    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    /**
     * <p>The time when the layer version was created. The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description of the layer version.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The layer name.</p>
     */
    @NameInMap("layerName")
    public String layerName;

    /**
     * <p>The layer version.</p>
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
