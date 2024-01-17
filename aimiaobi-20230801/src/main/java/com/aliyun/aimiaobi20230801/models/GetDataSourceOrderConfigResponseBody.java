// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDataSourceOrderConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataSourceOrderConfigResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDataSourceOrderConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceOrderConfigResponseBody self = new GetDataSourceOrderConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceOrderConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataSourceOrderConfigResponseBody setData(GetDataSourceOrderConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataSourceOrderConfigResponseBodyData getData() {
        return this.data;
    }

    public GetDataSourceOrderConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataSourceOrderConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataSourceOrderConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceOrderConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("Type")
        public String type;

        public static GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList self = new GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList();
            return TeaModel.build(map, self);
        }

        public GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataSourceOrderConfigResponseBodyData extends TeaModel {
        @NameInMap("UserConfigDataSourceList")
        public java.util.List<GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList> userConfigDataSourceList;

        public static GetDataSourceOrderConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceOrderConfigResponseBodyData self = new GetDataSourceOrderConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataSourceOrderConfigResponseBodyData setUserConfigDataSourceList(java.util.List<GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList> userConfigDataSourceList) {
            this.userConfigDataSourceList = userConfigDataSourceList;
            return this;
        }
        public java.util.List<GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList> getUserConfigDataSourceList() {
            return this.userConfigDataSourceList;
        }

    }

}
