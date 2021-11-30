// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChainResponseBody extends TeaModel {
    @NameInMap("Chains")
    public java.util.List<ListChainResponseBodyChains> chains;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ChainId")
        public String chainId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("ScopeId")
        public String scopeId;

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
