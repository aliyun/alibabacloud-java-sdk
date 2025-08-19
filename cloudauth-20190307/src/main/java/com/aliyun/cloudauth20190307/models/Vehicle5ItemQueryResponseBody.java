// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Vehicle5ItemQueryResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
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
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information.</p>
     */
    @NameInMap("ResultObject")
    public Vehicle5ItemQueryResponseBodyResultObject resultObject;

    public static Vehicle5ItemQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Vehicle5ItemQueryResponseBody self = new Vehicle5ItemQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public Vehicle5ItemQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Vehicle5ItemQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Vehicle5ItemQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Vehicle5ItemQueryResponseBody setResultObject(Vehicle5ItemQueryResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Vehicle5ItemQueryResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Vehicle5ItemQueryResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification result code:</p>
         * <ul>
         * <li><strong>1</strong>: Found (charged)</li>
         * <li><strong>3</strong>: No record found (not charged)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Vehicle information</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;engineNo&quot;: &quot;F0******&quot;,
         *         &quot;useProperty&quot;: 0,
         *         &quot;registrationDate&quot;: &quot;<strong><strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
         *         &quot;engineType&quot;: &quot;B</strong>**</strong>&quot;,
         *         &quot;vin&quot;: &quot;A********&quot;,
         *         &quot;state&quot;: &quot;0&quot;,
         *         &quot;modelNo&quot;: &quot;B********&quot;,
         *         &quot;type&quot;: &quot;小型轿车&quot;,
         *         &quot;brand&quot;: &quot;宝马&quot;,
         *         &quot;usePropertyDesc&quot;: &quot;非营运&quot;,
         *         &quot;stateDesc&quot;: &quot;正常&quot;
         *     }</p>
         */
        @NameInMap("VehicleInfo")
        public String vehicleInfo;

        public static Vehicle5ItemQueryResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Vehicle5ItemQueryResponseBodyResultObject self = new Vehicle5ItemQueryResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Vehicle5ItemQueryResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Vehicle5ItemQueryResponseBodyResultObject setVehicleInfo(String vehicleInfo) {
            this.vehicleInfo = vehicleInfo;
            return this;
        }
        public String getVehicleInfo() {
            return this.vehicleInfo;
        }

    }

}
