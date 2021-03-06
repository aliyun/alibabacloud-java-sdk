// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosConfigsResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Configurations")
    public java.util.List<ListNacosConfigsResponseBodyConfigurations> configurations;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ListNacosConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNacosConfigsResponseBody self = new ListNacosConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNacosConfigsResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListNacosConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListNacosConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNacosConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNacosConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNacosConfigsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNacosConfigsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNacosConfigsResponseBody setConfigurations(java.util.List<ListNacosConfigsResponseBodyConfigurations> configurations) {
        this.configurations = configurations;
        return this;
    }
    public java.util.List<ListNacosConfigsResponseBodyConfigurations> getConfigurations() {
        return this.configurations;
    }

    public ListNacosConfigsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListNacosConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNacosConfigsResponseBodyConfigurations extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Group")
        public String group;

        public static ListNacosConfigsResponseBodyConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ListNacosConfigsResponseBodyConfigurations self = new ListNacosConfigsResponseBodyConfigurations();
            return TeaModel.build(map, self);
        }

        public ListNacosConfigsResponseBodyConfigurations setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListNacosConfigsResponseBodyConfigurations setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListNacosConfigsResponseBodyConfigurations setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNacosConfigsResponseBodyConfigurations setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

}
