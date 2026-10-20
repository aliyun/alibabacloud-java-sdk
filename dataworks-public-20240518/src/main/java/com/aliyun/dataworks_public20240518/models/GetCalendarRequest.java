// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCalendarRequest extends TeaModel {
    /**
     * <p>The ID of the scheduling calendar.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCalendarRequest self = new GetCalendarRequest();
        return TeaModel.build(map, self);
    }

    public GetCalendarRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
