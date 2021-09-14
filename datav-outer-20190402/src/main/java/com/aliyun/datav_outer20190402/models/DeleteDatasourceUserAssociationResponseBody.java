// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class DeleteDatasourceUserAssociationResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("MemberUId")
    public String memberUId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasourceUserAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasourceUserAssociationResponseBody self = new DeleteDatasourceUserAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasourceUserAssociationResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteDatasourceUserAssociationResponseBody setMemberUId(String memberUId) {
        this.memberUId = memberUId;
        return this;
    }
    public String getMemberUId() {
        return this.memberUId;
    }

    public DeleteDatasourceUserAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
