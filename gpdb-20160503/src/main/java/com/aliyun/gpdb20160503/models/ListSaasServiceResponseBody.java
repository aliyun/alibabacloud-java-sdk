// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSaasServiceResponseBody extends TeaModel {
    /**
     * <p>The list of instance details.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListSaasServiceResponseBodyItems> items;

    /**
     * <p>The maximum number of entries to return. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34b32a0a-08ef-4a87-b6be-cdd9f56fc3ad</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListSaasServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSaasServiceResponseBody self = new ListSaasServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSaasServiceResponseBody setItems(java.util.List<ListSaasServiceResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSaasServiceResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSaasServiceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSaasServiceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSaasServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSaasServiceResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListSaasServiceResponseBodyItemsComponents extends TeaModel {
        /**
         * <p>The component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0644c5aa-5306-478b-ac39-bb4660cdc9f7</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The type of the subcomponent.</p>
         * 
         * <strong>example:</strong>
         * <p>gamestudio</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-09T04:54:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The compute resource of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The release protection status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The service status. Valid values:</p>
         * <ul>
         * <li>active: Running.</li>
         * <li>creating: Being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListSaasServiceResponseBodyItemsComponents build(java.util.Map<String, ?> map) throws Exception {
            ListSaasServiceResponseBodyItemsComponents self = new ListSaasServiceResponseBodyItemsComponents();
            return TeaModel.build(map, self);
        }

        public ListSaasServiceResponseBodyItemsComponents setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public ListSaasServiceResponseBodyItemsComponents setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public ListSaasServiceResponseBodyItemsComponents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSaasServiceResponseBodyItemsComponents setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListSaasServiceResponseBodyItemsComponents setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public ListSaasServiceResponseBodyItemsComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListSaasServiceResponseBodyItems extends TeaModel {
        /**
         * <p>The list of service subcomponents.</p>
         */
        @NameInMap("Components")
        public java.util.List<ListSaasServiceResponseBodyItemsComponents> components;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-09T04:54:08Z</p>
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
        public Integer cu;

        /**
         * <p>Indicates whether the release protection feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-15T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The billing type. Valid values:</p>
         * <ul>
         * <li><strong>POSTPAY</strong>: Pay-as-you-go.</li>
         * <li><strong>PREPAY</strong>: Subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p><strong>[Deprecated]</strong></p>
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
         * <li><strong>memory</strong></li>
         * <li><strong>drama</strong></li>
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
         * <li>active: Running.</li>
         * <li>creating: Being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListSaasServiceResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSaasServiceResponseBodyItems self = new ListSaasServiceResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSaasServiceResponseBodyItems setComponents(java.util.List<ListSaasServiceResponseBodyItemsComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<ListSaasServiceResponseBodyItemsComponents> getComponents() {
            return this.components;
        }

        public ListSaasServiceResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSaasServiceResponseBodyItems setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public ListSaasServiceResponseBodyItems setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public ListSaasServiceResponseBodyItems setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListSaasServiceResponseBodyItems setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public ListSaasServiceResponseBodyItems setPlan(String plan) {
            this.plan = plan;
            return this;
        }
        public String getPlan() {
            return this.plan;
        }

        public ListSaasServiceResponseBodyItems setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListSaasServiceResponseBodyItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListSaasServiceResponseBodyItems setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListSaasServiceResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
