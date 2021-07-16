// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDictionariesRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static ListDictionariesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDictionariesRequest self = new ListDictionariesRequest();
        return TeaModel.build(map, self);
    }

    public ListDictionariesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
