// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortCcAttackTopIPResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>24F36D81-5E2D-52E5-9DB6-A3ED23CF271A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The top IP addresses from which most attacks are initiated.</p>
     */
    @NameInMap("TopIp")
    public java.util.List<DescribePortCcAttackTopIPResponseBodyTopIp> topIp;

    public static DescribePortCcAttackTopIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortCcAttackTopIPResponseBody self = new DescribePortCcAttackTopIPResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortCcAttackTopIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortCcAttackTopIPResponseBody setTopIp(java.util.List<DescribePortCcAttackTopIPResponseBodyTopIp> topIp) {
        this.topIp = topIp;
        return this;
    }
    public java.util.List<DescribePortCcAttackTopIPResponseBodyTopIp> getTopIp() {
        return this.topIp;
    }

    public static class DescribePortCcAttackTopIPResponseBodyTopIp extends TeaModel {
        /**
         * <p>The code of the location from which the attack is initiated. For more information, see <a href="https://help.aliyun.com/document_detail/167926.html">Codes of administrative regions in China and codes of countries and areas</a>. For example, <strong>110000</strong> indicates Beijing, China, and <strong>us</strong> indicates the United States.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("AreaId")
        public String areaId;

        /**
         * <p>The number of attacks from the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>33971</p>
         */
        @NameInMap("Pv")
        public Long pv;

        /**
         * <p>The source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>172.18.XX.XX</p>
         */
        @NameInMap("SrcIp")
        public String srcIp;

        public static DescribePortCcAttackTopIPResponseBodyTopIp build(java.util.Map<String, ?> map) throws Exception {
            DescribePortCcAttackTopIPResponseBodyTopIp self = new DescribePortCcAttackTopIPResponseBodyTopIp();
            return TeaModel.build(map, self);
        }

        public DescribePortCcAttackTopIPResponseBodyTopIp setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public DescribePortCcAttackTopIPResponseBodyTopIp setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public DescribePortCcAttackTopIPResponseBodyTopIp setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

    }

}
