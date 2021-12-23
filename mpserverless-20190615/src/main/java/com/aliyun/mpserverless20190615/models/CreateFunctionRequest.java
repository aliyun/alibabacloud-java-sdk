// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateFunctionRequest extends TeaModel {
    @NameInMap("Desc")
    public String desc;

    @NameInMap("Name")
    public String name;

    @NameInMap("Runtime")
    public String runtime;

    @NameInMap("SpaceId")
    public String spaceId;

    public static CreateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionRequest self = new CreateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateFunctionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFunctionRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public CreateFunctionRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
