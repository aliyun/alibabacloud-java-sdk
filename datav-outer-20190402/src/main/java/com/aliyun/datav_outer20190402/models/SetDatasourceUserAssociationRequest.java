// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class SetDatasourceUserAssociationRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("MemberUId")
    public String memberUId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Association")
    public String association;

    public static SetDatasourceUserAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDatasourceUserAssociationRequest self = new SetDatasourceUserAssociationRequest();
        return TeaModel.build(map, self);
    }

    public SetDatasourceUserAssociationRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public SetDatasourceUserAssociationRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public SetDatasourceUserAssociationRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetDatasourceUserAssociationRequest setMemberUId(String memberUId) {
        this.memberUId = memberUId;
        return this;
    }
    public String getMemberUId() {
        return this.memberUId;
    }

    public SetDatasourceUserAssociationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SetDatasourceUserAssociationRequest setAssociation(String association) {
        this.association = association;
        return this;
    }
    public String getAssociation() {
        return this.association;
    }

}
