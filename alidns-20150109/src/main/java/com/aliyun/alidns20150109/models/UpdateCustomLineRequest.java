// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCustomLineRequest extends TeaModel {
    /**
     * <p>The list of IP ranges. Use a hyphen (-) to separate the start and end IP addresses. Specify one IP segment per line. You can specify 1 to 50 IP ranges. To specify a single IP address, use the format IP1-IP1. The IP ranges cannot overlap.</p>
     */
    @NameInMap("IpSegment")
    public java.util.List<UpdateCustomLineRequestIpSegment> ipSegment;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique ID of the custom line. You can call <a href="https://help.aliyun.com/document_detail/2355671.html">DescribeCustomLines</a> to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1*******</p>
     */
    @NameInMap("LineId")
    public Long lineId;

    /**
     * <p>The name of the custom line. The name must be 1 to 20 characters long and can contain Chinese characters, letters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>望京线路</p>
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
         * <p>The end IP address of the IP range.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.XX.XX</p>
         */
        @NameInMap("EndIp")
        public String endIp;

        /**
         * <p>The start IP address of the IP range.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
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
