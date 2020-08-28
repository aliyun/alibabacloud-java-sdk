// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListUserServiceInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UbsmsStatus")
    @Validation(required = true)
    public String ubsmsStatus;

    @NameInMap("ServiceInfos")
    @Validation(required = true)
    public java.util.List<ListUserServiceInfosResponseServiceInfos> serviceInfos;

    public static ListUserServiceInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserServiceInfosResponse self = new ListUserServiceInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListUserServiceInfosResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserServiceInfosResponse setUbsmsStatus(String ubsmsStatus) {
        this.ubsmsStatus = ubsmsStatus;
        return this;
    }
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public ListUserServiceInfosResponse setServiceInfos(java.util.List<ListUserServiceInfosResponseServiceInfos> serviceInfos) {
        this.serviceInfos = serviceInfos;
        return this;
    }
    public java.util.List<ListUserServiceInfosResponseServiceInfos> getServiceInfos() {
        return this.serviceInfos;
    }

    public static class ListUserServiceInfosResponseServiceInfos extends TeaModel {
        @NameInMap("AppKey")
        @Validation(required = true)
        public String appKey;

        @NameInMap("Service")
        @Validation(required = true)
        public String service;

        @NameInMap("ProductId")
        @Validation(required = true)
        public String productId;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("AppType")
        @Validation(required = true)
        public Integer appType;

        public static ListUserServiceInfosResponseServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListUserServiceInfosResponseServiceInfos self = new ListUserServiceInfosResponseServiceInfos();
            return TeaModel.build(map, self);
        }

        public ListUserServiceInfosResponseServiceInfos setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListUserServiceInfosResponseServiceInfos setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListUserServiceInfosResponseServiceInfos setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListUserServiceInfosResponseServiceInfos setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListUserServiceInfosResponseServiceInfos setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListUserServiceInfosResponseServiceInfos setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListUserServiceInfosResponseServiceInfos setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

    }

}
