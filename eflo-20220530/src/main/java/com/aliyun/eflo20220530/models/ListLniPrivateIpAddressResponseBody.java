// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListLniPrivateIpAddressResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public ListLniPrivateIpAddressResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>You don\&quot;t have the permission to do this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLniPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLniPrivateIpAddressResponseBody self = new ListLniPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLniPrivateIpAddressResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListLniPrivateIpAddressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListLniPrivateIpAddressResponseBody setContent(ListLniPrivateIpAddressResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListLniPrivateIpAddressResponseBodyContent getContent() {
        return this.content;
    }

    public ListLniPrivateIpAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLniPrivateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLniPrivateIpAddressResponseBodyContentData extends TeaModel {
        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1651734291000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>MAC address of the secondary private network</p>
         * 
         * <strong>example:</strong>
         * <p>00-ff-84-15-ba-67</p>
         */
        @NameInMap("IpAddressMac")
        public String ipAddressMac;

        /**
         * <p>IP unique identifier</p>
         * 
         * <strong>example:</strong>
         * <p>sip-1hq1ql7vz</p>
         */
        @NameInMap("IpName")
        public String ipName;

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Lingjun network interface controller ID</p>
         * 
         * <strong>example:</strong>
         * <p>lni-bp11hq1ql7vza3k4xz7q</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>Secondary private IP address of Lingjun network interface controller</p>
         * 
         * <strong>example:</strong>
         * <p>10.42.5.92</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListLniPrivateIpAddressResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListLniPrivateIpAddressResponseBodyContentData self = new ListLniPrivateIpAddressResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListLniPrivateIpAddressResponseBodyContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLniPrivateIpAddressResponseBodyContentData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListLniPrivateIpAddressResponseBodyContentData setIpAddressMac(String ipAddressMac) {
            this.ipAddressMac = ipAddressMac;
            return this;
        }
        public String getIpAddressMac() {
            return this.ipAddressMac;
        }

        public ListLniPrivateIpAddressResponseBodyContentData setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

        public ListLniPrivateIpAddressResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListLniPrivateIpAddressResponseBodyContentData setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListLniPrivateIpAddressResponseBodyContentData setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public ListLniPrivateIpAddressResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListLniPrivateIpAddressResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLniPrivateIpAddressResponseBodyContent extends TeaModel {
        /**
         * <p>The returned result.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListLniPrivateIpAddressResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListLniPrivateIpAddressResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListLniPrivateIpAddressResponseBodyContent self = new ListLniPrivateIpAddressResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListLniPrivateIpAddressResponseBodyContent setData(java.util.List<ListLniPrivateIpAddressResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListLniPrivateIpAddressResponseBodyContentData> getData() {
            return this.data;
        }

        public ListLniPrivateIpAddressResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
