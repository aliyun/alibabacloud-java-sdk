// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3TransactionLabelsResponseBody extends TeaModel {
    /**
     * <p>Return code. For the full list of codes, see Codes and Messages.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>data</p>
     */
    @NameInMap("Data")
    public DescribeWeb3TransactionLabelsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response detailed message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request, which can be used to locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7A0D192A-CC0C-5DE5-A3B6-A14CF45508F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWeb3TransactionLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWeb3TransactionLabelsResponseBody self = new DescribeWeb3TransactionLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWeb3TransactionLabelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeWeb3TransactionLabelsResponseBody setData(DescribeWeb3TransactionLabelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWeb3TransactionLabelsResponseBodyData getData() {
        return this.data;
    }

    public DescribeWeb3TransactionLabelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeWeb3TransactionLabelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWeb3TransactionLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWeb3TransactionLabelsResponseBodyDataContractDetails extends TeaModel {
        /**
         * <p>the value of internal transaction</p>
         * 
         * <strong>example:</strong>
         * <p>945.5</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>the sender of internal transaction</p>
         * 
         * <strong>example:</strong>
         * <p>C7019579cB9bdb9204e61C7179ba2F88F9dxxxxxx</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <p>the gaslimit of internal transaction</p>
         * 
         * <strong>example:</strong>
         * <p>20712</p>
         */
        @NameInMap("GasLimit")
        public Integer gasLimit;

        /**
         * <p>the call layer of internal transaction</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>the receiver of internal transaction</p>
         * 
         * <strong>example:</strong>
         * <p>C7019579cB9bdb9204e61C7179ba2F88F9dxxxxxx</p>
         */
        @NameInMap("To")
        public String to;

        public static DescribeWeb3TransactionLabelsResponseBodyDataContractDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeWeb3TransactionLabelsResponseBodyDataContractDetails self = new DescribeWeb3TransactionLabelsResponseBodyDataContractDetails();
            return TeaModel.build(map, self);
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataContractDetails setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataContractDetails setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataContractDetails setGasLimit(Integer gasLimit) {
            this.gasLimit = gasLimit;
            return this;
        }
        public Integer getGasLimit() {
            return this.gasLimit;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataContractDetails setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataContractDetails setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class DescribeWeb3TransactionLabelsResponseBodyDataInputDetails extends TeaModel {
        /**
         * <p>example: 15. the amount of transation sent by the address</p>
         * 
         * <strong>example:</strong>
         * <p>3234</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>the address hash</p>
         * 
         * <strong>example:</strong>
         * <p>21a31Ee1afC51d94C2eFcCAa2xxxxxx</p>
         */
        @NameInMap("InputHash")
        public String inputHash;

        /**
         * <p>example: true. is it a contract</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsContract")
        public String isContract;

        /**
         * <p>example: Dex . the tag of the address</p>
         * 
         * <strong>example:</strong>
         * <p>contracts:Tether: Tether_USD,token_standard:xxxxxx</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static DescribeWeb3TransactionLabelsResponseBodyDataInputDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeWeb3TransactionLabelsResponseBodyDataInputDetails self = new DescribeWeb3TransactionLabelsResponseBodyDataInputDetails();
            return TeaModel.build(map, self);
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataInputDetails setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataInputDetails setInputHash(String inputHash) {
            this.inputHash = inputHash;
            return this;
        }
        public String getInputHash() {
            return this.inputHash;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataInputDetails setIsContract(String isContract) {
            this.isContract = isContract;
            return this;
        }
        public String getIsContract() {
            return this.isContract;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataInputDetails setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails extends TeaModel {
        /**
         * <p>example: 15. the amount of transation sent by the address</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>the address hash</p>
         * 
         * <strong>example:</strong>
         * <p>21a31Ee1afC51d94C2eFcCAa2xxxxxx</p>
         */
        @NameInMap("InputHash")
        public String inputHash;

        /**
         * <p>example: true. is it a contract</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsContract")
        public String isContract;

        /**
         * <p>example: Dex. the tag of the address</p>
         * 
         * <strong>example:</strong>
         * <p>contracts:Tether: Tether_USD,token_standard:xxxxxx</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails self = new DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails();
            return TeaModel.build(map, self);
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails setInputHash(String inputHash) {
            this.inputHash = inputHash;
            return this;
        }
        public String getInputHash() {
            return this.inputHash;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails setIsContract(String isContract) {
            this.isContract = isContract;
            return this;
        }
        public String getIsContract() {
            return this.isContract;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails extends TeaModel {
        /**
         * <p>the token amount</p>
         * 
         * <strong>example:</strong>
         * <p>945.5</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>the sender of the token</p>
         * 
         * <strong>example:</strong>
         * <p>21a31Ee1afC51d94C2eFcCAa2092aD1028xxxxxx</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <p>the call layer of to token transfer</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>the token symbol</p>
         * 
         * <strong>example:</strong>
         * <p>USDT</p>
         */
        @NameInMap("Symbol")
        public String symbol;

        /**
         * <p>the receiver of the token</p>
         * 
         * <strong>example:</strong>
         * <p>C7019579cB9bdb9204e61C7179ba2F88F9dxxxxxx</p>
         */
        @NameInMap("To")
        public String to;

        /**
         * <p>the token name</p>
         * 
         * <strong>example:</strong>
         * <p>Tether USD</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>the token address</p>
         * 
         * <strong>example:</strong>
         * <p>dAC17F958D2ee523a2206206994597C13Dxxxxxx</p>
         */
        @NameInMap("TokenContractAddress")
        public String tokenContractAddress;

        /**
         * <p>NFT ID, if the token is erc721</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("TokenId")
        public String tokenId;

        public static DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails self = new DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails();
            return TeaModel.build(map, self);
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
        public String getSymbol() {
            return this.symbol;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails setTokenContractAddress(String tokenContractAddress) {
            this.tokenContractAddress = tokenContractAddress;
            return this;
        }
        public String getTokenContractAddress() {
            return this.tokenContractAddress;
        }

        public DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

    public static class DescribeWeb3TransactionLabelsResponseBodyData extends TeaModel {
        /**
         * <p>the amount of native currency</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>chainName</p>
         * 
         * <strong>example:</strong>
         * <p>ETH</p>
         */
        @NameInMap("ChainName")
        public String chainName;

        /**
         * <p>short name of blockchain</p>
         * 
         * <strong>example:</strong>
         * <p>eth</p>
         */
        @NameInMap("ChainShortName")
        public String chainShortName;

        /**
         * <p>contract details</p>
         */
        @NameInMap("ContractDetails")
        public java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataContractDetails> contractDetails;

        /**
         * <p>error log</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("ErrorLog")
        public String errorLog;

        /**
         * <p>gasLimit</p>
         * 
         * <strong>example:</strong>
         * <p>1232</p>
         */
        @NameInMap("GasLimit")
        public Integer gasLimit;

        /**
         * <p>gasPrice</p>
         * 
         * <strong>example:</strong>
         * <p>5034</p>
         */
        @NameInMap("GasPrice")
        public String gasPrice;

        /**
         * <p>gasUsed</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("GasUsed")
        public Integer gasUsed;

        /**
         * <p>height</p>
         * 
         * <strong>example:</strong>
         * <p>17087552</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>the position of the transaction in the block</p>
         * 
         * <strong>example:</strong>
         * <p>94</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>input data</p>
         * 
         * <strong>example:</strong>
         * <p>a9059cbb000000000000000000000000c7019579cb9bdb9204e61c7179ba2f88f9d2990b000000000xxxxxx</p>
         */
        @NameInMap("InputData")
        public String inputData;

        /**
         * <p>input details</p>
         */
        @NameInMap("InputDetails")
        public java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataInputDetails> inputDetails;

        /**
         * <p>the method name of contract call. For external transaction method: [\&quot;CALL\&quot;,\&quot;CALLCODE\&quot;,\&quot;DELEGATECALL\&quot;,\&quot;STATICCALL\&quot;]; for internal transaction method: the first 4 bytes of the hash of the method name</p>
         * 
         * <strong>example:</strong>
         * <p>a9059cbb</p>
         */
        @NameInMap("MethodId")
        public String methodId;

        /**
         * <p>nonce</p>
         * 
         * <strong>example:</strong>
         * <p>6242724</p>
         */
        @NameInMap("Nonce")
        public String nonce;

        /**
         * <p>output details</p>
         */
        @NameInMap("OutputDetails")
        public java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails> outputDetails;

        /**
         * <p>the transaction state. 1: success 0: fail</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("State")
        public Integer state;

        /**
         * <p>token transfer details</p>
         */
        @NameInMap("TokenTransferDetails")
        public java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails> tokenTransferDetails;

        /**
         * <p>the symbol of native currency</p>
         * 
         * <strong>example:</strong>
         * <p>ETH</p>
         */
        @NameInMap("TransactionSymbol")
        public String transactionSymbol;

        /**
         * <p>the block timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1681991807</p>
         */
        @NameInMap("TransactionTime")
        public String transactionTime;

        /**
         * <p>Integer	0: legacy; 1: eip 2930; 2: eip 1559</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TransactionType")
        public String transactionType;

        /**
         * <p>the transaction fee in eth</p>
         * 
         * <strong>example:</strong>
         * <p>0.002321489548255059</p>
         */
        @NameInMap("Txfee")
        public String txfee;

        /**
         * <p>Txid</p>
         * 
         * <strong>example:</strong>
         * <p>c92880148d4896d8a2093a891a8f08916fe141fba474ede410xxxxxx</p>
         */
        @NameInMap("Txid")
        public String txid;

        public static DescribeWeb3TransactionLabelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWeb3TransactionLabelsResponseBodyData self = new DescribeWeb3TransactionLabelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setChainName(String chainName) {
            this.chainName = chainName;
            return this;
        }
        public String getChainName() {
            return this.chainName;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setChainShortName(String chainShortName) {
            this.chainShortName = chainShortName;
            return this;
        }
        public String getChainShortName() {
            return this.chainShortName;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setContractDetails(java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataContractDetails> contractDetails) {
            this.contractDetails = contractDetails;
            return this;
        }
        public java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataContractDetails> getContractDetails() {
            return this.contractDetails;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setErrorLog(String errorLog) {
            this.errorLog = errorLog;
            return this;
        }
        public String getErrorLog() {
            return this.errorLog;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setGasLimit(Integer gasLimit) {
            this.gasLimit = gasLimit;
            return this;
        }
        public Integer getGasLimit() {
            return this.gasLimit;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setGasPrice(String gasPrice) {
            this.gasPrice = gasPrice;
            return this;
        }
        public String getGasPrice() {
            return this.gasPrice;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setGasUsed(Integer gasUsed) {
            this.gasUsed = gasUsed;
            return this;
        }
        public Integer getGasUsed() {
            return this.gasUsed;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setInputDetails(java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataInputDetails> inputDetails) {
            this.inputDetails = inputDetails;
            return this;
        }
        public java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataInputDetails> getInputDetails() {
            return this.inputDetails;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setMethodId(String methodId) {
            this.methodId = methodId;
            return this;
        }
        public String getMethodId() {
            return this.methodId;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setOutputDetails(java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails> outputDetails) {
            this.outputDetails = outputDetails;
            return this;
        }
        public java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataOutputDetails> getOutputDetails() {
            return this.outputDetails;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setTokenTransferDetails(java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails> tokenTransferDetails) {
            this.tokenTransferDetails = tokenTransferDetails;
            return this;
        }
        public java.util.List<DescribeWeb3TransactionLabelsResponseBodyDataTokenTransferDetails> getTokenTransferDetails() {
            return this.tokenTransferDetails;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setTransactionSymbol(String transactionSymbol) {
            this.transactionSymbol = transactionSymbol;
            return this;
        }
        public String getTransactionSymbol() {
            return this.transactionSymbol;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setTransactionTime(String transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }
        public String getTransactionTime() {
            return this.transactionTime;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public String getTransactionType() {
            return this.transactionType;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setTxfee(String txfee) {
            this.txfee = txfee;
            return this;
        }
        public String getTxfee() {
            return this.txfee;
        }

        public DescribeWeb3TransactionLabelsResponseBodyData setTxid(String txid) {
            this.txid = txid;
            return this;
        }
        public String getTxid() {
            return this.txid;
        }

    }

}
