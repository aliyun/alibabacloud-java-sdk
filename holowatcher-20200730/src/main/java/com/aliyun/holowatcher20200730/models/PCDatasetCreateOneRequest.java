// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PCDatasetCreateOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Body")
    public String body;

    @NameInMap("ProjectId")
    public Long projectId;

    public static PCDatasetCreateOneRequest build(java.util.Map<String, ?> map) throws Exception {
        PCDatasetCreateOneRequest self = new PCDatasetCreateOneRequest();
        return TeaModel.build(map, self);
    }

    public PCDatasetCreateOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public PCDatasetCreateOneRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PCDatasetCreateOneRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
