// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceAppsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query parameters for listing all applications under the tenant.</p>
     */
    @NameInMap("Data")
    public ListDataServiceAppsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
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
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAppsResponseBody self = new ListDataServiceAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataServiceAppsResponseBody setData(ListDataServiceAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceAppsResponseBodyData getData() {
        return this.data;
    }

    public ListDataServiceAppsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataServiceAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceAppsResponseBodyDataAppListOwnerList extends TeaModel {
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
         * <p>Zhang San</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListDataServiceAppsResponseBodyDataAppListOwnerList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAppsResponseBodyDataAppListOwnerList self = new ListDataServiceAppsResponseBodyDataAppListOwnerList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAppsResponseBodyDataAppListOwnerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataServiceAppsResponseBodyDataAppListOwnerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDataServiceAppsResponseBodyDataAppList extends TeaModel {
        /**
         * <p>The application group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default group</p>
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
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default application</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Indicates whether the current user has joined the application.</p>
         */
        @NameInMap("IsMember")
        public Boolean isMember;

        /**
         * <p>The list of owners.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<ListDataServiceAppsResponseBodyDataAppListOwnerList> ownerList;

        public static ListDataServiceAppsResponseBodyDataAppList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAppsResponseBodyDataAppList self = new ListDataServiceAppsResponseBodyDataAppList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAppsResponseBodyDataAppList setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public ListDataServiceAppsResponseBodyDataAppList setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ListDataServiceAppsResponseBodyDataAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDataServiceAppsResponseBodyDataAppList setIsMember(Boolean isMember) {
            this.isMember = isMember;
            return this;
        }
        public Boolean getIsMember() {
            return this.isMember;
        }

        public ListDataServiceAppsResponseBodyDataAppList setOwnerList(java.util.List<ListDataServiceAppsResponseBodyDataAppListOwnerList> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<ListDataServiceAppsResponseBodyDataAppListOwnerList> getOwnerList() {
            return this.ownerList;
        }

    }

    public static class ListDataServiceAppsResponseBodyData extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("AppList")
        public java.util.List<ListDataServiceAppsResponseBodyDataAppList> appList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDataServiceAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAppsResponseBodyData self = new ListDataServiceAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAppsResponseBodyData setAppList(java.util.List<ListDataServiceAppsResponseBodyDataAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<ListDataServiceAppsResponseBodyDataAppList> getAppList() {
            return this.appList;
        }

        public ListDataServiceAppsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
