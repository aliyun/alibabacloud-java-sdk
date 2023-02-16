// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListLniPrivateIpAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListLniPrivateIpAddressResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLniPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLniPrivateIpAddressResponseBody self = new ListLniPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IpAddressMac")
        public String ipAddressMac;

        @NameInMap("IpName")
        public String ipName;

        @NameInMap("Message")
        public String message;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        public static ListLniPrivateIpAddressResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListLniPrivateIpAddressResponseBodyContentData self = new ListLniPrivateIpAddressResponseBodyContentData();
            return TeaModel.build(map, self);
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
        @NameInMap("Data")
        public java.util.List<ListLniPrivateIpAddressResponseBodyContentData> data;

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
