// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Aliases")
    public ListAliasesResponseBodyAliases aliases;

    public static ListAliasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesResponseBody self = new ListAliasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliasesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAliasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAliasesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAliasesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAliasesResponseBody setAliases(ListAliasesResponseBodyAliases aliases) {
        this.aliases = aliases;
        return this;
    }
    public ListAliasesResponseBodyAliases getAliases() {
        return this.aliases;
    }

    public static class ListAliasesResponseBodyAliasesAlias extends TeaModel {
        @NameInMap("AliasArn")
        public String aliasArn;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("AliasName")
        public String aliasName;

        public static ListAliasesResponseBodyAliasesAlias build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesResponseBodyAliasesAlias self = new ListAliasesResponseBodyAliasesAlias();
            return TeaModel.build(map, self);
        }

        public ListAliasesResponseBodyAliasesAlias setAliasArn(String aliasArn) {
            this.aliasArn = aliasArn;
            return this;
        }
        public String getAliasArn() {
            return this.aliasArn;
        }

        public ListAliasesResponseBodyAliasesAlias setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public ListAliasesResponseBodyAliasesAlias setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

    }

    public static class ListAliasesResponseBodyAliases extends TeaModel {
        @NameInMap("Alias")
        public java.util.List<ListAliasesResponseBodyAliasesAlias> alias;

        public static ListAliasesResponseBodyAliases build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesResponseBodyAliases self = new ListAliasesResponseBodyAliases();
            return TeaModel.build(map, self);
        }

        public ListAliasesResponseBodyAliases setAlias(java.util.List<ListAliasesResponseBodyAliasesAlias> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<ListAliasesResponseBodyAliasesAlias> getAlias() {
            return this.alias;
        }

    }

}
