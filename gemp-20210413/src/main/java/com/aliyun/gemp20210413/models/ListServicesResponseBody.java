// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListServicesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponseBody self = new ListServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServicesResponseBody setData(java.util.List<ListServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServicesResponseBodyData> getData() {
        return this.data;
    }

    public ListServicesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListServicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListServicesResponseBodyData extends TeaModel {
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        @NameInMap("escalationPlanName")
        public String escalationPlanName;

        @NameInMap("isValid")
        public Integer isValid;

        /**
         * <strong>example:</strong>
         * <p>服务描述</p>
         */
        @NameInMap("serviceDescription")
        public String serviceDescription;

        @NameInMap("serviceGroupIdList")
        public java.util.List<Long> serviceGroupIdList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("serviceId")
        public Long serviceId;

        /**
         * <strong>example:</strong>
         * <p>冲上云霄</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 14:30:30</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyData self = new ListServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyData setEscalationPlanId(Long escalationPlanId) {
            this.escalationPlanId = escalationPlanId;
            return this;
        }
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        public ListServicesResponseBodyData setEscalationPlanName(String escalationPlanName) {
            this.escalationPlanName = escalationPlanName;
            return this;
        }
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        public ListServicesResponseBodyData setIsValid(Integer isValid) {
            this.isValid = isValid;
            return this;
        }
        public Integer getIsValid() {
            return this.isValid;
        }

        public ListServicesResponseBodyData setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public ListServicesResponseBodyData setServiceGroupIdList(java.util.List<Long> serviceGroupIdList) {
            this.serviceGroupIdList = serviceGroupIdList;
            return this;
        }
        public java.util.List<Long> getServiceGroupIdList() {
            return this.serviceGroupIdList;
        }

        public ListServicesResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public ListServicesResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServicesResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
