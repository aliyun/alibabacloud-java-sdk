// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCustomLineRequest extends TeaModel {
    @NameInMap("IpSegment")
    public java.util.List<UpdateCustomLineRequestIpSegment> ipSegment;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LineId")
    public Long lineId;

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
        @NameInMap("EndIp")
        public String endIp;

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
