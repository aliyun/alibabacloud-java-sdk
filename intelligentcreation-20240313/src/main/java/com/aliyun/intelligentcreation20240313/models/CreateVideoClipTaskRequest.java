// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateVideoClipTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1314445556</p>
     */
    @NameInMap("aliyunMainId")
    public String aliyunMainId;

    @NameInMap("description")
    public String description;

    @NameInMap("ossKeys")
    public java.util.List<String> ossKeys;

    @NameInMap("requirement")
    public String requirement;

    public static CreateVideoClipTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoClipTaskRequest self = new CreateVideoClipTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoClipTaskRequest setAliyunMainId(String aliyunMainId) {
        this.aliyunMainId = aliyunMainId;
        return this;
    }
    public String getAliyunMainId() {
        return this.aliyunMainId;
    }

    public CreateVideoClipTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVideoClipTaskRequest setOssKeys(java.util.List<String> ossKeys) {
        this.ossKeys = ossKeys;
        return this;
    }
    public java.util.List<String> getOssKeys() {
        return this.ossKeys;
    }

    public CreateVideoClipTaskRequest setRequirement(String requirement) {
        this.requirement = requirement;
        return this;
    }
    public String getRequirement() {
        return this.requirement;
    }

}
