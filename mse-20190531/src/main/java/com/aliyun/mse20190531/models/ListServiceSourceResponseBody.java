// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListServiceSourceResponseBody extends TeaModel {
    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("Data")
    public java.util.List<ListServiceSourceResponseBodyData> data;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>clusterNotFound</p>
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
        @NameInMap("EnableIngress")
        public Boolean enableIngress;

        @NameInMap("EnableStatus")
        public Boolean enableStatus;

        @NameInMap("IngressClass")
        public String ingressClass;

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
        @NameInMap("Address")
        public String address;

        @NameInMap("BindingWithGateway")
        public Integer bindingWithGateway;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupList")
        public java.util.List<String> groupList;

        /**
         * <p>systemError</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IngressOptions")
        public ListServiceSourceResponseBodyDataIngressOptions ingressOptions;

        /**
         * <p>system error</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PathList")
        public java.util.List<String> pathList;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceUniqueId")
        public String sourceUniqueId;

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
