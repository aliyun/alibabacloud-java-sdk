// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListAddressResponseBody extends TeaModel {
    /**
     * <p>The details of migration addresses.</p>
     */
    @NameInMap("ImportAddressList")
    public ListAddressResp importAddressList;

    public static ListAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddressResponseBody self = new ListAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddressResponseBody setImportAddressList(ListAddressResp importAddressList) {
        this.importAddressList = importAddressList;
        return this;
    }
    public ListAddressResp getImportAddressList() {
        return this.importAddressList;
    }

}
