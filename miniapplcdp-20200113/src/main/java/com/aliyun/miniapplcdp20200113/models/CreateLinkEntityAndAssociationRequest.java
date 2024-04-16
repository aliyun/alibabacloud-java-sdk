// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateLinkEntityAndAssociationRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ModelData")
    public String modelData;

    @NameInMap("Source")
    public String source;

    public static CreateLinkEntityAndAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkEntityAndAssociationRequest self = new CreateLinkEntityAndAssociationRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkEntityAndAssociationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLinkEntityAndAssociationRequest setModelData(String modelData) {
        this.modelData = modelData;
        return this;
    }
    public String getModelData() {
        return this.modelData;
    }

    public CreateLinkEntityAndAssociationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
