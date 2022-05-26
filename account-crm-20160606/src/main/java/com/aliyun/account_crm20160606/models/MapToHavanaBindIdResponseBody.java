// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapToHavanaBindIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<MapToHavanaBindIdResponseBodyData> data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MapToHavanaBindIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MapToHavanaBindIdResponseBody self = new MapToHavanaBindIdResponseBody();
        return TeaModel.build(map, self);
    }

    public MapToHavanaBindIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MapToHavanaBindIdResponseBody setData(java.util.List<MapToHavanaBindIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MapToHavanaBindIdResponseBodyData> getData() {
        return this.data;
    }

    public MapToHavanaBindIdResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public MapToHavanaBindIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MapToHavanaBindIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MapToHavanaBindIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MapToHavanaBindIdResponseBodyData extends TeaModel {
        @NameInMap("BindHid")
        public String bindHid;

        @NameInMap("HavanaBindId")
        public String havanaBindId;

        @NameInMap("HavanaBindStation")
        public String havanaBindStation;

        @NameInMap("Pk")
        public String pk;

        public static MapToHavanaBindIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MapToHavanaBindIdResponseBodyData self = new MapToHavanaBindIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MapToHavanaBindIdResponseBodyData setBindHid(String bindHid) {
            this.bindHid = bindHid;
            return this;
        }
        public String getBindHid() {
            return this.bindHid;
        }

        public MapToHavanaBindIdResponseBodyData setHavanaBindId(String havanaBindId) {
            this.havanaBindId = havanaBindId;
            return this;
        }
        public String getHavanaBindId() {
            return this.havanaBindId;
        }

        public MapToHavanaBindIdResponseBodyData setHavanaBindStation(String havanaBindStation) {
            this.havanaBindStation = havanaBindStation;
            return this;
        }
        public String getHavanaBindStation() {
            return this.havanaBindStation;
        }

        public MapToHavanaBindIdResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
