// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAgenticSpaceResponseBody extends TeaModel {
    /**
     * <p>The AgenticSpace ID. This is a globally unique identifier assigned by the system after the AgenticSpace (an independent workspace allocated to a single Agent end user in AgenticFS) is created.</p>
     * 
     * <strong>example:</strong>
     * <p>agentic-229oypxjgpau2****</p>
     */
    @NameInMap("AgenticSpaceId")
    public String agenticSpaceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAgenticSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticSpaceResponseBody self = new CreateAgenticSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgenticSpaceResponseBody setAgenticSpaceId(String agenticSpaceId) {
        this.agenticSpaceId = agenticSpaceId;
        return this;
    }
    public String getAgenticSpaceId() {
        return this.agenticSpaceId;
    }

    public CreateAgenticSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
