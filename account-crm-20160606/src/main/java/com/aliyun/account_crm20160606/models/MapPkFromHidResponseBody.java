// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapPkFromHidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MapPkFromHidResponseBodyData data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MapPkFromHidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MapPkFromHidResponseBody self = new MapPkFromHidResponseBody();
        return TeaModel.build(map, self);
    }

    public MapPkFromHidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MapPkFromHidResponseBody setData(MapPkFromHidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MapPkFromHidResponseBodyData getData() {
        return this.data;
    }

    public MapPkFromHidResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public MapPkFromHidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MapPkFromHidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MapPkFromHidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MapPkFromHidResponseBodyData extends TeaModel {
        @NameInMap("Hid")
        public String hid;

        @NameInMap("MappingSrc")
        public String mappingSrc;

        @NameInMap("Pk")
        public String pk;

        public static MapPkFromHidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MapPkFromHidResponseBodyData self = new MapPkFromHidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MapPkFromHidResponseBodyData setHid(String hid) {
            this.hid = hid;
            return this;
        }
        public String getHid() {
            return this.hid;
        }

        public MapPkFromHidResponseBodyData setMappingSrc(String mappingSrc) {
            this.mappingSrc = mappingSrc;
            return this;
        }
        public String getMappingSrc() {
            return this.mappingSrc;
        }

        public MapPkFromHidResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
