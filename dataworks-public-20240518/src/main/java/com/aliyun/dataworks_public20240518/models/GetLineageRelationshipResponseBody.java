// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetLineageRelationshipResponseBody extends TeaModel {
    @NameInMap("LineageRelationship")
    public LineageRelationship lineageRelationship;

    /**
     * <strong>example:</strong>
     * <p>58D5334A-B013-430E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLineageRelationshipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLineageRelationshipResponseBody self = new GetLineageRelationshipResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLineageRelationshipResponseBody setLineageRelationship(LineageRelationship lineageRelationship) {
        this.lineageRelationship = lineageRelationship;
        return this;
    }
    public LineageRelationship getLineageRelationship() {
        return this.lineageRelationship;
    }

    public GetLineageRelationshipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
