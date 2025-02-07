// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListPasskeysResponseBody extends TeaModel {
    @NameInMap("Passkeys")
    public java.util.List<ListPasskeysResponseBodyPasskeys> passkeys;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1737450279</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <strong>example:</strong>
         * <p>1737450390</p>
         */
        @NameInMap("LastUseDate")
        public String lastUseDate;

        /**
         * <strong>example:</strong>
         * <p>PASSKEY-CuZjEHhWcr7GIQOMGvkS</p>
         */
        @NameInMap("PasskeyId")
        public String passkeyId;

        /**
         * <strong>example:</strong>
         * <p>device1</p>
         */
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
