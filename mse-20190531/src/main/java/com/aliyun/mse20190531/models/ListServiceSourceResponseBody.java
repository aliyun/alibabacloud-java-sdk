// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListServiceSourceResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListServiceSourceResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListServiceSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSourceResponseBody self = new ListServiceSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceSourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListServiceSourceResponseBody setData(java.util.List<ListServiceSourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServiceSourceResponseBodyData> getData() {
        return this.data;
    }

    public ListServiceSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListServiceSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServiceSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListServiceSourceResponseBodyDataIngressOptions extends TeaModel {
        /**
         * <p>Indicates whether Ingress is enabled.</p>
         */
        @NameInMap("EnableIngress")
        public Boolean enableIngress;

        /**
         * <p>Indicates whether the Ingress status is updated.</p>
         */
        @NameInMap("EnableStatus")
        public Boolean enableStatus;

        /**
         * <p>The Ingress class.</p>
         */
        @NameInMap("IngressClass")
        public String ingressClass;

        /**
         * <p>The namespace that you want to monitor.</p>
         */
        @NameInMap("WatchNamespace")
        public String watchNamespace;

        public static ListServiceSourceResponseBodyDataIngressOptions build(java.util.Map<String, ?> map) throws Exception {
            ListServiceSourceResponseBodyDataIngressOptions self = new ListServiceSourceResponseBodyDataIngressOptions();
            return TeaModel.build(map, self);
        }

        public ListServiceSourceResponseBodyDataIngressOptions setEnableIngress(Boolean enableIngress) {
            this.enableIngress = enableIngress;
            return this;
        }
        public Boolean getEnableIngress() {
            return this.enableIngress;
        }

        public ListServiceSourceResponseBodyDataIngressOptions setEnableStatus(Boolean enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Boolean getEnableStatus() {
            return this.enableStatus;
        }

        public ListServiceSourceResponseBodyDataIngressOptions setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public ListServiceSourceResponseBodyDataIngressOptions setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

    public static class ListServiceSourceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Container Service for Kubernetes (ACK) cluster or the endpoint of the Microservices Engine (MSE) registry.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>Indicates whether the service source is associated with the gateway. The value 1 indicates that the service source is associated with the gateway.</p>
         */
        @NameInMap("BindingWithGateway")
        public Integer bindingWithGateway;

        /**
         * <p>The ID of the gateway.</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The array of service groups.</p>
         */
        @NameInMap("GroupList")
        public java.util.List<String> groupList;

        /**
         * <p>The ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether Ingress is supported for applications.</p>
         */
        @NameInMap("IngressOptions")
        public ListServiceSourceResponseBodyDataIngressOptions ingressOptions;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The array of root paths of service lists.</p>
         */
        @NameInMap("PathList")
        public java.util.List<String> pathList;

        /**
         * <p>The type of the service source.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The unique ID of the service source.</p>
         */
        @NameInMap("SourceUniqueId")
        public String sourceUniqueId;

        /**
         * <p>The type.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListServiceSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServiceSourceResponseBodyData self = new ListServiceSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServiceSourceResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListServiceSourceResponseBodyData setBindingWithGateway(Integer bindingWithGateway) {
            this.bindingWithGateway = bindingWithGateway;
            return this;
        }
        public Integer getBindingWithGateway() {
            return this.bindingWithGateway;
        }

        public ListServiceSourceResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListServiceSourceResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListServiceSourceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceSourceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceSourceResponseBodyData setGroupList(java.util.List<String> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<String> getGroupList() {
            return this.groupList;
        }

        public ListServiceSourceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceSourceResponseBodyData setIngressOptions(ListServiceSourceResponseBodyDataIngressOptions ingressOptions) {
            this.ingressOptions = ingressOptions;
            return this;
        }
        public ListServiceSourceResponseBodyDataIngressOptions getIngressOptions() {
            return this.ingressOptions;
        }

        public ListServiceSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceSourceResponseBodyData setPathList(java.util.List<String> pathList) {
            this.pathList = pathList;
            return this;
        }
        public java.util.List<String> getPathList() {
            return this.pathList;
        }

        public ListServiceSourceResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListServiceSourceResponseBodyData setSourceUniqueId(String sourceUniqueId) {
            this.sourceUniqueId = sourceUniqueId;
            return this;
        }
        public String getSourceUniqueId() {
            return this.sourceUniqueId;
        }

        public ListServiceSourceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
