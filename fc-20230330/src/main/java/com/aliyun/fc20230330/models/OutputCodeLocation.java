// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class OutputCodeLocation extends TeaModel {
    @NameInMap("location")
    public String location;

    @NameInMap("repositoryType")
    public String repositoryType;

    public static OutputCodeLocation build(java.util.Map<String, ?> map) throws Exception {
        OutputCodeLocation self = new OutputCodeLocation();
        return TeaModel.build(map, self);
    }

    public OutputCodeLocation setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public OutputCodeLocation setRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
        return this;
    }
    public String getRepositoryType() {
        return this.repositoryType;
    }

}
