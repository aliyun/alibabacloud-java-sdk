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

    public static class UpdateCustomLineRequestIpSegment extends TeaModel {
        @NameInMap("StartIp")
        public String startIp;

        @NameInMap("EndIp")
        public String endIp;

        public static UpdateCustomLineRequestIpSegment build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomLineRequestIpSegment self = new UpdateCustomLineRequestIpSegment();
            return TeaModel.build(map, self);
        }

    }

}
