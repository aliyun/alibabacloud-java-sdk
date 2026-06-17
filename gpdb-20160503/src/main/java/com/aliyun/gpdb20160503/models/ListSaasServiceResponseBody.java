// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSaasServiceResponseBody extends TeaModel {
    /**
     * <p>The list of service details.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListSaasServiceResponseBodyItems> items;

    /**
     * <p>The maximum number of entries returned in this request. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query to begin with.</p>
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

    public static class ListSaasServiceResponseBodyItems extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-09T04:54:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The computing resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cu")
        public Integer cu;

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
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * <li><strong>PREPAY</strong>: subscription.</li>
         * </ul>
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
         * <p>The service type:</p>
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
         * <p>The service status:</p>
         * <ul>
         * <li>active: Running</li>
         * <li>creating: Being created</li>
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
