// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetDatasourceUserAssociationRequest extends TeaModel {
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

    public static GetDatasourceUserAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasourceUserAssociationRequest self = new GetDatasourceUserAssociationRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasourceUserAssociationRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetDatasourceUserAssociationRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetDatasourceUserAssociationRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetDatasourceUserAssociationRequest setMemberUId(String memberUId) {
        this.memberUId = memberUId;
        return this;
    }
    public String getMemberUId() {
        return this.memberUId;
    }

    public GetDatasourceUserAssociationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
