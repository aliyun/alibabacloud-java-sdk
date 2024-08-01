// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddrAttributeInfoResponseBody extends TeaModel {
    /**
     * <p>The addresses that were queried.</p>
     */
    @NameInMap("Addr")
    public DescribeDnsGtmAddrAttributeInfoResponseBodyAddr addr;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDnsGtmAddrAttributeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAddrAttributeInfoResponseBody self = new DescribeDnsGtmAddrAttributeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAddrAttributeInfoResponseBody setAddr(DescribeDnsGtmAddrAttributeInfoResponseBodyAddr addr) {
        this.addr = addr;
        return this;
    }
    public DescribeDnsGtmAddrAttributeInfoResponseBodyAddr getAddr() {
        return this.addr;
    }

    public DescribeDnsGtmAddrAttributeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo extends TeaModel {
        /**
         * <p>The parent line code of the source region.</p>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        @NameInMap("FatherCode")
        public String fatherCode;

        /**
         * <p>The code of the source region group.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <p>The name of the source region group.</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The line code of the source region.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>The line name of the source region.</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("LineName")
        public String lineName;

        public static DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo self = new DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr extends TeaModel {
        /**
         * <p>The address that was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The source region of the address.</p>
         */
        @NameInMap("AttributeInfo")
        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo attributeInfo;

        public static DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr self = new DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr setAttributeInfo(DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddrAttributeInfo getAttributeInfo() {
            return this.attributeInfo;
        }

    }

    public static class DescribeDnsGtmAddrAttributeInfoResponseBodyAddr extends TeaModel {
        @NameInMap("Addr")
        public java.util.List<DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr> addr;

        public static DescribeDnsGtmAddrAttributeInfoResponseBodyAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAddrAttributeInfoResponseBodyAddr self = new DescribeDnsGtmAddrAttributeInfoResponseBodyAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBodyAddr setAddr(java.util.List<DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr> addr) {
            this.addr = addr;
            return this;
        }
        public java.util.List<DescribeDnsGtmAddrAttributeInfoResponseBodyAddrAddr> getAddr() {
            return this.addr;
        }

    }

}
