// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateApplicationResponseBody extends TeaModel {
    @NameInMap("creatorAccountId")
    public String creatorAccountId;

    @NameInMap("description")
    public String description;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    public static UpdateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationResponseBody self = new UpdateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationResponseBody setCreatorAccountId(String creatorAccountId) {
        this.creatorAccountId = creatorAccountId;
        return this;
    }
    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    public UpdateApplicationResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UpdateApplicationResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
