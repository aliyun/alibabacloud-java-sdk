// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListOncallContactsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1730183838000</p>
     */
    @NameInMap("timestamp")
    public String timestamp;

    public static ListOncallContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOncallContactsRequest self = new ListOncallContactsRequest();
        return TeaModel.build(map, self);
    }

    public ListOncallContactsRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
