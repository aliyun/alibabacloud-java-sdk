// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListCalendarsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Request")
    public java.util.Map<String, ?> request;

    public static ListCalendarsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarsRequest self = new ListCalendarsRequest();
        return TeaModel.build(map, self);
    }

    public ListCalendarsRequest setRequest(java.util.Map<String, ?> request) {
        this.request = request;
        return this;
    }
    public java.util.Map<String, ?> getRequest() {
        return this.request;
    }

}
