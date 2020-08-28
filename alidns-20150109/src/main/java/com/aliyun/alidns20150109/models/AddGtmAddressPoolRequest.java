// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("MinAvailableAddrNum")
    @Validation(required = true)
    public Integer minAvailableAddrNum;

    @NameInMap("Addr")
    @Validation(required = true)
    public java.util.List<AddGtmAddressPoolRequestAddr> addr;

    @NameInMap("MonitorStatus")
    public String monitorStatus;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    @NameInMap("IspCityNode")
    public java.util.List<AddGtmAddressPoolRequestIspCityNode> ispCityNode;

    public static AddGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAddressPoolRequest self = new AddGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public static class AddGtmAddressPoolRequestAddr extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("LbaWeight")
        @Validation(required = true)
        public Integer lbaWeight;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        public static AddGtmAddressPoolRequestAddr build(java.util.Map<String, ?> map) throws Exception {
            AddGtmAddressPoolRequestAddr self = new AddGtmAddressPoolRequestAddr();
            return TeaModel.build(map, self);
        }

    }

    public static class AddGtmAddressPoolRequestIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("IspCode")
        public String ispCode;

        public static AddGtmAddressPoolRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            AddGtmAddressPoolRequestIspCityNode self = new AddGtmAddressPoolRequestIspCityNode();
            return TeaModel.build(map, self);
        }

    }

}
