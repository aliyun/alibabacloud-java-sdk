// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectFindAllRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("JsonParams")
    public String jsonParams;

    public static ProjectFindAllRequest build(java.util.Map<String, ?> map) throws Exception {
        ProjectFindAllRequest self = new ProjectFindAllRequest();
        return TeaModel.build(map, self);
    }

    public ProjectFindAllRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public ProjectFindAllRequest setJsonParams(String jsonParams) {
        this.jsonParams = jsonParams;
        return this;
    }
    public String getJsonParams() {
        return this.jsonParams;
    }

}
