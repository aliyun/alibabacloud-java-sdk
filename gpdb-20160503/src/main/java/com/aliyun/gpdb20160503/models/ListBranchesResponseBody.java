// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListBranchesResponseBody extends TeaModel {
    @NameInMap("Branches")
    public ListBranchesResponseBodyBranches branches;

    /**
     * <p>The maximum number of records to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The cursor for the paged query. You do not need to specify this parameter for the first request. For subsequent requests, use the NextToken value returned in the previous response for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. The value must be greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>10</li>
     * <li>20</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of branches that match the query criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBranchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBranchesResponseBody self = new ListBranchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBranchesResponseBody setBranches(ListBranchesResponseBodyBranches branches) {
        this.branches = branches;
        return this;
    }
    public ListBranchesResponseBodyBranches getBranches() {
        return this.branches;
    }

    public ListBranchesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBranchesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBranchesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBranchesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBranchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBranchesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBranchesResponseBodyBranchesBranchTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListBranchesResponseBodyBranchesBranchTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListBranchesResponseBodyBranchesBranchTagsTag self = new ListBranchesResponseBodyBranchesBranchTagsTag();
            return TeaModel.build(map, self);
        }

        public ListBranchesResponseBodyBranchesBranchTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBranchesResponseBodyBranchesBranchTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListBranchesResponseBodyBranchesBranchTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListBranchesResponseBodyBranchesBranchTagsTag> tag;

        public static ListBranchesResponseBodyBranchesBranchTags build(java.util.Map<String, ?> map) throws Exception {
            ListBranchesResponseBodyBranchesBranchTags self = new ListBranchesResponseBodyBranchesBranchTags();
            return TeaModel.build(map, self);
        }

        public ListBranchesResponseBodyBranchesBranchTags setTag(java.util.List<ListBranchesResponseBodyBranchesBranchTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListBranchesResponseBodyBranchesBranchTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListBranchesResponseBodyBranchesBranch extends TeaModel {
        @NameInMap("BranchId")
        public String branchId;

        @NameInMap("BranchName")
        public String branchName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("InitSource")
        public String initSource;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("ParentBranchId")
        public String parentBranchId;

        @NameInMap("ParentBranchName")
        public String parentBranchName;

        @NameInMap("ParentLSN")
        public String parentLSN;

        @NameInMap("ParentTimestamp")
        public String parentTimestamp;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Protected")
        public Boolean _protected;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public ListBranchesResponseBodyBranchesBranchTags tags;

        public static ListBranchesResponseBodyBranchesBranch build(java.util.Map<String, ?> map) throws Exception {
            ListBranchesResponseBodyBranchesBranch self = new ListBranchesResponseBodyBranchesBranch();
            return TeaModel.build(map, self);
        }

        public ListBranchesResponseBodyBranchesBranch setBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }
        public String getBranchId() {
            return this.branchId;
        }

        public ListBranchesResponseBodyBranchesBranch setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public ListBranchesResponseBodyBranchesBranch setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBranchesResponseBodyBranchesBranch setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBranchesResponseBodyBranchesBranch setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ListBranchesResponseBodyBranchesBranch setInitSource(String initSource) {
            this.initSource = initSource;
            return this;
        }
        public String getInitSource() {
            return this.initSource;
        }

        public ListBranchesResponseBodyBranchesBranch setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListBranchesResponseBodyBranchesBranch setParentBranchId(String parentBranchId) {
            this.parentBranchId = parentBranchId;
            return this;
        }
        public String getParentBranchId() {
            return this.parentBranchId;
        }

        public ListBranchesResponseBodyBranchesBranch setParentBranchName(String parentBranchName) {
            this.parentBranchName = parentBranchName;
            return this;
        }
        public String getParentBranchName() {
            return this.parentBranchName;
        }

        public ListBranchesResponseBodyBranchesBranch setParentLSN(String parentLSN) {
            this.parentLSN = parentLSN;
            return this;
        }
        public String getParentLSN() {
            return this.parentLSN;
        }

        public ListBranchesResponseBodyBranchesBranch setParentTimestamp(String parentTimestamp) {
            this.parentTimestamp = parentTimestamp;
            return this;
        }
        public String getParentTimestamp() {
            return this.parentTimestamp;
        }

        public ListBranchesResponseBodyBranchesBranch setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListBranchesResponseBodyBranchesBranch set_protected(Boolean _protected) {
            this._protected = _protected;
            return this;
        }
        public Boolean get_protected() {
            return this._protected;
        }

        public ListBranchesResponseBodyBranchesBranch setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListBranchesResponseBodyBranchesBranch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBranchesResponseBodyBranchesBranch setTags(ListBranchesResponseBodyBranchesBranchTags tags) {
            this.tags = tags;
            return this;
        }
        public ListBranchesResponseBodyBranchesBranchTags getTags() {
            return this.tags;
        }

    }

    public static class ListBranchesResponseBodyBranches extends TeaModel {
        @NameInMap("Branch")
        public java.util.List<ListBranchesResponseBodyBranchesBranch> branch;

        public static ListBranchesResponseBodyBranches build(java.util.Map<String, ?> map) throws Exception {
            ListBranchesResponseBodyBranches self = new ListBranchesResponseBodyBranches();
            return TeaModel.build(map, self);
        }

        public ListBranchesResponseBodyBranches setBranch(java.util.List<ListBranchesResponseBodyBranchesBranch> branch) {
            this.branch = branch;
            return this;
        }
        public java.util.List<ListBranchesResponseBodyBranchesBranch> getBranch() {
            return this.branch;
        }

    }

}
