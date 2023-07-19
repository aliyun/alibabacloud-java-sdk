// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    @NameInMap("ModelServices")
    public java.util.List<ListServicesResponseBodyModelServices> modelServices;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponseBody self = new ListServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServicesResponseBody setModelServices(java.util.List<ListServicesResponseBodyModelServices> modelServices) {
        this.modelServices = modelServices;
        return this;
    }
    public java.util.List<ListServicesResponseBodyModelServices> getModelServices() {
        return this.modelServices;
    }

    public ListServicesResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListServicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServicesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListServicesResponseBodyModelServices extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ModelServiceId")
        public String modelServiceId;

        @NameInMap("Status")
        public String status;

        public static ListServicesResponseBodyModelServices build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyModelServices self = new ListServicesResponseBodyModelServices();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyModelServices setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListServicesResponseBodyModelServices setModelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        public ListServicesResponseBodyModelServices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
