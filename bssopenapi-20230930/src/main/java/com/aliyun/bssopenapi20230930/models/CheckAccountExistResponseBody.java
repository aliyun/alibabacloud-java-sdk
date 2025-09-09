// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CheckAccountExistResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckAccountExistResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckAccountExistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountExistResponseBody self = new CheckAccountExistResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAccountExistResponseBody setData(CheckAccountExistResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckAccountExistResponseBodyData getData() {
        return this.data;
    }

    public CheckAccountExistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckAccountExistResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>1904635303738977</p>
         */
        @NameInMap("Pk")
        public String pk;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Result")
        public Boolean result;

        public static CheckAccountExistResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckAccountExistResponseBodyData self = new CheckAccountExistResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckAccountExistResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CheckAccountExistResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public CheckAccountExistResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public CheckAccountExistResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
