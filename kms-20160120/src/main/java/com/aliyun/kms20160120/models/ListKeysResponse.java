// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeysResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Keys")
    @Validation(required = true)
    public ListKeysResponseKeys keys;

    public static ListKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKeysResponse self = new ListKeysResponse();
        return TeaModel.build(map, self);
    }

    public static class ListKeysResponseKeysKey extends TeaModel {
        @NameInMap("KeyId")
        @Validation(required = true)
        public String keyId;

        @NameInMap("KeyArn")
        @Validation(required = true)
        public String keyArn;

        public static ListKeysResponseKeysKey build(java.util.Map<String, ?> map) throws Exception {
            ListKeysResponseKeysKey self = new ListKeysResponseKeysKey();
            return TeaModel.build(map, self);
        }

    }

    public static class ListKeysResponseKeys extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public java.util.List<ListKeysResponseKeysKey> key;

        public static ListKeysResponseKeys build(java.util.Map<String, ?> map) throws Exception {
            ListKeysResponseKeys self = new ListKeysResponseKeys();
            return TeaModel.build(map, self);
        }

    }

}
