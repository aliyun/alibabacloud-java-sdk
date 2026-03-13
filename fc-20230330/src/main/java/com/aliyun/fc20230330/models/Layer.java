// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Layer extends TeaModel {
    /**
     * <p>The permission of the layer. Valid value: 0 and 1. 0 specifies that the layer is private, and 1 specifies that the layer is public. By default, public layers are public. Custom layers can be set to private or public.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("acl")
    public String acl;

    /**
     * <p>The information about the code package of the layer.</p>
     */
    @NameInMap("code")
    public OutputCodeLocation code;

    /**
     * <p>The crc64 verification code of the layer code package, which is calculated based on ECMA-182.</p>
     * 
     * <strong>example:</strong>
     * <p>2825179536350****</p>
     */
    @NameInMap("codeChecksum")
    public String codeChecksum;

    /**
     * <p>The size of the layer code package. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>421</p>
     */
    @NameInMap("codeSize")
    public Long codeSize;

    /**
     * <p>The runtimes that are supported by the layer.</p>
     */
    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    /**
     * <p>The time when the layer version was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-30T11:08:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description of the layer version.</p>
     * 
     * <strong>example:</strong>
     * <p>My first layer</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the layer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyLayer</p>
     */
    @NameInMap("layerName")
    public String layerName;

    /**
     * <p>The name of the resource in the layer version. The name is in the acs:fc:{region}:{accountID}:layers/{layerName}/versions/{layerVersion} format.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-beijing:186824xxxxxx:layers/fc_layer/versions/1</p>
     */
    @NameInMap("layerVersionArn")
    public String layerVersionArn;

    /**
     * <p>The license agreement.</p>
     * 
     * <strong>example:</strong>
     * <p>Apache</p>
     */
    @NameInMap("license")
    public String license;

    /**
     * <p>The layer version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
