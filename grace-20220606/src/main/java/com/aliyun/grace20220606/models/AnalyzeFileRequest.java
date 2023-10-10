// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class AnalyzeFileRequest extends TeaModel {
    @NameInMap("keepUnreachableObjects")
    public Boolean keepUnreachableObjects;

    @NameInMap("name")
    public String name;

    @NameInMap("token")
    public String token;

    public static AnalyzeFileRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeFileRequest self = new AnalyzeFileRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeFileRequest setKeepUnreachableObjects(Boolean keepUnreachableObjects) {
        this.keepUnreachableObjects = keepUnreachableObjects;
        return this;
    }
    public Boolean getKeepUnreachableObjects() {
        return this.keepUnreachableObjects;
    }

    public AnalyzeFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AnalyzeFileRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
