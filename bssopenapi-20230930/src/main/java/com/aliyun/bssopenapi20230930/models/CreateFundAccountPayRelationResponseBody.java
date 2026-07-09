// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateFundAccountPayRelationResponseBody extends TeaModel {
    /**
     * <p>Data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<CreateFundAccountPayRelationResponseBodyData> data;

    /**
     * <p>Response metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFundAccountPayRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFundAccountPayRelationResponseBody self = new CreateFundAccountPayRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFundAccountPayRelationResponseBody setData(java.util.List<CreateFundAccountPayRelationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateFundAccountPayRelationResponseBodyData> getData() {
        return this.data;
    }

    public CreateFundAccountPayRelationResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public CreateFundAccountPayRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateFundAccountPayRelationResponseBodyData extends TeaModel {
        /**
         * <p>AccountId of the user who pays with the account.</p>
         * 
         * <strong>example:</strong>
         * <p>1501603440974415</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>Name of the user who pays with the account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12332112</p>
         */
        @NameInMap("FundAccountId")
        public String fundAccountId;

        /**
         * <p>Result code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>Result message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ResultMessage")
        public String resultMessage;

        public static CreateFundAccountPayRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateFundAccountPayRelationResponseBodyData self = new CreateFundAccountPayRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateFundAccountPayRelationResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateFundAccountPayRelationResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateFundAccountPayRelationResponseBodyData setFundAccountId(String fundAccountId) {
            this.fundAccountId = fundAccountId;
            return this;
        }
        public String getFundAccountId() {
            return this.fundAccountId;
        }

        public CreateFundAccountPayRelationResponseBodyData setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public CreateFundAccountPayRelationResponseBodyData setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

    }

}
