// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapPkToHidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MapPkToHidResponseBodyData data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MapPkToHidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MapPkToHidResponseBody self = new MapPkToHidResponseBody();
        return TeaModel.build(map, self);
    }

    public MapPkToHidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MapPkToHidResponseBody setData(MapPkToHidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MapPkToHidResponseBodyData getData() {
        return this.data;
    }

    public MapPkToHidResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public MapPkToHidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MapPkToHidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MapPkToHidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MapPkToHidResponseBodyData extends TeaModel {
        @NameInMap("Hid")
        public String hid;

        @NameInMap("MappingSrc")
        public String mappingSrc;

        @NameInMap("Pk")
        public String pk;

        public static MapPkToHidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MapPkToHidResponseBodyData self = new MapPkToHidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MapPkToHidResponseBodyData setHid(String hid) {
            this.hid = hid;
            return this;
        }
        public String getHid() {
            return this.hid;
        }

        public MapPkToHidResponseBodyData setMappingSrc(String mappingSrc) {
            this.mappingSrc = mappingSrc;
            return this;
        }
        public String getMappingSrc() {
            return this.mappingSrc;
        }

        public MapPkToHidResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
