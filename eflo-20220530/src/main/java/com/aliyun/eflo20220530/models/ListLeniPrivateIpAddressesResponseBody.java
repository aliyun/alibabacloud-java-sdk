// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListLeniPrivateIpAddressesResponseBody extends TeaModel {
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
     * <p>The response data.</p>
     */
    @NameInMap("Content")
    public ListLeniPrivateIpAddressesResponseBodyContent content;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLeniPrivateIpAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLeniPrivateIpAddressesResponseBody self = new ListLeniPrivateIpAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLeniPrivateIpAddressesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListLeniPrivateIpAddressesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListLeniPrivateIpAddressesResponseBody setContent(ListLeniPrivateIpAddressesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListLeniPrivateIpAddressesResponseBodyContent getContent() {
        return this.content;
    }

    public ListLeniPrivateIpAddressesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLeniPrivateIpAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLeniPrivateIpAddressesResponseBodyContentData extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test_vpn1_pbr_route_54</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Lingjun Elastic Network Interface ID.</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1234****</p>
         */
        @NameInMap("ElasticNetworkInterfaceId")
        public String elasticNetworkInterfaceId;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1675929918000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the certificate was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1675929918000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Lingjun Elastic Network Interface secondary private IP unique identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-8ylg****</p>
         */
        @NameInMap("IpName")
        public String ipName;

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Lingjun Elastic Network Interface secondary private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.****</p>
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

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListLeniPrivateIpAddressesResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListLeniPrivateIpAddressesResponseBodyContentData self = new ListLeniPrivateIpAddressesResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListLeniPrivateIpAddressesResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLeniPrivateIpAddressesResponseBodyContent extends TeaModel {
        /**
         * <p>The response parameters.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListLeniPrivateIpAddressesResponseBodyContentData> data;

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzzka6bnjvbi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListLeniPrivateIpAddressesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListLeniPrivateIpAddressesResponseBodyContent self = new ListLeniPrivateIpAddressesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListLeniPrivateIpAddressesResponseBodyContent setData(java.util.List<ListLeniPrivateIpAddressesResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListLeniPrivateIpAddressesResponseBodyContentData> getData() {
            return this.data;
        }

        public ListLeniPrivateIpAddressesResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListLeniPrivateIpAddressesResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
