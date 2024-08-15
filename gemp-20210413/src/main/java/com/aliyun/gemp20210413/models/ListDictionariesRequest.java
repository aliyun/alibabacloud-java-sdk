// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDictionariesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
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
