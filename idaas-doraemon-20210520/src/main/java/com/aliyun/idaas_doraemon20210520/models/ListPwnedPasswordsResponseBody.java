// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListPwnedPasswordsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListPwnedPasswordsResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPwnedPasswordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPwnedPasswordsResponseBody self = new ListPwnedPasswordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPwnedPasswordsResponseBody setItems(java.util.List<ListPwnedPasswordsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPwnedPasswordsResponseBodyItems> getItems() {
        return this.items;
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

    public static class ListPwnedPasswordsResponseBodyItems extends TeaModel {
        @NameInMap("HexPasswordSha1Hash")
        public String hexPasswordSha1Hash;

        @NameInMap("PwnedCount")
        public Long pwnedCount;

        public static ListPwnedPasswordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListPwnedPasswordsResponseBodyItems self = new ListPwnedPasswordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListPwnedPasswordsResponseBodyItems setHexPasswordSha1Hash(String hexPasswordSha1Hash) {
            this.hexPasswordSha1Hash = hexPasswordSha1Hash;
            return this;
        }
        public String getHexPasswordSha1Hash() {
            return this.hexPasswordSha1Hash;
        }

        public ListPwnedPasswordsResponseBodyItems setPwnedCount(Long pwnedCount) {
            this.pwnedCount = pwnedCount;
            return this;
        }
        public Long getPwnedCount() {
            return this.pwnedCount;
        }

    }

}
