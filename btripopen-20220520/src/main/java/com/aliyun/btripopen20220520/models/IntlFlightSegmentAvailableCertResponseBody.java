// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightSegmentAvailableCertResponseBody extends TeaModel {
    @NameInMap("module")
    public IntlFlightSegmentAvailableCertResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightSegmentAvailableCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightSegmentAvailableCertResponseBody self = new IntlFlightSegmentAvailableCertResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightSegmentAvailableCertResponseBody setModule(IntlFlightSegmentAvailableCertResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightSegmentAvailableCertResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightSegmentAvailableCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightSegmentAvailableCertResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IntlFlightSegmentAvailableCertResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public IntlFlightSegmentAvailableCertResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightSegmentAvailableCertResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertListSegmentPosition extends TeaModel {
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertListSegmentPosition self = new IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertList extends TeaModel {
        @NameInMap("cert_types")
        public java.util.List<Integer> certTypes;

        @NameInMap("segment_position")
        public IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertListSegmentPosition segmentPosition;

        public static IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertList self = new IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertList();
            return TeaModel.build(map, self);
        }

        public IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertList setCertTypes(java.util.List<Integer> certTypes) {
            this.certTypes = certTypes;
            return this;
        }
        public java.util.List<Integer> getCertTypes() {
            return this.certTypes;
        }

        public IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertList setSegmentPosition(IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

    }

    public static class IntlFlightSegmentAvailableCertResponseBodyModule extends TeaModel {
        @NameInMap("segment_available_cert_list")
        public java.util.List<IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertList> segmentAvailableCertList;

        public static IntlFlightSegmentAvailableCertResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightSegmentAvailableCertResponseBodyModule self = new IntlFlightSegmentAvailableCertResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightSegmentAvailableCertResponseBodyModule setSegmentAvailableCertList(java.util.List<IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertList> segmentAvailableCertList) {
            this.segmentAvailableCertList = segmentAvailableCertList;
            return this;
        }
        public java.util.List<IntlFlightSegmentAvailableCertResponseBodyModuleSegmentAvailableCertList> getSegmentAvailableCertList() {
            return this.segmentAvailableCertList;
        }

    }

}
