// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateUploadTokenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("Source")
    public String source;

    @NameInMap("UploadTokenType")
    public String uploadTokenType;

    public static GenerateUploadTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadTokenRequest self = new GenerateUploadTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GenerateUploadTokenRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public GenerateUploadTokenRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public GenerateUploadTokenRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GenerateUploadTokenRequest setUploadTokenType(String uploadTokenType) {
        this.uploadTokenType = uploadTokenType;
        return this;
    }
    public String getUploadTokenType() {
        return this.uploadTokenType;
    }

}
