// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainsV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DBD6C69E-22B9-419E-B072-7A715F3AA330</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainsV2ResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainsV2ResponseBody self = new DescribeAntChainsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainsV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainsV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainsV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainsV2ResponseBody setResult(DescribeAntChainsV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainsV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainsV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainsV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainsV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainsV2ResponseBodyResultAntChains extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("AntChainName")
        public String antChainName;

        /**
         * <strong>example:</strong>
         * <p>Contract</p>
         */
        @NameInMap("ChainType")
        public String chainType;

        /**
         * <strong>example:</strong>
         * <p>classic</p>
         */
        @NameInMap("CipherSuit")
        public String cipherSuit;

        /**
         * <strong>example:</strong>
         * <p>1609221924000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1672329600000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN202012291405173265824745109</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        /**
         * <strong>example:</strong>
         * <p>ChainApplied</p>
         */
        @NameInMap("MemberStatus")
        public String memberStatus;

        /**
         * <strong>example:</strong>
         * <p>fdmt</p>
         */
        @NameInMap("MerkleTreeSuit")
        public String merkleTreeSuit;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MonitorStatus")
        public Boolean monitorStatus;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        @NameInMap("ResourceSize")
        public String resourceSize;

        /**
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("RestStatus")
        public String restStatus;

        /**
         * <strong>example:</strong>
         * <p>rsa</p>
         */
        @NameInMap("TlsAlgo")
        public String tlsAlgo;

        /**
         * <strong>example:</strong>
         * <p>2.19.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeAntChainsV2ResponseBodyResultAntChains build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainsV2ResponseBodyResultAntChains self = new DescribeAntChainsV2ResponseBodyResultAntChains();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setAntChainName(String antChainName) {
            this.antChainName = antChainName;
            return this;
        }
        public String getAntChainName() {
            return this.antChainName;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setChainType(String chainType) {
            this.chainType = chainType;
            return this;
        }
        public String getChainType() {
            return this.chainType;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setCipherSuit(String cipherSuit) {
            this.cipherSuit = cipherSuit;
            return this;
        }
        public String getCipherSuit() {
            return this.cipherSuit;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setMemberStatus(String memberStatus) {
            this.memberStatus = memberStatus;
            return this;
        }
        public String getMemberStatus() {
            return this.memberStatus;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setMerkleTreeSuit(String merkleTreeSuit) {
            this.merkleTreeSuit = merkleTreeSuit;
            return this;
        }
        public String getMerkleTreeSuit() {
            return this.merkleTreeSuit;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setMonitorStatus(Boolean monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public Boolean getMonitorStatus() {
            return this.monitorStatus;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setResourceSize(String resourceSize) {
            this.resourceSize = resourceSize;
            return this;
        }
        public String getResourceSize() {
            return this.resourceSize;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setRestStatus(String restStatus) {
            this.restStatus = restStatus;
            return this;
        }
        public String getRestStatus() {
            return this.restStatus;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setTlsAlgo(String tlsAlgo) {
            this.tlsAlgo = tlsAlgo;
            return this;
        }
        public String getTlsAlgo() {
            return this.tlsAlgo;
        }

        public DescribeAntChainsV2ResponseBodyResultAntChains setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAntChainsV2ResponseBodyResultPagination extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainsV2ResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainsV2ResponseBodyResultPagination self = new DescribeAntChainsV2ResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainsV2ResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainsV2ResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainsV2ResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainsV2ResponseBodyResult extends TeaModel {
        @NameInMap("AntChains")
        public java.util.List<DescribeAntChainsV2ResponseBodyResultAntChains> antChains;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsExist")
        public Boolean isExist;

        @NameInMap("Pagination")
        public DescribeAntChainsV2ResponseBodyResultPagination pagination;

        public static DescribeAntChainsV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainsV2ResponseBodyResult self = new DescribeAntChainsV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainsV2ResponseBodyResult setAntChains(java.util.List<DescribeAntChainsV2ResponseBodyResultAntChains> antChains) {
            this.antChains = antChains;
            return this;
        }
        public java.util.List<DescribeAntChainsV2ResponseBodyResultAntChains> getAntChains() {
            return this.antChains;
        }

        public DescribeAntChainsV2ResponseBodyResult setIsExist(Boolean isExist) {
            this.isExist = isExist;
            return this;
        }
        public Boolean getIsExist() {
            return this.isExist;
        }

        public DescribeAntChainsV2ResponseBodyResult setPagination(DescribeAntChainsV2ResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainsV2ResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
