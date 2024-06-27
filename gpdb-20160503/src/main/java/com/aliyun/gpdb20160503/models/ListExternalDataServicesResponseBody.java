// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListExternalDataServicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried services.</p>
     */
    @NameInMap("ServiceItems")
    public java.util.List<ListExternalDataServicesResponseBodyServiceItems> serviceItems;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListExternalDataServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExternalDataServicesResponseBody self = new ListExternalDataServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExternalDataServicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExternalDataServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExternalDataServicesResponseBody setServiceItems(java.util.List<ListExternalDataServicesResponseBodyServiceItems> serviceItems) {
        this.serviceItems = serviceItems;
        return this;
    }
    public java.util.List<ListExternalDataServicesResponseBodyServiceItems> getServiceItems() {
        return this.serviceItems;
    }

    public ListExternalDataServicesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListExternalDataServicesResponseBodyServiceItems extends TeaModel {
        /**
         * <p>The time when the service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the service was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T17:00:00Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-adbpgss</p>
         */
        @NameInMap("ServiceDescription")
        public String serviceDescription;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-adbpgss</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The specifications of the service. Unit: compute units (CUs).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ServiceSpec")
        public String serviceSpec;

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li>pxf</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pxf</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The status of the service. Valid values:</p>
         * <ul>
         * <li>Init</li>
         * <li>Running</li>
         * <li>Exception</li>
         * <li>Paused</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListExternalDataServicesResponseBodyServiceItems build(java.util.Map<String, ?> map) throws Exception {
            ListExternalDataServicesResponseBodyServiceItems self = new ListExternalDataServicesResponseBodyServiceItems();
            return TeaModel.build(map, self);
        }

        public ListExternalDataServicesResponseBodyServiceItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListExternalDataServicesResponseBodyServiceItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListExternalDataServicesResponseBodyServiceItems setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public ListExternalDataServicesResponseBodyServiceItems setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListExternalDataServicesResponseBodyServiceItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListExternalDataServicesResponseBodyServiceItems setServiceSpec(String serviceSpec) {
            this.serviceSpec = serviceSpec;
            return this;
        }
        public String getServiceSpec() {
            return this.serviceSpec;
        }

        public ListExternalDataServicesResponseBodyServiceItems setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListExternalDataServicesResponseBodyServiceItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
