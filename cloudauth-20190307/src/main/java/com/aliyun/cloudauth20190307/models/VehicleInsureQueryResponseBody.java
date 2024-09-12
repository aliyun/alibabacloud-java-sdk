// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleInsureQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5A6229C0-E156-48E4-B6EC-0F52********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public VehicleInsureQueryResponseBodyResultObject resultObject;

    public static VehicleInsureQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VehicleInsureQueryResponseBody self = new VehicleInsureQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public VehicleInsureQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VehicleInsureQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VehicleInsureQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VehicleInsureQueryResponseBody setResultObject(VehicleInsureQueryResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VehicleInsureQueryResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VehicleInsureQueryResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;firstInsuranceDate&quot;: &quot;<strong><strong>-</strong>-<strong>&quot;,
         *     &quot;lastInsuranceDate&quot;: &quot;</strong></strong>-<strong>&quot;,
         *     &quot;latestInsuranceDate&quot;: &quot;****-</strong>&quot;,
         *     &quot;latestInsuranceDateStart&quot;: &quot;****-**&quot;
         *   }</p>
         */
        @NameInMap("VehicleInfo")
        public String vehicleInfo;

        public static VehicleInsureQueryResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            VehicleInsureQueryResponseBodyResultObject self = new VehicleInsureQueryResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public VehicleInsureQueryResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public VehicleInsureQueryResponseBodyResultObject setVehicleInfo(String vehicleInfo) {
            this.vehicleInfo = vehicleInfo;
            return this;
        }
        public String getVehicleInfo() {
            return this.vehicleInfo;
        }

    }

}
