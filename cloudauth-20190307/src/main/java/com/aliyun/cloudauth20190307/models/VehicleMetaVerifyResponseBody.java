// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleMetaVerifyResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FC3D6AC-9FED-4311-8DA7-C4BF4*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public VehicleMetaVerifyResponseBodyResultObject resultObject;

    public static VehicleMetaVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VehicleMetaVerifyResponseBody self = new VehicleMetaVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public VehicleMetaVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VehicleMetaVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VehicleMetaVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VehicleMetaVerifyResponseBody setResultObject(VehicleMetaVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VehicleMetaVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VehicleMetaVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        public static VehicleMetaVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            VehicleMetaVerifyResponseBodyResultObject self = new VehicleMetaVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public VehicleMetaVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

    }

}
