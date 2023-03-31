// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiTestResponseBody extends TeaModel {
    /**
     * <p>The list of test records.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDataServiceApiTestResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataServiceApiTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiTestResponseBody self = new ListDataServiceApiTestResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiTestResponseBody setData(java.util.List<ListDataServiceApiTestResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataServiceApiTestResponseBodyData> getData() {
        return this.data;
    }

    public ListDataServiceApiTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataServiceApiTestResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the DataService Studio API on which the test is performed.</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The time that is consumed to complete the test.</p>
         */
        @NameInMap("CostTime")
        public Integer costTime;

        /**
         * <p>The time when the test was initiated.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The request parameters configured for the test.</p>
         */
        @NameInMap("ParamMap")
        public String paramMap;

        /**
         * <p>The status code returned for the test. If the test is not complete, this parameter is not returned.</p>
         */
        @NameInMap("RetCode")
        public Long retCode;

        /**
         * <p>The result returned for the test.</p>
         */
        @NameInMap("RetResult")
        public String retResult;

        /**
         * <p>The status of the test. Valid values: RUNNING and FINISHED.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the test.</p>
         */
        @NameInMap("TestId")
        public Long testId;

        public static ListDataServiceApiTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiTestResponseBodyData self = new ListDataServiceApiTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiTestResponseBodyData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApiTestResponseBodyData setCostTime(Integer costTime) {
            this.costTime = costTime;
            return this;
        }
        public Integer getCostTime() {
            return this.costTime;
        }

        public ListDataServiceApiTestResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataServiceApiTestResponseBodyData setParamMap(String paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public String getParamMap() {
            return this.paramMap;
        }

        public ListDataServiceApiTestResponseBodyData setRetCode(Long retCode) {
            this.retCode = retCode;
            return this;
        }
        public Long getRetCode() {
            return this.retCode;
        }

        public ListDataServiceApiTestResponseBodyData setRetResult(String retResult) {
            this.retResult = retResult;
            return this;
        }
        public String getRetResult() {
            return this.retResult;
        }

        public ListDataServiceApiTestResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataServiceApiTestResponseBodyData setTestId(Long testId) {
            this.testId = testId;
            return this;
        }
        public Long getTestId() {
            return this.testId;
        }

    }

}
