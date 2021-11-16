// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListServicesResponseBodyData> data;

    // 当前页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 页大小
    @NameInMap("pageSize")
    public Long pageSize;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 总条数
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
        // 服务描述
        @NameInMap("serviceDescription")
        public String serviceDescription;

        // 服务ID
        @NameInMap("serviceId")
        public Long serviceId;

        // 服务名字
        @NameInMap("serviceName")
        public String serviceName;

        // 修改时间
        @NameInMap("updateTime")
        public String updateTime;

        public static ListServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyData self = new ListServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyData setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
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
