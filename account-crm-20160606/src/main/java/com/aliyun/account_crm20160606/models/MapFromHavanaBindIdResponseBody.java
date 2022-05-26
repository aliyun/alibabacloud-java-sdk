// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapFromHavanaBindIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<MapFromHavanaBindIdResponseBodyData> data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MapFromHavanaBindIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MapFromHavanaBindIdResponseBody self = new MapFromHavanaBindIdResponseBody();
        return TeaModel.build(map, self);
    }

    public MapFromHavanaBindIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MapFromHavanaBindIdResponseBody setData(java.util.List<MapFromHavanaBindIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MapFromHavanaBindIdResponseBodyData> getData() {
        return this.data;
    }

    public MapFromHavanaBindIdResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public MapFromHavanaBindIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MapFromHavanaBindIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MapFromHavanaBindIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MapFromHavanaBindIdResponseBodyData extends TeaModel {
        @NameInMap("BindHid")
        public String bindHid;

        @NameInMap("HavanaBindId")
        public String havanaBindId;

        @NameInMap("HavanaBindStation")
        public String havanaBindStation;

        @NameInMap("Pk")
        public String pk;

        public static MapFromHavanaBindIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MapFromHavanaBindIdResponseBodyData self = new MapFromHavanaBindIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MapFromHavanaBindIdResponseBodyData setBindHid(String bindHid) {
            this.bindHid = bindHid;
            return this;
        }
        public String getBindHid() {
            return this.bindHid;
        }

        public MapFromHavanaBindIdResponseBodyData setHavanaBindId(String havanaBindId) {
            this.havanaBindId = havanaBindId;
            return this;
        }
        public String getHavanaBindId() {
            return this.havanaBindId;
        }

        public MapFromHavanaBindIdResponseBodyData setHavanaBindStation(String havanaBindStation) {
            this.havanaBindStation = havanaBindStation;
            return this;
        }
        public String getHavanaBindStation() {
            return this.havanaBindStation;
        }

        public MapFromHavanaBindIdResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
