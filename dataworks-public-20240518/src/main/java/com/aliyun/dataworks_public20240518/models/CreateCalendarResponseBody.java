// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCalendarResponseBody extends TeaModel {
    /**
     * <p>The ID of the scheduling calendar.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCalendarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCalendarResponseBody self = new CreateCalendarResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCalendarResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateCalendarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
