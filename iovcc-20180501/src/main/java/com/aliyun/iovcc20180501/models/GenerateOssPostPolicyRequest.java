// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateOssPostPolicyRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Ext")
    public String ext;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AccessKey")
    public String accessKey;

    public static GenerateOssPostPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOssPostPolicyRequest self = new GenerateOssPostPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOssPostPolicyRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GenerateOssPostPolicyRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public GenerateOssPostPolicyRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GenerateOssPostPolicyRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

}
