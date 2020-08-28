// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeyVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("KeyVersions")
    @Validation(required = true)
    public ListKeyVersionsResponseKeyVersions keyVersions;

    public static ListKeyVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKeyVersionsResponse self = new ListKeyVersionsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListKeyVersionsResponseKeyVersionsKeyVersion extends TeaModel {
        @NameInMap("KeyId")
        @Validation(required = true)
        public String keyId;

        @NameInMap("KeyVersionId")
        @Validation(required = true)
        public String keyVersionId;

        @NameInMap("CreationDate")
        @Validation(required = true)
        public String creationDate;

        public static ListKeyVersionsResponseKeyVersionsKeyVersion build(java.util.Map<String, ?> map) throws Exception {
            ListKeyVersionsResponseKeyVersionsKeyVersion self = new ListKeyVersionsResponseKeyVersionsKeyVersion();
            return TeaModel.build(map, self);
        }

    }

    public static class ListKeyVersionsResponseKeyVersions extends TeaModel {
        @NameInMap("KeyVersion")
        @Validation(required = true)
        public java.util.List<ListKeyVersionsResponseKeyVersionsKeyVersion> keyVersion;

        public static ListKeyVersionsResponseKeyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListKeyVersionsResponseKeyVersions self = new ListKeyVersionsResponseKeyVersions();
            return TeaModel.build(map, self);
        }

    }

}
