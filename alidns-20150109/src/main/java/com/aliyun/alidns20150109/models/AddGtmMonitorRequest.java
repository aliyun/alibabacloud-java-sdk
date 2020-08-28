// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("AddrPoolId")
    @Validation(required = true)
    public String addrPoolId;

    @NameInMap("ProtocolType")
    @Validation(required = true)
    public String protocolType;

    @NameInMap("Interval")
    @Validation(required = true)
    public Integer interval;

    @NameInMap("EvaluationCount")
    @Validation(required = true)
    public Integer evaluationCount;

    @NameInMap("Timeout")
    @Validation(required = true)
    public Integer timeout;

    @NameInMap("MonitorExtendInfo")
    @Validation(required = true)
    public String monitorExtendInfo;

    @NameInMap("IspCityNode")
    @Validation(required = true)
    public java.util.List<AddGtmMonitorRequestIspCityNode> ispCityNode;

    public static AddGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmMonitorRequest self = new AddGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public static class AddGtmMonitorRequestIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        @Validation(required = true)
        public String cityCode;

        @NameInMap("IspCode")
        @Validation(required = true)
        public String ispCode;

        public static AddGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            AddGtmMonitorRequestIspCityNode self = new AddGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

    }

}
