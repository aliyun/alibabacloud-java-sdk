// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseListResponseBody extends TeaModel {
    @NameInMap("Data")
    public IncreaseListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static IncreaseListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IncreaseListResponseBody self = new IncreaseListResponseBody();
        return TeaModel.build(map, self);
    }

    public IncreaseListResponseBody setData(IncreaseListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IncreaseListResponseBodyData getData() {
        return this.data;
    }

    public IncreaseListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class IncreaseListResponseBodyDataIncrementsInstance extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("CallbackAddress")
        public String callbackAddress;

        @NameInMap("Code")
        public String code;

        @NameInMap("ErrorUrl")
        public String errorUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Path")
        public String path;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public Long utcModified;

        public static IncreaseListResponseBodyDataIncrementsInstance build(java.util.Map<String, ?> map) throws Exception {
            IncreaseListResponseBodyDataIncrementsInstance self = new IncreaseListResponseBodyDataIncrementsInstance();
            return TeaModel.build(map, self);
        }

        public IncreaseListResponseBodyDataIncrementsInstance setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public IncreaseListResponseBodyDataIncrementsInstance setCallbackAddress(String callbackAddress) {
            this.callbackAddress = callbackAddress;
            return this;
        }
        public String getCallbackAddress() {
            return this.callbackAddress;
        }

        public IncreaseListResponseBodyDataIncrementsInstance setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IncreaseListResponseBodyDataIncrementsInstance setErrorUrl(String errorUrl) {
            this.errorUrl = errorUrl;
            return this;
        }
        public String getErrorUrl() {
            return this.errorUrl;
        }

        public IncreaseListResponseBodyDataIncrementsInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public IncreaseListResponseBodyDataIncrementsInstance setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public IncreaseListResponseBodyDataIncrementsInstance setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public IncreaseListResponseBodyDataIncrementsInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public IncreaseListResponseBodyDataIncrementsInstance setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public IncreaseListResponseBodyDataIncrementsInstance setUtcModified(Long utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public Long getUtcModified() {
            return this.utcModified;
        }

    }

    public static class IncreaseListResponseBodyDataIncrements extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<IncreaseListResponseBodyDataIncrementsInstance> instance;

        public static IncreaseListResponseBodyDataIncrements build(java.util.Map<String, ?> map) throws Exception {
            IncreaseListResponseBodyDataIncrements self = new IncreaseListResponseBodyDataIncrements();
            return TeaModel.build(map, self);
        }

        public IncreaseListResponseBodyDataIncrements setInstance(java.util.List<IncreaseListResponseBodyDataIncrementsInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<IncreaseListResponseBodyDataIncrementsInstance> getInstance() {
            return this.instance;
        }

    }

    public static class IncreaseListResponseBodyData extends TeaModel {
        @NameInMap("Increments")
        public IncreaseListResponseBodyDataIncrements increments;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static IncreaseListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IncreaseListResponseBodyData self = new IncreaseListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IncreaseListResponseBodyData setIncrements(IncreaseListResponseBodyDataIncrements increments) {
            this.increments = increments;
            return this;
        }
        public IncreaseListResponseBodyDataIncrements getIncrements() {
            return this.increments;
        }

        public IncreaseListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public IncreaseListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public IncreaseListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
