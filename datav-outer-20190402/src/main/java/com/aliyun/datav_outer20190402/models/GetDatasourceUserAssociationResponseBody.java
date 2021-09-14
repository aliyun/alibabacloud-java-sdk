// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetDatasourceUserAssociationResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("MemberUId")
    public String memberUId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Association")
    public String association;

    public static GetDatasourceUserAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasourceUserAssociationResponseBody self = new GetDatasourceUserAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasourceUserAssociationResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetDatasourceUserAssociationResponseBody setMemberUId(String memberUId) {
        this.memberUId = memberUId;
        return this;
    }
    public String getMemberUId() {
        return this.memberUId;
    }

    public GetDatasourceUserAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasourceUserAssociationResponseBody setAssociation(String association) {
        this.association = association;
        return this;
    }
    public String getAssociation() {
        return this.association;
    }

}
