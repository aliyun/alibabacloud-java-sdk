// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListPwnedPasswordsResponseBody extends TeaModel {
    @NameInMap("PwnedPasswordInfos")
    public java.util.List<ListPwnedPasswordsResponseBodyPwnedPasswordInfos> pwnedPasswordInfos;

    @NameInMap("RequestId")
    public String requestId;

    // 返回列表长度
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPwnedPasswordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPwnedPasswordsResponseBody self = new ListPwnedPasswordsResponseBody();
        return TeaModel.build(map, self);
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
        // 泄露密码SHA1值
        @NameInMap("HexPasswordSha1Hash")
        public String hexPasswordSha1Hash;

        // 泄露次数
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
