// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAuthCodeBindForExtResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CheckAuthCodeBindForExtResponseBodyResult result;

    public static CheckAuthCodeBindForExtResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAuthCodeBindForExtResponseBody self = new CheckAuthCodeBindForExtResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAuthCodeBindForExtResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CheckAuthCodeBindForExtResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckAuthCodeBindForExtResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAuthCodeBindForExtResponseBody setResult(CheckAuthCodeBindForExtResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckAuthCodeBindForExtResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckAuthCodeBindForExtResponseBodyResultDeviceOpenInfo extends TeaModel {
        @NameInMap("Id")
        public String id;

        /**
         * <p>DEVICE_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        public static CheckAuthCodeBindForExtResponseBodyResultDeviceOpenInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckAuthCodeBindForExtResponseBodyResultDeviceOpenInfo self = new CheckAuthCodeBindForExtResponseBodyResultDeviceOpenInfo();
            return TeaModel.build(map, self);
        }

        public CheckAuthCodeBindForExtResponseBodyResultDeviceOpenInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CheckAuthCodeBindForExtResponseBodyResultDeviceOpenInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

    }

    public static class CheckAuthCodeBindForExtResponseBodyResultUserOpenInfo extends TeaModel {
        @NameInMap("Id")
        public String id;

        /**
         * <p>USER_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        public static CheckAuthCodeBindForExtResponseBodyResultUserOpenInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckAuthCodeBindForExtResponseBodyResultUserOpenInfo self = new CheckAuthCodeBindForExtResponseBodyResultUserOpenInfo();
            return TeaModel.build(map, self);
        }

        public CheckAuthCodeBindForExtResponseBodyResultUserOpenInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CheckAuthCodeBindForExtResponseBodyResultUserOpenInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

    }

    public static class CheckAuthCodeBindForExtResponseBodyResult extends TeaModel {
        @NameInMap("DeviceOpenInfo")
        public CheckAuthCodeBindForExtResponseBodyResultDeviceOpenInfo deviceOpenInfo;

        @NameInMap("UserOpenInfo")
        public CheckAuthCodeBindForExtResponseBodyResultUserOpenInfo userOpenInfo;

        public static CheckAuthCodeBindForExtResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckAuthCodeBindForExtResponseBodyResult self = new CheckAuthCodeBindForExtResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckAuthCodeBindForExtResponseBodyResult setDeviceOpenInfo(CheckAuthCodeBindForExtResponseBodyResultDeviceOpenInfo deviceOpenInfo) {
            this.deviceOpenInfo = deviceOpenInfo;
            return this;
        }
        public CheckAuthCodeBindForExtResponseBodyResultDeviceOpenInfo getDeviceOpenInfo() {
            return this.deviceOpenInfo;
        }

        public CheckAuthCodeBindForExtResponseBodyResult setUserOpenInfo(CheckAuthCodeBindForExtResponseBodyResultUserOpenInfo userOpenInfo) {
            this.userOpenInfo = userOpenInfo;
            return this;
        }
        public CheckAuthCodeBindForExtResponseBodyResultUserOpenInfo getUserOpenInfo() {
            return this.userOpenInfo;
        }

    }

}
