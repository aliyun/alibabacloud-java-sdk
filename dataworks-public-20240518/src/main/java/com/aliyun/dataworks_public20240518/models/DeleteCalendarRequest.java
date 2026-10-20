// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteCalendarRequest extends TeaModel {
    /**
     * <p>The ID of the scheduling calendar.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCalendarRequest self = new DeleteCalendarRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCalendarRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
