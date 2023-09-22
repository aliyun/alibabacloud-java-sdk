// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3AddressLabelsResponseBody extends TeaModel {
    /**
     * <p>Return code. For the full list of codes, see Codes and Messages.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>data</p>
     */
    @NameInMap("Data")
    public DescribeWeb3AddressLabelsResponseBodyData data;

    /**
     * <p>The HTTP status code</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response detailed message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request, which can be used to locate issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWeb3AddressLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWeb3AddressLabelsResponseBody self = new DescribeWeb3AddressLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWeb3AddressLabelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeWeb3AddressLabelsResponseBody setData(DescribeWeb3AddressLabelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWeb3AddressLabelsResponseBodyData getData() {
        return this.data;
    }

    public DescribeWeb3AddressLabelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeWeb3AddressLabelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWeb3AddressLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWeb3AddressLabelsResponseBodyData extends TeaModel {
        /**
         * <p>address</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>amount of native currency</p>
         */
        @NameInMap("Balance")
        public String balance;

        /**
         * <p>native currency of the chain</p>
         */
        @NameInMap("BalanceSymbol")
        public String balanceSymbol;

        /**
         * <p>ChainNameEnumstring name of blockchain</p>
         */
        @NameInMap("ChainName")
        public String chainName;

        /**
         * <p>ChainShortName</p>
         */
        @NameInMap("ChainShortName")
        public String chainShortName;

        /**
         * <p>0: EOA; 1: Contract</p>
         */
        @NameInMap("ContractAddress")
        public String contractAddress;

        /**
         * <p>the address of deployer if the current address is a contract, null if the current address is an EOA</p>
         */
        @NameInMap("CreateContractAddress")
        public String createContractAddress;

        /**
         * <p>contract creation hash if the current address is a contract, null if the current address is an EOA</p>
         */
        @NameInMap("CreateContractTransactionHash")
        public String createContractTransactionHash;

        /**
         * <p>customized assessment detail</p>
         */
        @NameInMap("CustomRiskAssessment")
        public String customRiskAssessment;

        /**
         * <p>the first transaction hash sent by the address</p>
         */
        @NameInMap("FirstTransactionTime")
        public String firstTransactionTime;

        /**
         * <p>0: Not validator; 1: validator</p>
         */
        @NameInMap("IsProducerAddress")
        public String isProducerAddress;

        /**
         * <p>the latest transaction hash sent by the address</p>
         */
        @NameInMap("LastTransactionTime")
        public String lastTransactionTime;

        /**
         * <p>the amount of native currency received in 180 days</p>
         */
        @NameInMap("ReceiveAmount")
        public String receiveAmount;

        /**
         * <p>the amount of native currency sent in 180 days</p>
         */
        @NameInMap("SendAmount")
        public String sendAmount;

        /**
         * <p>tag</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>if the address is an erc20 token, returns the token name</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>the number of erc20 tokens involved with current address in 180 days</p>
         */
        @NameInMap("TokenAmount")
        public Integer tokenAmount;

        /**
         * <p>address of erc20 tokens involved with current address in 180 days</p>
         */
        @NameInMap("TokenList")
        public String tokenList;

        /**
         * <p>the number of transactions</p>
         */
        @NameInMap("TransactionCount")
        public Integer transactionCount;

        public static DescribeWeb3AddressLabelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWeb3AddressLabelsResponseBodyData self = new DescribeWeb3AddressLabelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWeb3AddressLabelsResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setBalanceSymbol(String balanceSymbol) {
            this.balanceSymbol = balanceSymbol;
            return this;
        }
        public String getBalanceSymbol() {
            return this.balanceSymbol;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setChainName(String chainName) {
            this.chainName = chainName;
            return this;
        }
        public String getChainName() {
            return this.chainName;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setChainShortName(String chainShortName) {
            this.chainShortName = chainShortName;
            return this;
        }
        public String getChainShortName() {
            return this.chainShortName;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setContractAddress(String contractAddress) {
            this.contractAddress = contractAddress;
            return this;
        }
        public String getContractAddress() {
            return this.contractAddress;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setCreateContractAddress(String createContractAddress) {
            this.createContractAddress = createContractAddress;
            return this;
        }
        public String getCreateContractAddress() {
            return this.createContractAddress;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setCreateContractTransactionHash(String createContractTransactionHash) {
            this.createContractTransactionHash = createContractTransactionHash;
            return this;
        }
        public String getCreateContractTransactionHash() {
            return this.createContractTransactionHash;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setCustomRiskAssessment(String customRiskAssessment) {
            this.customRiskAssessment = customRiskAssessment;
            return this;
        }
        public String getCustomRiskAssessment() {
            return this.customRiskAssessment;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setFirstTransactionTime(String firstTransactionTime) {
            this.firstTransactionTime = firstTransactionTime;
            return this;
        }
        public String getFirstTransactionTime() {
            return this.firstTransactionTime;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setIsProducerAddress(String isProducerAddress) {
            this.isProducerAddress = isProducerAddress;
            return this;
        }
        public String getIsProducerAddress() {
            return this.isProducerAddress;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setLastTransactionTime(String lastTransactionTime) {
            this.lastTransactionTime = lastTransactionTime;
            return this;
        }
        public String getLastTransactionTime() {
            return this.lastTransactionTime;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setReceiveAmount(String receiveAmount) {
            this.receiveAmount = receiveAmount;
            return this;
        }
        public String getReceiveAmount() {
            return this.receiveAmount;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setSendAmount(String sendAmount) {
            this.sendAmount = sendAmount;
            return this;
        }
        public String getSendAmount() {
            return this.sendAmount;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setTokenAmount(Integer tokenAmount) {
            this.tokenAmount = tokenAmount;
            return this;
        }
        public Integer getTokenAmount() {
            return this.tokenAmount;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setTokenList(String tokenList) {
            this.tokenList = tokenList;
            return this;
        }
        public String getTokenList() {
            return this.tokenList;
        }

        public DescribeWeb3AddressLabelsResponseBodyData setTransactionCount(Integer transactionCount) {
            this.transactionCount = transactionCount;
            return this;
        }
        public Integer getTransactionCount() {
            return this.transactionCount;
        }

    }

}
