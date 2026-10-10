// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFunctionMetasResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListFunctionMetasResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>26D1277F-55BF-453E-A6B2-02B7E6F97699</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFunctionMetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionMetasResponseBody self = new ListFunctionMetasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionMetasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFunctionMetasResponseBody setData(ListFunctionMetasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFunctionMetasResponseBodyData getData() {
        return this.data;
    }

    public ListFunctionMetasResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFunctionMetasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFunctionMetasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFunctionMetasResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>15772400000****</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <strong>example:</strong>
         * <p>王先生</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("FailoverRegion")
        public String failoverRegion;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FailoverRegionWeight")
        public Double failoverRegionWeight;

        /**
         * <strong>example:</strong>
         * <p>4bbcd898-xxxxx-47e5-85bb-718166</p>
         */
        @NameInMap("FunctionMetaId")
        public String functionMetaId;

        /**
         * <strong>example:</strong>
         * <p>sql_hra</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("HttpTriggerUrl")
        public String httpTriggerUrl;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public Integer region;

        /**
         * <strong>example:</strong>
         * <p>logical</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>url_detection_pro</p>
         */
        @NameInMap("Service")
        public String service;

        public static ListFunctionMetasResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionMetasResponseBodyDataList self = new ListFunctionMetasResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListFunctionMetasResponseBodyDataList setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListFunctionMetasResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFunctionMetasResponseBodyDataList setFailoverRegion(String failoverRegion) {
            this.failoverRegion = failoverRegion;
            return this;
        }
        public String getFailoverRegion() {
            return this.failoverRegion;
        }

        public ListFunctionMetasResponseBodyDataList setFailoverRegionWeight(Double failoverRegionWeight) {
            this.failoverRegionWeight = failoverRegionWeight;
            return this;
        }
        public Double getFailoverRegionWeight() {
            return this.failoverRegionWeight;
        }

        public ListFunctionMetasResponseBodyDataList setFunctionMetaId(String functionMetaId) {
            this.functionMetaId = functionMetaId;
            return this;
        }
        public String getFunctionMetaId() {
            return this.functionMetaId;
        }

        public ListFunctionMetasResponseBodyDataList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListFunctionMetasResponseBodyDataList setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = httpTriggerUrl;
            return this;
        }
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        public ListFunctionMetasResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListFunctionMetasResponseBodyDataList setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public ListFunctionMetasResponseBodyDataList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListFunctionMetasResponseBodyDataList setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class ListFunctionMetasResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListFunctionMetasResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFunctionMetasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionMetasResponseBodyData self = new ListFunctionMetasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFunctionMetasResponseBodyData setList(java.util.List<ListFunctionMetasResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListFunctionMetasResponseBodyDataList> getList() {
            return this.list;
        }

        public ListFunctionMetasResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFunctionMetasResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFunctionMetasResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
