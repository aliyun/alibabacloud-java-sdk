// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChainResponseBody extends TeaModel {
    /**
     * <p>The list of delivery chains.</p>
     */
    @NameInMap("Chains")
    public java.util.List<ListChainResponseBodyChains> chains;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>85A99B10-3926-5201-958E-C06FA47F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of delivery chains.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChainResponseBody self = new ListChainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChainResponseBody setChains(java.util.List<ListChainResponseBodyChains> chains) {
        this.chains = chains;
        return this;
    }
    public java.util.List<ListChainResponseBodyChains> getChains() {
        return this.chains;
    }

    public ListChainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChainResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListChainResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChainResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChainResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListChainResponseBodyChains extends TeaModel {
        /**
         * <p>The ID of the delivery chain.</p>
         * 
         * <strong>example:</strong>
         * <p>chi-0ops0gsmw5x2****</p>
         */
        @NameInMap("ChainId")
        public String chainId;

        /**
         * <p>The time when the delivery chain was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1638255427000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the delivery chain.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-4cdrlqmhn4gm****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the delivery chain was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1638259914000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The name of the delivery chain.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Repositories to which the delivery chain does not apply.</p>
         */
        @NameInMap("ScopeExclude")
        public java.util.List<String> scopeExclude;

        /**
         * <p>The ID of the delivery chain scope.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-nyrh2oko32xb****</p>
         */
        @NameInMap("ScopeId")
        public String scopeId;

        /**
         * <p>The type of the delivery chain scope.</p>
         * 
         * <strong>example:</strong>
         * <p>REPOSITORY</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        public static ListChainResponseBodyChains build(java.util.Map<String, ?> map) throws Exception {
            ListChainResponseBodyChains self = new ListChainResponseBodyChains();
            return TeaModel.build(map, self);
        }

        public ListChainResponseBodyChains setChainId(String chainId) {
            this.chainId = chainId;
            return this;
        }
        public String getChainId() {
            return this.chainId;
        }

        public ListChainResponseBodyChains setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListChainResponseBodyChains setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListChainResponseBodyChains setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChainResponseBodyChains setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListChainResponseBodyChains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListChainResponseBodyChains setScopeExclude(java.util.List<String> scopeExclude) {
            this.scopeExclude = scopeExclude;
            return this;
        }
        public java.util.List<String> getScopeExclude() {
            return this.scopeExclude;
        }

        public ListChainResponseBodyChains setScopeId(String scopeId) {
            this.scopeId = scopeId;
            return this;
        }
        public String getScopeId() {
            return this.scopeId;
        }

        public ListChainResponseBodyChains setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

    }

}
