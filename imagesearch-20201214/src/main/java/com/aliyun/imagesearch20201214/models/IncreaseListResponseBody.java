// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseListResponseBody extends TeaModel {
    /**
     * <p>The information about the batch task.</p>
     */
    @NameInMap("Data")
    public IncreaseListResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B3137727-7D6E-488C-BA21-0E034C38A879</p>
     */
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
        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>bucketName</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The callback address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxx">http://xxxxx</a></p>
         */
        @NameInMap("CallbackAddress")
        public String callbackAddress;

        /**
         * <p>The error code returned.</p>
         * <ul>
         * <li>A value of 0 indicates that the operation is successful.</li>
         * <li>Values other than 0 indicate errors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The address where you can download the result. The address is valid for 2 hours.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imagesearchname.oss-cn-shanghai.aliyuncs.com/xxx">https://imagesearchname.oss-cn-shanghai.aliyuncs.com/xxx</a></p>
         */
        @NameInMap("ErrorUrl")
        public String errorUrl;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>sucess</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The absolute path to the increment.meta file in the bucket. The path must start with a forward slash (/) and cannot end with a forward slash (/).</p>
         * 
         * <strong>example:</strong>
         * <p>/xx/xx</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The status of the batch task.</p>
         * <ul>
         * <li>PROCESSING: in progress</li>
         * <li>FAIL: failed</li>
         * <li>SUCCESS: successful</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the task was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1629095713000</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the task was updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1629095760000</p>
         */
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
        /**
         * <p>A list of batch tasks.</p>
         */
        @NameInMap("Increments")
        public IncreaseListResponseBodyDataIncrements increments;

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
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
