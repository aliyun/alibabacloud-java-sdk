// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    /**
     * <p>The list of workspace details.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListWorkspacesResponseBodyItems> items;

    /**
     * <p>The maximum number of entries to return. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
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

    public ListWorkspacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkspacesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListWorkspacesResponseBodyItemsApikeysAuthServices extends TeaModel {
        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-eqxwj5tj5ojx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li>memory</li>
         * <li>drama</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>drama</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        public static ListWorkspacesResponseBodyItemsApikeysAuthServices build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyItemsApikeysAuthServices self = new ListWorkspacesResponseBodyItemsApikeysAuthServices();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyItemsApikeysAuthServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListWorkspacesResponseBodyItemsApikeysAuthServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

    public static class ListWorkspacesResponseBodyItemsApikeys extends TeaModel {
        /**
         * <p>The services authorized for the API key.</p>
         */
        @NameInMap("AuthServices")
        public java.util.List<ListWorkspacesResponseBodyItemsApikeysAuthServices> authServices;

        /**
         * <p>The creation time of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-09T02:26:48Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>my api key</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxx</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The name of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>my-apikey</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>The prefix of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxxxx</p>
         */
        @NameInMap("KeyPrefix")
        public String keyPrefix;

        public static ListWorkspacesResponseBodyItemsApikeys build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyItemsApikeys self = new ListWorkspacesResponseBodyItemsApikeys();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyItemsApikeys setAuthServices(java.util.List<ListWorkspacesResponseBodyItemsApikeysAuthServices> authServices) {
            this.authServices = authServices;
            return this;
        }
        public java.util.List<ListWorkspacesResponseBodyItemsApikeysAuthServices> getAuthServices() {
            return this.authServices;
        }

        public ListWorkspacesResponseBodyItemsApikeys setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyItemsApikeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspacesResponseBodyItemsApikeys setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public ListWorkspacesResponseBodyItemsApikeys setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public ListWorkspacesResponseBodyItemsApikeys setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

    }

    public static class ListWorkspacesResponseBodyItemsServices extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-09T02:26:48Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The compute resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-26T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The billing type. Valid values:</p>
         * <ul>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * <li><strong>PREPAY</strong>: subscription.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not specified, the default value is pay-as-you-go.</li>
         * <li>In subscription billing mode, a discount is available when you purchase a duration of one year or longer. Select the billing type as needed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>[Deprecated]</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated</p>
         */
        @NameInMap("Plan")
        public String plan;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-xxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-xxxx</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li>memory</li>
         * <li>drama</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The service status. Valid values:</p>
         * <ul>
         * <li>creating: The service is being created.</li>
         * <li>active: The service is running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListWorkspacesResponseBodyItemsServices build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyItemsServices self = new ListWorkspacesResponseBodyItemsServices();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyItemsServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyItemsServices setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListWorkspacesResponseBodyItemsServices setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListWorkspacesResponseBodyItemsServices setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public ListWorkspacesResponseBodyItemsServices setPlan(String plan) {
            this.plan = plan;
            return this;
        }
        public String getPlan() {
            return this.plan;
        }

        public ListWorkspacesResponseBodyItemsServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListWorkspacesResponseBodyItemsServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListWorkspacesResponseBodyItemsServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListWorkspacesResponseBodyItemsServices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListWorkspacesResponseBodyItems extends TeaModel {
        /**
         * <p>The list of API keys for the workspace.</p>
         */
        @NameInMap("Apikeys")
        public java.util.List<ListWorkspacesResponseBodyItemsApikeys> apikeys;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-09T04:54:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The services in the workspace.</p>
         */
        @NameInMap("Services")
        public java.util.List<ListWorkspacesResponseBodyItemsServices> services;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-ws-wkb4fp3j9u79ha</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The workspace name.</p>
         * <ul>
         * <li>Maximum length: 50.</li>
         * <li>Must be unique.</li>
         * <li>Special characters are not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>anchashid8FocugQ.oxs.xaliyun.com/oxspopscand8FocugQ#</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListWorkspacesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyItems self = new ListWorkspacesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyItems setApikeys(java.util.List<ListWorkspacesResponseBodyItemsApikeys> apikeys) {
            this.apikeys = apikeys;
            return this;
        }
        public java.util.List<ListWorkspacesResponseBodyItemsApikeys> getApikeys() {
            return this.apikeys;
        }

        public ListWorkspacesResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyItems setServices(java.util.List<ListWorkspacesResponseBodyItemsServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<ListWorkspacesResponseBodyItemsServices> getServices() {
            return this.services;
        }

        public ListWorkspacesResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListWorkspacesResponseBodyItems setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
