// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddCustomLineRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("LineName")
    @Validation(required = true)
    public String lineName;

    @NameInMap("IpSegment")
    @Validation(required = true)
    public java.util.List<AddCustomLineRequestIpSegment> ipSegment;

    public static AddCustomLineRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLineRequest self = new AddCustomLineRequest();
        return TeaModel.build(map, self);
    }

    public static class AddCustomLineRequestIpSegment extends TeaModel {
        @NameInMap("StartIp")
        public String startIp;

        @NameInMap("EndIp")
        public String endIp;

        public static AddCustomLineRequestIpSegment build(java.util.Map<String, ?> map) throws Exception {
            AddCustomLineRequestIpSegment self = new AddCustomLineRequestIpSegment();
            return TeaModel.build(map, self);
        }

    }

}
