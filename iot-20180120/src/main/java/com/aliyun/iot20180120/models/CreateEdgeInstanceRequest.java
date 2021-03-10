// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Spec")
    public Integer spec;

    public static CreateEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceRequest self = new CreateEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateEdgeInstanceRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateEdgeInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEdgeInstanceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateEdgeInstanceRequest setSpec(Integer spec) {
        this.spec = spec;
        return this;
    }
    public Integer getSpec() {
        return this.spec;
    }

}
