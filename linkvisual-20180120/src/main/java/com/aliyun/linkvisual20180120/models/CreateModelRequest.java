// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    public Long algorithmId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("ModelPackageStandard")
    @Validation(required = true)
    public String modelPackageStandard;

    @NameInMap("Hardware")
    @Validation(required = true)
    public String hardware;

    @NameInMap("UploadModelPath")
    @Validation(required = true)
    public String uploadModelPath;

    @NameInMap("NeedEncrypt")
    @Validation(required = true)
    public Boolean needEncrypt;

    @NameInMap("Description")
    public String description;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setAlgorithmId(Long algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

    public CreateModelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelRequest setModelPackageStandard(String modelPackageStandard) {
        this.modelPackageStandard = modelPackageStandard;
        return this;
    }
    public String getModelPackageStandard() {
        return this.modelPackageStandard;
    }

    public CreateModelRequest setHardware(String hardware) {
        this.hardware = hardware;
        return this;
    }
    public String getHardware() {
        return this.hardware;
    }

    public CreateModelRequest setUploadModelPath(String uploadModelPath) {
        this.uploadModelPath = uploadModelPath;
        return this;
    }
    public String getUploadModelPath() {
        return this.uploadModelPath;
    }

    public CreateModelRequest setNeedEncrypt(Boolean needEncrypt) {
        this.needEncrypt = needEncrypt;
        return this;
    }
    public Boolean getNeedEncrypt() {
        return this.needEncrypt;
    }

    public CreateModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
