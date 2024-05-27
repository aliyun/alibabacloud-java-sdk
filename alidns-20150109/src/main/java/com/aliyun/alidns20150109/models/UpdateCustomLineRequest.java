// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCustomLineRequest extends TeaModel {
    /**
     * <p>The CIDR blocks. Separate IP addresses with a hyphen (-). Enter a CIDR block in each row. You can enter 1 to 50 CIDR blocks at a time. If a CIDR block contains only one IP address, enter the IP address in the format of IP1-IP1. Different CIDR blocks cannot be overlapped.</p>
     */
    @NameInMap("IpSegment")
    public java.util.List<UpdateCustomLineRequestIpSegment> ipSegment;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique ID of the custom line.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LineId")
    public Long lineId;

    /**
     * <p>The name of the custom line. The name must be 1 to 20 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     */
    @NameInMap("LineName")
    public String lineName;

    public static UpdateCustomLineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomLineRequest self = new UpdateCustomLineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomLineRequest setIpSegment(java.util.List<UpdateCustomLineRequestIpSegment> ipSegment) {
        this.ipSegment = ipSegment;
        return this;
    }
    public java.util.List<UpdateCustomLineRequestIpSegment> getIpSegment() {
        return this.ipSegment;
    }

    public UpdateCustomLineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateCustomLineRequest setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }
    public Long getLineId() {
        return this.lineId;
    }

    public UpdateCustomLineRequest setLineName(String lineName) {
        this.lineName = lineName;
        return this;
    }
    public String getLineName() {
        return this.lineName;
    }

    public static class UpdateCustomLineRequestIpSegment extends TeaModel {
        /**
         * <p>The end IP address of the CIDR block.</p>
         */
        @NameInMap("EndIp")
        public String endIp;

        /**
         * <p>The start IP address of the CIDR block.</p>
         */
        @NameInMap("StartIp")
        public String startIp;

        public static UpdateCustomLineRequestIpSegment build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomLineRequestIpSegment self = new UpdateCustomLineRequestIpSegment();
            return TeaModel.build(map, self);
        }

        public UpdateCustomLineRequestIpSegment setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public UpdateCustomLineRequestIpSegment setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

    }

}
