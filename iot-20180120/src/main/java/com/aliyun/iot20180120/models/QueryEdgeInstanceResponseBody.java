// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("Data")
    public QueryEdgeInstanceResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the call was successful. true: indicates that the call was successful. false: indicates that the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>199BBC5D-FC99-46CB-88E2-FB98E92446FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned if the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceResponseBody self = new QueryEdgeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceResponseBody setData(QueryEdgeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeInstanceResponseBodyDataInstanceList extends TeaModel {
        /**
         * <p>The time when the edge instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BizEnable")
        public Boolean bizEnable;

        /**
         * <p>The name of the edge instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-17 14:34:28</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        /**
         * <p>The type of the latest deployment task.</p>
         * <ul>
         * <li>deploy: deploys the edge instance.</li>
         * <li>Reset: resets the edge instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2019-07-17 14:51:38</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        /**
         * <p>The name of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>9iqyQAKDb2aYGVKa****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the edge instance was enabled.</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LatestDeploymentStatus")
        public Integer latestDeploymentStatus;

        /**
         * <p>The status of the latest deployment task.</p>
         * <ul>
         * <li>0: The task has not started.</li>
         * <li>1: The task is being processed.</li>
         * <li>2: The task was successful.</li>
         * <li>3: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deploy</p>
         */
        @NameInMap("LatestDeploymentType")
        public String latestDeploymentType;

        /**
         * <strong>example:</strong>
         * <p>test_le1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the RAM role was attached to IoT Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1473922805******:role/aliyuniotaccessingfcrole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The specification of the edge instance.</p>
         * <ul>
         * <li>10: Lite Edition.</li>
         * <li>20: Standard Edition.</li>
         * <li>30: Pro Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-02-19 11:25:48</p>
         */
        @NameInMap("RoleAttachTime")
        public String roleAttachTime;

        /**
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("RoleAttachTimestamp")
        public Long roleAttachTimestamp;

        /**
         * <p>The time when the edge instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunIOTAccessingFCRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The tags of the edge instance.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Spec")
        public Integer spec;

        /**
         * <p>The ID of the edge instance.</p>
         * 
         * <strong>example:</strong>
         * <p>k1:v1,k2:v2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static QueryEdgeInstanceResponseBodyDataInstanceList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceResponseBodyDataInstanceList self = new QueryEdgeInstanceResponseBodyDataInstanceList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setBizEnable(Boolean bizEnable) {
            this.bizEnable = bizEnable;
            return this;
        }
        public Boolean getBizEnable() {
            return this.bizEnable;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setLatestDeploymentStatus(Integer latestDeploymentStatus) {
            this.latestDeploymentStatus = latestDeploymentStatus;
            return this;
        }
        public Integer getLatestDeploymentStatus() {
            return this.latestDeploymentStatus;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setLatestDeploymentType(String latestDeploymentType) {
            this.latestDeploymentType = latestDeploymentType;
            return this;
        }
        public String getLatestDeploymentType() {
            return this.latestDeploymentType;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setRoleAttachTime(String roleAttachTime) {
            this.roleAttachTime = roleAttachTime;
            return this;
        }
        public String getRoleAttachTime() {
            return this.roleAttachTime;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setRoleAttachTimestamp(Long roleAttachTimestamp) {
            this.roleAttachTimestamp = roleAttachTimestamp;
            return this;
        }
        public Long getRoleAttachTimestamp() {
            return this.roleAttachTimestamp;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setSpec(Integer spec) {
            this.spec = spec;
            return this;
        }
        public Integer getSpec() {
            return this.spec;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryEdgeInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>Indicates whether you own the edge instance or you are authorized to use the edge instance.</p>
         * <ul>
         * <li>0: You own the edge instance.</li>
         * <li>1: You are authorized to use the edge instance.</li>
         * </ul>
         */
        @NameInMap("InstanceList")
        public java.util.List<QueryEdgeInstanceResponseBodyDataInstanceList> instanceList;

        /**
         * <p>The number of edge instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>A list of edge instances.</p>
         * 
         * <strong>example:</strong>
         * <p>201</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceResponseBodyData self = new QueryEdgeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceResponseBodyData setInstanceList(java.util.List<QueryEdgeInstanceResponseBodyDataInstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceResponseBodyDataInstanceList> getInstanceList() {
            return this.instanceList;
        }

        public QueryEdgeInstanceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
