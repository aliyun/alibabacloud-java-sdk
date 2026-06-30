// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListModelOperatorServicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public java.util.List<ListModelOperatorServicesResponseBodyServices> services;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListModelOperatorServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelOperatorServicesResponseBody self = new ListModelOperatorServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelOperatorServicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelOperatorServicesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListModelOperatorServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelOperatorServicesResponseBody setServices(java.util.List<ListModelOperatorServicesResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListModelOperatorServicesResponseBodyServices> getServices() {
        return this.services;
    }

    public ListModelOperatorServicesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListModelOperatorServicesResponseBodyServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>agdb-xxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        public static ListModelOperatorServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListModelOperatorServicesResponseBodyServices self = new ListModelOperatorServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListModelOperatorServicesResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

    }

}
