// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListStreamingDataServicesResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns real-time data service items</p>
     */
    @NameInMap("ServiceItems")
    public java.util.List<ListStreamingDataServicesResponseBodyServiceItems> serviceItems;

    /**
     * <p>Total record count.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListStreamingDataServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStreamingDataServicesResponseBody self = new ListStreamingDataServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStreamingDataServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStreamingDataServicesResponseBody setServiceItems(java.util.List<ListStreamingDataServicesResponseBodyServiceItems> serviceItems) {
        this.serviceItems = serviceItems;
        return this;
    }
    public java.util.List<ListStreamingDataServicesResponseBodyServiceItems> getServiceItems() {
        return this.serviceItems;
    }

    public ListStreamingDataServicesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListStreamingDataServicesResponseBodyServiceItems extends TeaModel {
        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Last modified time</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T17:00:00Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Service description.</p>
         * 
         * <strong>example:</strong>
         * <p>test-adbpgss</p>
         */
        @NameInMap("ServiceDescription")
        public String serviceDescription;

        /**
         * <p>Service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Service IP.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("ServiceIp")
        public String serviceIp;

        /**
         * <p>Whether it is a managed service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-adbpgss</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>Service owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ServiceOwnerId")
        public String serviceOwnerId;

        /**
         * <p>Service port.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("ServicePort")
        public String servicePort;

        /**
         * <p>Service specification (in CU).</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ServiceSpec")
        public String serviceSpec;

        /**
         * <p>Service type, with the following value:</p>
         * <ul>
         * <li><strong>adbpgss</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>adbpgss</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>Service status, with the following values:</p>
         * <ul>
         * <li><p>Init: Initializing</p>
         * </li>
         * <li><p>Running: In operation</p>
         * </li>
         * <li><p>Exception: Abnormal</p>
         * </li>
         * <li><p>Paused: Suspended</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListStreamingDataServicesResponseBodyServiceItems build(java.util.Map<String, ?> map) throws Exception {
            ListStreamingDataServicesResponseBodyServiceItems self = new ListStreamingDataServicesResponseBodyServiceItems();
            return TeaModel.build(map, self);
        }

        public ListStreamingDataServicesResponseBodyServiceItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setServiceOwnerId(String serviceOwnerId) {
            this.serviceOwnerId = serviceOwnerId;
            return this;
        }
        public String getServiceOwnerId() {
            return this.serviceOwnerId;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setServiceSpec(String serviceSpec) {
            this.serviceSpec = serviceSpec;
            return this;
        }
        public String getServiceSpec() {
            return this.serviceSpec;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListStreamingDataServicesResponseBodyServiceItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
