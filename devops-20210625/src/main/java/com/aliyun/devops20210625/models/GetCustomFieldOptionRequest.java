// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCustomFieldOptionRequest extends TeaModel {
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    @NameInMap("spaceType")
    public String spaceType;

    @NameInMap("workitemTypeIdentifier")
    public String workitemTypeIdentifier;

    public static GetCustomFieldOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomFieldOptionRequest self = new GetCustomFieldOptionRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomFieldOptionRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public GetCustomFieldOptionRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public GetCustomFieldOptionRequest setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
        this.workitemTypeIdentifier = workitemTypeIdentifier;
        return this;
    }
    public String getWorkitemTypeIdentifier() {
        return this.workitemTypeIdentifier;
    }

}
