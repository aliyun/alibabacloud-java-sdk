// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectGetStatusAndOssRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Params")
    public String params;

    public static ProjectGetStatusAndOssRequest build(java.util.Map<String, ?> map) throws Exception {
        ProjectGetStatusAndOssRequest self = new ProjectGetStatusAndOssRequest();
        return TeaModel.build(map, self);
    }

    public ProjectGetStatusAndOssRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public ProjectGetStatusAndOssRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
