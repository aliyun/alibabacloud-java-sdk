// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleMetaVerifyV2ResponseBody extends TeaModel {
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
     * <p>5A6229C0-E156-48E4-B6EC-0F528B******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

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
