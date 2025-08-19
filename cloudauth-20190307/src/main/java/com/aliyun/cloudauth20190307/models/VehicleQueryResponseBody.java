// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleQueryResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>D6163397-15C5-419C-9ACC-B7C83*******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Request result</p>
     */
    @NameInMap("ResultObject")
    public VehicleQueryResponseBodyResultObject resultObject;

    public static VehicleQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VehicleQueryResponseBody self = new VehicleQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public VehicleQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VehicleQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VehicleQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VehicleQueryResponseBody setResultObject(VehicleQueryResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VehicleQueryResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VehicleQueryResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification result code:</p>
         * <blockquote>
         * <ul>
         * <li>1: Found (charged)</li>
         * <li>3: No record found (not charged)</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Vehicle information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;approvedCount&quot;: 7,
         *     &quot;approvedLoad&quot;: 0,
         *     &quot;axleCount&quot;: 2,
         *     &quot;backWheelDistance&quot;: 1585,
         *     &quot;brand&quot;: &quot;雷克萨斯&quot;,
         *     &quot;compulsoryScrapTo&quot;: &quot;<strong><strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
         *     &quot;displacement&quot;: 4608,
         *     &quot;engineNo&quot;: &quot;1UR0</strong>**</strong>&quot;,
         *     &quot;engineType&quot;: &quot;1**&quot;,
         *     &quot;frontWheelDistance&quot;: 1585,
         *     &quot;fuelType&quot;: &quot;汽油&quot;,
         *     &quot;high&quot;: 1860,
         *     &quot;inspectionResultEffectiveTo&quot;: &quot;<strong><strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
         *     &quot;modelNo&quot;: &quot;UR</strong>*</strong>-<strong><strong><strong>&quot;,
         *     &quot;power&quot;: 228,
         *     &quot;registrationDate&quot;: &quot;</strong></strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
         *     &quot;releaseDate&quot;: &quot;&quot;,
         *     &quot;state&quot;: &quot;0&quot;,
         *     &quot;stateDesc&quot;: &quot;正常&quot;,
         *     &quot;totalMass&quot;: 2940,
         *     &quot;unladenMass&quot;: 2350,
         *     &quot;useProperty&quot;: 0,
         *     &quot;usePropertyDesc&quot;: &quot;非营运&quot;,
         *     &quot;long&quot;: 4890,
         *     &quot;vin&quot;: &quot;A</strong>*********&quot;,
         *     &quot;wheelBase&quot;: 2790,
         *     &quot;wide&quot;: 1910
         * }</p>
         */
        @NameInMap("VehicleInfo")
        public String vehicleInfo;

        public static VehicleQueryResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            VehicleQueryResponseBodyResultObject self = new VehicleQueryResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public VehicleQueryResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public VehicleQueryResponseBodyResultObject setVehicleInfo(String vehicleInfo) {
            this.vehicleInfo = vehicleInfo;
            return this;
        }
        public String getVehicleInfo() {
            return this.vehicleInfo;
        }

    }

}
