// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of workspaces.</p>
     */
    @NameInMap("items")
    public java.util.List<ListWorkspacesResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page used for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page. This value is empty if no more pages exist.</p>
     * 
     * <strong>example:</strong>
     * <p>d29ya3NwYWNlLW9mZnNldDo0MA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of workspaces that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkspacesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListWorkspacesResponseBody setItems(java.util.List<ListWorkspacesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListWorkspacesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListWorkspacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkspacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkspacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkspacesResponseBodyItemsNetworkConfigurationVpc extends TeaModel {
        /**
         * <p>Indicates whether the VPC network is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of vSwitch IDs.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the user VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1234567890</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListWorkspacesResponseBodyItemsNetworkConfigurationVpc build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyItemsNetworkConfigurationVpc self = new ListWorkspacesResponseBodyItemsNetworkConfigurationVpc();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyItemsNetworkConfigurationVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListWorkspacesResponseBodyItemsNetworkConfigurationVpc setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListWorkspacesResponseBodyItemsNetworkConfigurationVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListWorkspacesResponseBodyItemsNetworkConfiguration extends TeaModel {
        /**
         * <p>The VPC network configuration of the user.</p>
         */
        @NameInMap("vpc")
        public ListWorkspacesResponseBodyItemsNetworkConfigurationVpc vpc;

        public static ListWorkspacesResponseBodyItemsNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyItemsNetworkConfiguration self = new ListWorkspacesResponseBodyItemsNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyItemsNetworkConfiguration setVpc(ListWorkspacesResponseBodyItemsNetworkConfigurationVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public ListWorkspacesResponseBodyItemsNetworkConfigurationVpc getVpc() {
            return this.vpc;
        }

    }

    public static class ListWorkspacesResponseBodyItems extends TeaModel {
        /**
         * <p>The creation time of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-06T03:56:56Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>production-agents</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network configuration of the workspace.</p>
         */
        @NameInMap("networkConfiguration")
        public ListWorkspacesResponseBodyItemsNetworkConfiguration networkConfiguration;

        /**
         * <p>The region ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The workspace status. Valid values:</p>
         * <ul>
         * <li>Initializing</li>
         * <li>Initialized</li>
         * <li>Deleting</li>
         * <li>Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Initialized</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the tenant to which the workspace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-123456</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListWorkspacesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyItems self = new ListWorkspacesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkspacesResponseBodyItems setNetworkConfiguration(ListWorkspacesResponseBodyItemsNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public ListWorkspacesResponseBodyItemsNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public ListWorkspacesResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWorkspacesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkspacesResponseBodyItems setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListWorkspacesResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
