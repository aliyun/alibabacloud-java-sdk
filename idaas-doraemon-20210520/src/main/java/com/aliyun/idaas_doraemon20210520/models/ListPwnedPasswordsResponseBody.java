// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListPwnedPasswordsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PwnedPasswordInfos")
    public java.util.List<ListPwnedPasswordsResponseBodyPwnedPasswordInfos> pwnedPasswordInfos;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPwnedPasswordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPwnedPasswordsResponseBody self = new ListPwnedPasswordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPwnedPasswordsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPwnedPasswordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPwnedPasswordsResponseBody setPwnedPasswordInfos(java.util.List<ListPwnedPasswordsResponseBodyPwnedPasswordInfos> pwnedPasswordInfos) {
        this.pwnedPasswordInfos = pwnedPasswordInfos;
        return this;
    }
    public java.util.List<ListPwnedPasswordsResponseBodyPwnedPasswordInfos> getPwnedPasswordInfos() {
        return this.pwnedPasswordInfos;
    }

    public ListPwnedPasswordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPwnedPasswordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPwnedPasswordsResponseBodyPwnedPasswordInfos extends TeaModel {
        @NameInMap("HexPasswordSha1Hash")
        public String hexPasswordSha1Hash;

        @NameInMap("PwnedCount")
        public Long pwnedCount;

        public static ListPwnedPasswordsResponseBodyPwnedPasswordInfos build(java.util.Map<String, ?> map) throws Exception {
            ListPwnedPasswordsResponseBodyPwnedPasswordInfos self = new ListPwnedPasswordsResponseBodyPwnedPasswordInfos();
            return TeaModel.build(map, self);
        }

        public ListPwnedPasswordsResponseBodyPwnedPasswordInfos setHexPasswordSha1Hash(String hexPasswordSha1Hash) {
            this.hexPasswordSha1Hash = hexPasswordSha1Hash;
            return this;
        }
        public String getHexPasswordSha1Hash() {
            return this.hexPasswordSha1Hash;
        }

        public ListPwnedPasswordsResponseBodyPwnedPasswordInfos setPwnedCount(Long pwnedCount) {
            this.pwnedCount = pwnedCount;
            return this;
        }
        public Long getPwnedCount() {
            return this.pwnedCount;
        }

    }

}
