// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesByKeyIdResponse extends TeaModel {
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

    @NameInMap("Aliases")
    @Validation(required = true)
    public ListAliasesByKeyIdResponseAliases aliases;

    public static ListAliasesByKeyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesByKeyIdResponse self = new ListAliasesByKeyIdResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAliasesByKeyIdResponseAliasesAlias extends TeaModel {
        @NameInMap("KeyId")
        @Validation(required = true)
        public String keyId;

        @NameInMap("AliasName")
        @Validation(required = true)
        public String aliasName;

        @NameInMap("AliasArn")
        @Validation(required = true)
        public String aliasArn;

        public static ListAliasesByKeyIdResponseAliasesAlias build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesByKeyIdResponseAliasesAlias self = new ListAliasesByKeyIdResponseAliasesAlias();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAliasesByKeyIdResponseAliases extends TeaModel {
        @NameInMap("Alias")
        @Validation(required = true)
        public java.util.List<ListAliasesByKeyIdResponseAliasesAlias> alias;

        public static ListAliasesByKeyIdResponseAliases build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesByKeyIdResponseAliases self = new ListAliasesByKeyIdResponseAliases();
            return TeaModel.build(map, self);
        }

    }

}
