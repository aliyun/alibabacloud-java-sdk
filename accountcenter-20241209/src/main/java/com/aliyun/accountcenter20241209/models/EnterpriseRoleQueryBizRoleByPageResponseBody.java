// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleQueryBizRoleByPageResponseBody extends TeaModel {
    @NameInMap("BizRoles")
    public java.util.List<EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles> bizRoles;

    @NameInMap("Code")
    public String code;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static EnterpriseRoleQueryBizRoleByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleQueryBizRoleByPageResponseBody self = new EnterpriseRoleQueryBizRoleByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setBizRoles(java.util.List<EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles> bizRoles) {
        this.bizRoles = bizRoles;
        return this;
    }
    public java.util.List<EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles> getBizRoles() {
        return this.bizRoles;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public EnterpriseRoleQueryBizRoleByPageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles extends TeaModel {
        @NameInMap("BizPermissionCount")
        public Integer bizPermissionCount;

        @NameInMap("BizPermissionNameList")
        public java.util.List<String> bizPermissionNameList;

        @NameInMap("BizRoleCode")
        public String bizRoleCode;

        @NameInMap("BizRoleDesc")
        public String bizRoleDesc;

        @NameInMap("BizRoleName")
        public String bizRoleName;

        @NameInMap("GrantedPkCount")
        public Integer grantedPkCount;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SrcType")
        public String srcType;

        public static EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles self = new EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles();
            return TeaModel.build(map, self);
        }

        public EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles setBizPermissionCount(Integer bizPermissionCount) {
            this.bizPermissionCount = bizPermissionCount;
            return this;
        }
        public Integer getBizPermissionCount() {
            return this.bizPermissionCount;
        }

        public EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles setBizPermissionNameList(java.util.List<String> bizPermissionNameList) {
            this.bizPermissionNameList = bizPermissionNameList;
            return this;
        }
        public java.util.List<String> getBizPermissionNameList() {
            return this.bizPermissionNameList;
        }

        public EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles setBizRoleCode(String bizRoleCode) {
            this.bizRoleCode = bizRoleCode;
            return this;
        }
        public String getBizRoleCode() {
            return this.bizRoleCode;
        }

        public EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles setBizRoleDesc(String bizRoleDesc) {
            this.bizRoleDesc = bizRoleDesc;
            return this;
        }
        public String getBizRoleDesc() {
            return this.bizRoleDesc;
        }

        public EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles setBizRoleName(String bizRoleName) {
            this.bizRoleName = bizRoleName;
            return this;
        }
        public String getBizRoleName() {
            return this.bizRoleName;
        }

        public EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles setGrantedPkCount(Integer grantedPkCount) {
            this.grantedPkCount = grantedPkCount;
            return this;
        }
        public Integer getGrantedPkCount() {
            return this.grantedPkCount;
        }

        public EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public EnterpriseRoleQueryBizRoleByPageResponseBodyBizRoles setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

}
