// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesResponse extends TeaModel {
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
    public ListAliasesResponseAliases aliases;

    public static ListAliasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesResponse self = new ListAliasesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAliasesResponseAliasesAlias extends TeaModel {
        @NameInMap("KeyId")
        @Validation(required = true)
        public String keyId;

        @NameInMap("AliasName")
        @Validation(required = true)
        public String aliasName;

        @NameInMap("AliasArn")
        @Validation(required = true)
        public String aliasArn;

        public static ListAliasesResponseAliasesAlias build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesResponseAliasesAlias self = new ListAliasesResponseAliasesAlias();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAliasesResponseAliases extends TeaModel {
        @NameInMap("Alias")
        @Validation(required = true)
        public java.util.List<ListAliasesResponseAliasesAlias> alias;

        public static ListAliasesResponseAliases build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesResponseAliases self = new ListAliasesResponseAliases();
            return TeaModel.build(map, self);
        }

    }

}
