// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainSubnetListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainSubnetListResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainSubnetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainSubnetListResponseBody self = new DescribeAntChainSubnetListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainSubnetListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainSubnetListResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainSubnetListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainSubnetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainSubnetListResponseBody setResult(DescribeAntChainSubnetListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainSubnetListResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainSubnetListResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainSubnetListResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainSubnetListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("BlockHeight")
        public Long blockHeight;

        @NameInMap("ConsortiumMember")
        public Boolean consortiumMember;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Monitor")
        public Boolean monitor;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeSum")
        public Integer nodeSum;

        @NameInMap("Rest")
        public String rest;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransactionSum")
        public Long transactionSum;

        public static DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList self = new DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setConsortiumMember(Boolean consortiumMember) {
            this.consortiumMember = consortiumMember;
            return this;
        }
        public Boolean getConsortiumMember() {
            return this.consortiumMember;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setMonitor(Boolean monitor) {
            this.monitor = monitor;
            return this;
        }
        public Boolean getMonitor() {
            return this.monitor;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setNodeSum(Integer nodeSum) {
            this.nodeSum = nodeSum;
            return this;
        }
        public Integer getNodeSum() {
            return this.nodeSum;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setRest(String rest) {
            this.rest = rest;
            return this;
        }
        public String getRest() {
            return this.rest;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList setTransactionSum(Long transactionSum) {
            this.transactionSum = transactionSum;
            return this;
        }
        public Long getTransactionSum() {
            return this.transactionSum;
        }

    }

    public static class DescribeAntChainSubnetListResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("BlockchainName")
        public String blockchainName;

        @NameInMap("BlockchainSubnetList")
        public java.util.List<DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList> blockchainSubnetList;

        @NameInMap("ConsortiumAdmin")
        public Boolean consortiumAdmin;

        public static DescribeAntChainSubnetListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainSubnetListResponseBodyResult self = new DescribeAntChainSubnetListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainSubnetListResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainSubnetListResponseBodyResult setBlockchainName(String blockchainName) {
            this.blockchainName = blockchainName;
            return this;
        }
        public String getBlockchainName() {
            return this.blockchainName;
        }

        public DescribeAntChainSubnetListResponseBodyResult setBlockchainSubnetList(java.util.List<DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList> blockchainSubnetList) {
            this.blockchainSubnetList = blockchainSubnetList;
            return this;
        }
        public java.util.List<DescribeAntChainSubnetListResponseBodyResultBlockchainSubnetList> getBlockchainSubnetList() {
            return this.blockchainSubnetList;
        }

        public DescribeAntChainSubnetListResponseBodyResult setConsortiumAdmin(Boolean consortiumAdmin) {
            this.consortiumAdmin = consortiumAdmin;
            return this;
        }
        public Boolean getConsortiumAdmin() {
            return this.consortiumAdmin;
        }

    }

}
