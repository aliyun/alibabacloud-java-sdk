// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleMetaVerifyV2ResponseBody extends TeaModel {
    /**
     * <p>Return code, <strong>200</strong> indicates successful API response.</p>
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
     * <p>5A6229C0-E156-48E4-B6EC-0F528B******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result</p>
     */
    @NameInMap("ResultObject")
    public VehicleMetaVerifyV2ResponseBodyResultObject resultObject;

    public static VehicleMetaVerifyV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VehicleMetaVerifyV2ResponseBody self = new VehicleMetaVerifyV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public VehicleMetaVerifyV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VehicleMetaVerifyV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VehicleMetaVerifyV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VehicleMetaVerifyV2ResponseBody setResultObject(VehicleMetaVerifyV2ResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VehicleMetaVerifyV2ResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VehicleMetaVerifyV2ResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification result code:</p>
         * <ul>
         * <li><strong>1</strong>: Verification consistent.</li>
         * <li><strong>2</strong>: Verification inconsistent.</li>
         * <li><strong>3</strong>: No record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Detailed vehicle information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;approvedCount&quot;: &quot;7&quot;,
         *     &quot;approvedLoad&quot;: &quot;0&quot;,
         *     &quot;axleCount&quot;: &quot;2&quot;,
         *     &quot;backWheelDistance&quot;: &quot;1585&quot;,
         *     &quot;brand&quot;: &quot;雷克萨斯&quot;,
         *     &quot;displacement&quot;: &quot;4608&quot;,
         *     &quot;engineNum&quot;: &quot;1*********&quot;,
         *     &quot;engineType&quot;: &quot;1**&quot;,
         *     &quot;frontWheelDistance&quot;: &quot;1585&quot;,
         *     &quot;fuelType&quot;: &quot;汽油&quot;,
         *     &quot;inspectionDate&quot;: &quot;<strong><strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
         *     &quot;modelNum&quot;: &quot;UR</strong>*</strong>-<strong><strong><strong>&quot;,
         *     &quot;power&quot;: &quot;228&quot;,
         *     &quot;registrationDate&quot;: &quot;</strong></strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
         *     &quot;retirementDate&quot;: &quot;****-</strong>-** <strong>:</strong>:<strong>&quot;,
         *     &quot;totalMass&quot;: &quot;2940&quot;,
         *     &quot;unladenMass&quot;: &quot;2350&quot;,
         *     &quot;useProperty&quot;: &quot;非营运&quot;,
         *     &quot;vehicleState&quot;: &quot;正常&quot;,
         *     &quot;vin&quot;: &quot;JT</strong>*************&quot;,
         *     &quot;wheelBase&quot;: &quot;2790&quot;
         * }</p>
         */
        @NameInMap("VehicleInfo")
        public String vehicleInfo;

        public static VehicleMetaVerifyV2ResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            VehicleMetaVerifyV2ResponseBodyResultObject self = new VehicleMetaVerifyV2ResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public VehicleMetaVerifyV2ResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public VehicleMetaVerifyV2ResponseBodyResultObject setVehicleInfo(String vehicleInfo) {
            this.vehicleInfo = vehicleInfo;
            return this;
        }
        public String getVehicleInfo() {
            return this.vehicleInfo;
        }

    }

}
