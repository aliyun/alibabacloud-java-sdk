// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDataSourceOrderConfigResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public GetDataSourceOrderConfigResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error description</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request identifier</p>
     * 
     * <strong>example:</strong>
     * <p>428DCC0D-3C63-5306-BD1B-124396AB97BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Is successful: true for success, false for failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Code description</p>
         * 
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Is enabled</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>Display name</p>
         * 
         * <strong>example:</strong>
         * <p>夸克通用搜索</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Quantity</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>Type</p>
         * 
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
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

        public GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
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
        /**
         * <p>Maximum total document count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalDocSize")
        public Integer totalDocSize;

        /**
         * <p>List of user-configured data source weights</p>
         */
        @NameInMap("UserConfigDataSourceList")
        public java.util.List<GetDataSourceOrderConfigResponseBodyDataUserConfigDataSourceList> userConfigDataSourceList;

        public static GetDataSourceOrderConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceOrderConfigResponseBodyData self = new GetDataSourceOrderConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataSourceOrderConfigResponseBodyData setTotalDocSize(Integer totalDocSize) {
            this.totalDocSize = totalDocSize;
            return this;
        }
        public Integer getTotalDocSize() {
            return this.totalDocSize;
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
