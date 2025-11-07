// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyFlowPackageResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>List of returned data.</p>
     */
    @NameInMap("Items")
    public java.util.List<QueryVerifyFlowPackageResponseBodyItems> items;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>969434DF-926B-4997-9881-4DE94E39F805</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the response was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total count.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static QueryVerifyFlowPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVerifyFlowPackageResponseBody self = new QueryVerifyFlowPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVerifyFlowPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVerifyFlowPackageResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryVerifyFlowPackageResponseBody setItems(java.util.List<QueryVerifyFlowPackageResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<QueryVerifyFlowPackageResponseBodyItems> getItems() {
        return this.items;
    }

    public QueryVerifyFlowPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVerifyFlowPackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryVerifyFlowPackageResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class QueryVerifyFlowPackageResponseBodyItemsFlowDetails extends TeaModel {
        /**
         * <p>Total amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Capacity")
        public Double capacity;

        /**
         * <p>Name of the flow package.</p>
         * 
         * <strong>example:</strong>
         * <p>实人认证流量包</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>Remaining amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("CurrCapacity")
        public Double currCapacity;

        /**
         * <p>Proportion of remaining amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("CurrProportion")
        public String currProportion;

        /**
         * <p>Expiration date.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>Instance name</p>
         * 
         * <strong>example:</strong>
         * <p>tf-testacccn-hangzhouapigate84369</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Effective date.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TakeEffectDate")
        public String takeEffectDate;

        public static QueryVerifyFlowPackageResponseBodyItemsFlowDetails build(java.util.Map<String, ?> map) throws Exception {
            QueryVerifyFlowPackageResponseBodyItemsFlowDetails self = new QueryVerifyFlowPackageResponseBodyItemsFlowDetails();
            return TeaModel.build(map, self);
        }

        public QueryVerifyFlowPackageResponseBodyItemsFlowDetails setCapacity(Double capacity) {
            this.capacity = capacity;
            return this;
        }
        public Double getCapacity() {
            return this.capacity;
        }

        public QueryVerifyFlowPackageResponseBodyItemsFlowDetails setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryVerifyFlowPackageResponseBodyItemsFlowDetails setCurrCapacity(Double currCapacity) {
            this.currCapacity = currCapacity;
            return this;
        }
        public Double getCurrCapacity() {
            return this.currCapacity;
        }

        public QueryVerifyFlowPackageResponseBodyItemsFlowDetails setCurrProportion(String currProportion) {
            this.currProportion = currProportion;
            return this;
        }
        public String getCurrProportion() {
            return this.currProportion;
        }

        public QueryVerifyFlowPackageResponseBodyItemsFlowDetails setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public QueryVerifyFlowPackageResponseBodyItemsFlowDetails setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryVerifyFlowPackageResponseBodyItemsFlowDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryVerifyFlowPackageResponseBodyItemsFlowDetails setTakeEffectDate(String takeEffectDate) {
            this.takeEffectDate = takeEffectDate;
            return this;
        }
        public String getTakeEffectDate() {
            return this.takeEffectDate;
        }

    }

    public static class QueryVerifyFlowPackageResponseBodyItems extends TeaModel {
        /**
         * <p>Name of the resource package.</p>
         * 
         * <strong>example:</strong>
         * <p>实人认证流量包</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>Current available capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("CurrCapacity")
        public Double currCapacity;

        /**
         * <p>Proportion of current remaining capacity to total capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>0%</p>
         */
        @NameInMap("CurrProportion")
        public String currProportion;

        /**
         * <p>Details of the flow package.</p>
         */
        @NameInMap("FlowDetails")
        public java.util.List<QueryVerifyFlowPackageResponseBodyItemsFlowDetails> flowDetails;

        /**
         * <p>Total quota.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("TotalCapacity")
        public Double totalCapacity;

        /**
         * <p>Used capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("UsedCapacity")
        public Double usedCapacity;

        public static QueryVerifyFlowPackageResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            QueryVerifyFlowPackageResponseBodyItems self = new QueryVerifyFlowPackageResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public QueryVerifyFlowPackageResponseBodyItems setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryVerifyFlowPackageResponseBodyItems setCurrCapacity(Double currCapacity) {
            this.currCapacity = currCapacity;
            return this;
        }
        public Double getCurrCapacity() {
            return this.currCapacity;
        }

        public QueryVerifyFlowPackageResponseBodyItems setCurrProportion(String currProportion) {
            this.currProportion = currProportion;
            return this;
        }
        public String getCurrProportion() {
            return this.currProportion;
        }

        public QueryVerifyFlowPackageResponseBodyItems setFlowDetails(java.util.List<QueryVerifyFlowPackageResponseBodyItemsFlowDetails> flowDetails) {
            this.flowDetails = flowDetails;
            return this;
        }
        public java.util.List<QueryVerifyFlowPackageResponseBodyItemsFlowDetails> getFlowDetails() {
            return this.flowDetails;
        }

        public QueryVerifyFlowPackageResponseBodyItems setTotalCapacity(Double totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Double getTotalCapacity() {
            return this.totalCapacity;
        }

        public QueryVerifyFlowPackageResponseBodyItems setUsedCapacity(Double usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

    }

}
