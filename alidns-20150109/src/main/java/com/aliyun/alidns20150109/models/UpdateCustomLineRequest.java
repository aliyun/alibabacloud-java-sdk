// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCustomLineRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("LineName")
    public String lineName;

    @NameInMap("IpSegment")
    public java.util.List<UpdateCustomLineRequestIpSegment> ipSegment;

    @NameInMap("LineId")
    @Validation(required = true)
    public Long lineId;

    public static UpdateCustomLineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomLineRequest self = new UpdateCustomLineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomLineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateCustomLineRequest setLineName(String lineName) {
        this.lineName = lineName;
        return this;
    }
    public String getLineName() {
        return this.lineName;
    }

    public UpdateCustomLineRequest setIpSegment(java.util.List<UpdateCustomLineRequestIpSegment> ipSegment) {
        this.ipSegment = ipSegment;
        return this;
    }
    public java.util.List<UpdateCustomLineRequestIpSegment> getIpSegment() {
        return this.ipSegment;
    }

    public UpdateCustomLineRequest setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }
    public Long getLineId() {
        return this.lineId;
    }

    public static class UpdateCustomLineRequestIpSegment extends TeaModel {
        @NameInMap("StartIp")
        public String startIp;

        @NameInMap("EndIp")
        public String endIp;

        public static UpdateCustomLineRequestIpSegment build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomLineRequestIpSegment self = new UpdateCustomLineRequestIpSegment();
            return TeaModel.build(map, self);
        }

        public UpdateCustomLineRequestIpSegment setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

        public UpdateCustomLineRequestIpSegment setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

    }

}
