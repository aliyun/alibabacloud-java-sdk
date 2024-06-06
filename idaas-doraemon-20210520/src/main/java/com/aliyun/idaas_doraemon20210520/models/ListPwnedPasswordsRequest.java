// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListPwnedPasswordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PrefixHexPasswordSha1Hash")
    public String prefixHexPasswordSha1Hash;

    public static ListPwnedPasswordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPwnedPasswordsRequest self = new ListPwnedPasswordsRequest();
        return TeaModel.build(map, self);
    }

    public ListPwnedPasswordsRequest setPrefixHexPasswordSha1Hash(String prefixHexPasswordSha1Hash) {
        this.prefixHexPasswordSha1Hash = prefixHexPasswordSha1Hash;
        return this;
    }
    public String getPrefixHexPasswordSha1Hash() {
        return this.prefixHexPasswordSha1Hash;
    }

}
