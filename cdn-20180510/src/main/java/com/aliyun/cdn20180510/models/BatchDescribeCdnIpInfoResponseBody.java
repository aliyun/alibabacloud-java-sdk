// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchDescribeCdnIpInfoResponseBody extends TeaModel {
    /**
     * <p>The results about IP addresses returned.</p>
     */
    @NameInMap("IpInfoList")
    public java.util.List<BatchDescribeCdnIpInfoResponseBodyIpInfoList> ipInfoList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>55ADD936-763F-5E1A-BF54-2EA3F6E94A52</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDescribeCdnIpInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDescribeCdnIpInfoResponseBody self = new BatchDescribeCdnIpInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDescribeCdnIpInfoResponseBody setIpInfoList(java.util.List<BatchDescribeCdnIpInfoResponseBodyIpInfoList> ipInfoList) {
        this.ipInfoList = ipInfoList;
        return this;
    }
    public java.util.List<BatchDescribeCdnIpInfoResponseBodyIpInfoList> getIpInfoList() {
        return this.ipInfoList;
    }

    public BatchDescribeCdnIpInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchDescribeCdnIpInfoResponseBodyIpInfoList extends TeaModel {
        /**
         * <p>Indicates whether the IP address belongs to an Alibaba Cloud CDN point of presence (POP).</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CdnIp")
        public String cdnIp;

        /**
         * <p>The city to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The country to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>111.XXX.XXX.230</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The ISP to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Move</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>The province to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("Province")
        public String province;

        public static BatchDescribeCdnIpInfoResponseBodyIpInfoList build(java.util.Map<String, ?> map) throws Exception {
            BatchDescribeCdnIpInfoResponseBodyIpInfoList self = new BatchDescribeCdnIpInfoResponseBodyIpInfoList();
            return TeaModel.build(map, self);
        }

        public BatchDescribeCdnIpInfoResponseBodyIpInfoList setCdnIp(String cdnIp) {
            this.cdnIp = cdnIp;
            return this;
        }
        public String getCdnIp() {
            return this.cdnIp;
        }

        public BatchDescribeCdnIpInfoResponseBodyIpInfoList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public BatchDescribeCdnIpInfoResponseBodyIpInfoList setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public BatchDescribeCdnIpInfoResponseBodyIpInfoList setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public BatchDescribeCdnIpInfoResponseBodyIpInfoList setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public BatchDescribeCdnIpInfoResponseBodyIpInfoList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
