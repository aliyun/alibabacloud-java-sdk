// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>52EC3196-D0B8-4FBE-A8B6-6DDABABE11C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainsResponseBodyResult result;

    public static DescribeAntChainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainsResponseBody self = new DescribeAntChainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainsResponseBody setResult(DescribeAntChainsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainsResponseBodyResultAntChains extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pYogqb9v</p>
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
         * <p>1562847396000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1626019200000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
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

        public static DescribeAntChainsResponseBodyResultAntChains build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainsResponseBodyResultAntChains self = new DescribeAntChainsResponseBodyResultAntChains();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainsResponseBodyResultAntChains setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainsResponseBodyResultAntChains setAntChainName(String antChainName) {
            this.antChainName = antChainName;
            return this;
        }
        public String getAntChainName() {
            return this.antChainName;
        }

        public DescribeAntChainsResponseBodyResultAntChains setChainType(String chainType) {
            this.chainType = chainType;
            return this;
        }
        public String getChainType() {
            return this.chainType;
        }

        public DescribeAntChainsResponseBodyResultAntChains setCipherSuit(String cipherSuit) {
            this.cipherSuit = cipherSuit;
            return this;
        }
        public String getCipherSuit() {
            return this.cipherSuit;
        }

        public DescribeAntChainsResponseBodyResultAntChains setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainsResponseBodyResultAntChains setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeAntChainsResponseBodyResultAntChains setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public DescribeAntChainsResponseBodyResultAntChains setMemberStatus(String memberStatus) {
            this.memberStatus = memberStatus;
            return this;
        }
        public String getMemberStatus() {
            return this.memberStatus;
        }

        public DescribeAntChainsResponseBodyResultAntChains setMerkleTreeSuit(String merkleTreeSuit) {
            this.merkleTreeSuit = merkleTreeSuit;
            return this;
        }
        public String getMerkleTreeSuit() {
            return this.merkleTreeSuit;
        }

        public DescribeAntChainsResponseBodyResultAntChains setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeAntChainsResponseBodyResultAntChains setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeAntChainsResponseBodyResultAntChains setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAntChainsResponseBodyResultAntChains setResourceSize(String resourceSize) {
            this.resourceSize = resourceSize;
            return this;
        }
        public String getResourceSize() {
            return this.resourceSize;
        }

        public DescribeAntChainsResponseBodyResultAntChains setTlsAlgo(String tlsAlgo) {
            this.tlsAlgo = tlsAlgo;
            return this;
        }
        public String getTlsAlgo() {
            return this.tlsAlgo;
        }

        public DescribeAntChainsResponseBodyResultAntChains setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAntChainsResponseBodyResultPagination extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainsResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainsResponseBodyResultPagination self = new DescribeAntChainsResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainsResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainsResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainsResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainsResponseBodyResult extends TeaModel {
        @NameInMap("AntChains")
        public java.util.List<DescribeAntChainsResponseBodyResultAntChains> antChains;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsExist")
        public Boolean isExist;

        @NameInMap("Pagination")
        public DescribeAntChainsResponseBodyResultPagination pagination;

        public static DescribeAntChainsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainsResponseBodyResult self = new DescribeAntChainsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainsResponseBodyResult setAntChains(java.util.List<DescribeAntChainsResponseBodyResultAntChains> antChains) {
            this.antChains = antChains;
            return this;
        }
        public java.util.List<DescribeAntChainsResponseBodyResultAntChains> getAntChains() {
            return this.antChains;
        }

        public DescribeAntChainsResponseBodyResult setIsExist(Boolean isExist) {
            this.isExist = isExist;
            return this;
        }
        public Boolean getIsExist() {
            return this.isExist;
        }

        public DescribeAntChainsResponseBodyResult setPagination(DescribeAntChainsResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainsResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
