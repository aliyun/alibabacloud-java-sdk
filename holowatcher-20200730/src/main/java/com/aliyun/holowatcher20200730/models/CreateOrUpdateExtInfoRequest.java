// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreateOrUpdateExtInfoRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("ProjectId")
    public String projectId;

    public static CreateOrUpdateExtInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateExtInfoRequest self = new CreateOrUpdateExtInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateExtInfoRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public CreateOrUpdateExtInfoRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateOrUpdateExtInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
