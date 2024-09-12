// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleQueryResponseBody extends TeaModel {
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
     * <p>D6163397-15C5-419C-9ACC-B7C83*******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

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
