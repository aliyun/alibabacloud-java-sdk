// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesByKeyIdResponseBody extends TeaModel {
    /**
     * <p>An array that consists of aliases.</p>
     */
    @NameInMap("Aliases")
    public ListAliasesByKeyIdResponseBodyAliases aliases;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned CMKs.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAliasesByKeyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesByKeyIdResponseBody self = new ListAliasesByKeyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliasesByKeyIdResponseBody setAliases(ListAliasesByKeyIdResponseBodyAliases aliases) {
        this.aliases = aliases;
        return this;
    }
    public ListAliasesByKeyIdResponseBodyAliases getAliases() {
        return this.aliases;
    }

    public ListAliasesByKeyIdResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAliasesByKeyIdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAliasesByKeyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAliasesByKeyIdResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAliasesByKeyIdResponseBodyAliasesAlias extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the alias.</p>
         */
        @NameInMap("AliasArn")
        public String aliasArn;

        /**
         * <p>The ID of the alias.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The CMK to which an alias is bound.</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        public static ListAliasesByKeyIdResponseBodyAliasesAlias build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesByKeyIdResponseBodyAliasesAlias self = new ListAliasesByKeyIdResponseBodyAliasesAlias();
            return TeaModel.build(map, self);
        }

        public ListAliasesByKeyIdResponseBodyAliasesAlias setAliasArn(String aliasArn) {
            this.aliasArn = aliasArn;
            return this;
        }
        public String getAliasArn() {
            return this.aliasArn;
        }

        public ListAliasesByKeyIdResponseBodyAliasesAlias setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListAliasesByKeyIdResponseBodyAliasesAlias setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

    }

    public static class ListAliasesByKeyIdResponseBodyAliases extends TeaModel {
        @NameInMap("Alias")
        public java.util.List<ListAliasesByKeyIdResponseBodyAliasesAlias> alias;

        public static ListAliasesByKeyIdResponseBodyAliases build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesByKeyIdResponseBodyAliases self = new ListAliasesByKeyIdResponseBodyAliases();
            return TeaModel.build(map, self);
        }

        public ListAliasesByKeyIdResponseBodyAliases setAlias(java.util.List<ListAliasesByKeyIdResponseBodyAliasesAlias> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<ListAliasesByKeyIdResponseBodyAliasesAlias> getAlias() {
            return this.alias;
        }

    }

}
