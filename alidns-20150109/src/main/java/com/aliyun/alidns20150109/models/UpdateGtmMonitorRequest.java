// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmMonitorRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    @NameInMap("ProtocolType")
    @Validation(required = true)
    public String protocolType;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("MonitorExtendInfo")
    @Validation(required = true)
    public String monitorExtendInfo;

    @NameInMap("IspCityNode")
    @Validation(required = true)
    public java.util.List<UpdateGtmMonitorRequestIspCityNode> ispCityNode;

    public static UpdateGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmMonitorRequest self = new UpdateGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public static class UpdateGtmMonitorRequestIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        @Validation(required = true)
        public String cityCode;

        @NameInMap("IspCode")
        @Validation(required = true)
        public String ispCode;

        public static UpdateGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            UpdateGtmMonitorRequestIspCityNode self = new UpdateGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

    }

}
