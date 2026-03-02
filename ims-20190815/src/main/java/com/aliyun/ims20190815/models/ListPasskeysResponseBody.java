// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListPasskeysResponseBody extends TeaModel {
    @NameInMap("Passkeys")
    public java.util.List<ListPasskeysResponseBodyPasskeys> passkeys;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPasskeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPasskeysResponseBody self = new ListPasskeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPasskeysResponseBody setPasskeys(java.util.List<ListPasskeysResponseBodyPasskeys> passkeys) {
        this.passkeys = passkeys;
        return this;
    }
    public java.util.List<ListPasskeysResponseBodyPasskeys> getPasskeys() {
        return this.passkeys;
    }

    public ListPasskeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPasskeysResponseBodyPasskeys extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("LastUseDate")
        public String lastUseDate;

        @NameInMap("PasskeyId")
        public String passkeyId;

        @NameInMap("PasskeyName")
        public String passkeyName;

        public static ListPasskeysResponseBodyPasskeys build(java.util.Map<String, ?> map) throws Exception {
            ListPasskeysResponseBodyPasskeys self = new ListPasskeysResponseBodyPasskeys();
            return TeaModel.build(map, self);
        }

        public ListPasskeysResponseBodyPasskeys setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListPasskeysResponseBodyPasskeys setLastUseDate(String lastUseDate) {
            this.lastUseDate = lastUseDate;
            return this;
        }
        public String getLastUseDate() {
            return this.lastUseDate;
        }

        public ListPasskeysResponseBodyPasskeys setPasskeyId(String passkeyId) {
            this.passkeyId = passkeyId;
            return this;
        }
        public String getPasskeyId() {
            return this.passkeyId;
        }

        public ListPasskeysResponseBodyPasskeys setPasskeyName(String passkeyName) {
            this.passkeyName = passkeyName;
            return this;
        }
        public String getPasskeyName() {
            return this.passkeyName;
        }

    }

}
