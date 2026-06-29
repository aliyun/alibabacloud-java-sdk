// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppResponseBody extends TeaModel {
    /**
     * <p>The response code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the data service application.</p>
     */
    @NameInMap("Data")
    public GetDataServiceAppResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataServiceAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppResponseBody self = new GetDataServiceAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceAppResponseBody setData(GetDataServiceAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceAppResponseBodyData getData() {
        return this.data;
    }

    public GetDataServiceAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceAppResponseBodyDataOwnerList extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetDataServiceAppResponseBodyDataOwnerList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceAppResponseBodyDataOwnerList self = new GetDataServiceAppResponseBodyDataOwnerList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceAppResponseBodyDataOwnerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDataServiceAppResponseBodyDataOwnerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDataServiceAppResponseBodyData extends TeaModel {
        /**
         * <p>The application group name.</p>
         * 
         * <strong>example:</strong>
         * <p>默认分组</p>
         */
        @NameInMap("AppGroup")
        public String appGroup;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>The AppKey of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>默认应用</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>默认应用</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The AppSecret of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>默认应用</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>The IP whitelist addresses. Specify IP addresses or CIDR blocks separated by semicolons (;). CIDR blocks end with a slash (/) followed by a number in the range of 1 to 32. Example: 192.168.3.12/24.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        /**
         * <p>Indicates whether the IP whitelist is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         */
        @NameInMap("IpWhitelistStatus")
        public Boolean ipWhitelistStatus;

        /**
         * <p>The list of owners.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<GetDataServiceAppResponseBodyDataOwnerList> ownerList;

        /**
         * <p>The common scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>数据分析</p>
         */
        @NameInMap("Scenarios")
        public String scenarios;

        public static GetDataServiceAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceAppResponseBodyData self = new GetDataServiceAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceAppResponseBodyData setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public GetDataServiceAppResponseBodyData setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public GetDataServiceAppResponseBodyData setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetDataServiceAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetDataServiceAppResponseBodyData setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public GetDataServiceAppResponseBodyData setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        public GetDataServiceAppResponseBodyData setIpWhitelistStatus(Boolean ipWhitelistStatus) {
            this.ipWhitelistStatus = ipWhitelistStatus;
            return this;
        }
        public Boolean getIpWhitelistStatus() {
            return this.ipWhitelistStatus;
        }

        public GetDataServiceAppResponseBodyData setOwnerList(java.util.List<GetDataServiceAppResponseBodyDataOwnerList> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<GetDataServiceAppResponseBodyDataOwnerList> getOwnerList() {
            return this.ownerList;
        }

        public GetDataServiceAppResponseBodyData setScenarios(String scenarios) {
            this.scenarios = scenarios;
            return this;
        }
        public String getScenarios() {
            return this.scenarios;
        }

    }

}
