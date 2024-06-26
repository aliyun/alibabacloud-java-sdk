// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainsNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainsNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainsNewResponseBody self = new DescribeAntChainsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainsNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainsNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainsNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainsNewResponseBody setResult(DescribeAntChainsNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainsNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainsNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainsNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainsNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainsNewResponseBodyResultAntChains extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("AntChainName")
        public String antChainName;

        @NameInMap("ChainType")
        public String chainType;

        @NameInMap("CipherSuit")
        public String cipherSuit;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("MemberStatus")
        public String memberStatus;

        @NameInMap("MerkleTreeSuit")
        public String merkleTreeSuit;

        @NameInMap("MonitorStatus")
        public Boolean monitorStatus;

        @NameInMap("Network")
        public String network;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceSize")
        public String resourceSize;

        @NameInMap("RestStatus")
        public String restStatus;

        @NameInMap("TlsAlgo")
        public String tlsAlgo;

        @NameInMap("Version")
        public String version;

        public static DescribeAntChainsNewResponseBodyResultAntChains build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainsNewResponseBodyResultAntChains self = new DescribeAntChainsNewResponseBodyResultAntChains();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setAntChainName(String antChainName) {
            this.antChainName = antChainName;
            return this;
        }
        public String getAntChainName() {
            return this.antChainName;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setChainType(String chainType) {
            this.chainType = chainType;
            return this;
        }
        public String getChainType() {
            return this.chainType;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setCipherSuit(String cipherSuit) {
            this.cipherSuit = cipherSuit;
            return this;
        }
        public String getCipherSuit() {
            return this.cipherSuit;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setMemberStatus(String memberStatus) {
            this.memberStatus = memberStatus;
            return this;
        }
        public String getMemberStatus() {
            return this.memberStatus;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setMerkleTreeSuit(String merkleTreeSuit) {
            this.merkleTreeSuit = merkleTreeSuit;
            return this;
        }
        public String getMerkleTreeSuit() {
            return this.merkleTreeSuit;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setMonitorStatus(Boolean monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public Boolean getMonitorStatus() {
            return this.monitorStatus;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setResourceSize(String resourceSize) {
            this.resourceSize = resourceSize;
            return this;
        }
        public String getResourceSize() {
            return this.resourceSize;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setRestStatus(String restStatus) {
            this.restStatus = restStatus;
            return this;
        }
        public String getRestStatus() {
            return this.restStatus;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setTlsAlgo(String tlsAlgo) {
            this.tlsAlgo = tlsAlgo;
            return this;
        }
        public String getTlsAlgo() {
            return this.tlsAlgo;
        }

        public DescribeAntChainsNewResponseBodyResultAntChains setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAntChainsNewResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainsNewResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainsNewResponseBodyResultPagination self = new DescribeAntChainsNewResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainsNewResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainsNewResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainsNewResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainsNewResponseBodyResult extends TeaModel {
        @NameInMap("AntChains")
        public java.util.List<DescribeAntChainsNewResponseBodyResultAntChains> antChains;

        @NameInMap("IsExist")
        public Boolean isExist;

        @NameInMap("Pagination")
        public DescribeAntChainsNewResponseBodyResultPagination pagination;

        public static DescribeAntChainsNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainsNewResponseBodyResult self = new DescribeAntChainsNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainsNewResponseBodyResult setAntChains(java.util.List<DescribeAntChainsNewResponseBodyResultAntChains> antChains) {
            this.antChains = antChains;
            return this;
        }
        public java.util.List<DescribeAntChainsNewResponseBodyResultAntChains> getAntChains() {
            return this.antChains;
        }

        public DescribeAntChainsNewResponseBodyResult setIsExist(Boolean isExist) {
            this.isExist = isExist;
            return this;
        }
        public Boolean getIsExist() {
            return this.isExist;
        }

        public DescribeAntChainsNewResponseBodyResult setPagination(DescribeAntChainsNewResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainsNewResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
