// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchDeleteAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchDeleteAppsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteAppsResponseBody self = new BatchDeleteAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchDeleteAppsResponseBody setData(BatchDeleteAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchDeleteAppsResponseBodyData getData() {
        return this.data;
    }

    public BatchDeleteAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchDeleteAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchDeleteAppsResponseBodyDataFailAppList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static BatchDeleteAppsResponseBodyDataFailAppList build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteAppsResponseBodyDataFailAppList self = new BatchDeleteAppsResponseBodyDataFailAppList();
            return TeaModel.build(map, self);
        }

        public BatchDeleteAppsResponseBodyDataFailAppList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchDeleteAppsResponseBodyDataFailAppList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class BatchDeleteAppsResponseBodyDataSuccessAppList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static BatchDeleteAppsResponseBodyDataSuccessAppList build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteAppsResponseBodyDataSuccessAppList self = new BatchDeleteAppsResponseBodyDataSuccessAppList();
            return TeaModel.build(map, self);
        }

        public BatchDeleteAppsResponseBodyDataSuccessAppList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchDeleteAppsResponseBodyDataSuccessAppList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class BatchDeleteAppsResponseBodyData extends TeaModel {
        @NameInMap("FailAppList")
        public java.util.List<BatchDeleteAppsResponseBodyDataFailAppList> failAppList;

        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        @NameInMap("SuccessAppList")
        public java.util.List<BatchDeleteAppsResponseBodyDataSuccessAppList> successAppList;

        public static BatchDeleteAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteAppsResponseBodyData self = new BatchDeleteAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchDeleteAppsResponseBodyData setFailAppList(java.util.List<BatchDeleteAppsResponseBodyDataFailAppList> failAppList) {
            this.failAppList = failAppList;
            return this;
        }
        public java.util.List<BatchDeleteAppsResponseBodyDataFailAppList> getFailAppList() {
            return this.failAppList;
        }

        public BatchDeleteAppsResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public BatchDeleteAppsResponseBodyData setSuccessAppList(java.util.List<BatchDeleteAppsResponseBodyDataSuccessAppList> successAppList) {
            this.successAppList = successAppList;
            return this;
        }
        public java.util.List<BatchDeleteAppsResponseBodyDataSuccessAppList> getSuccessAppList() {
            return this.successAppList;
        }

    }

}
