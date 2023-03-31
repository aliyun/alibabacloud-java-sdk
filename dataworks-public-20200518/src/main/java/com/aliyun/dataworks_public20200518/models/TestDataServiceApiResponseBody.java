// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestDataServiceApiResponseBody extends TeaModel {
    /**
     * <p>The information about the test.</p>
     */
    @NameInMap("Data")
    public TestDataServiceApiResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TestDataServiceApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestDataServiceApiResponseBody self = new TestDataServiceApiResponseBody();
        return TeaModel.build(map, self);
    }

    public TestDataServiceApiResponseBody setData(TestDataServiceApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestDataServiceApiResponseBodyData getData() {
        return this.data;
    }

    public TestDataServiceApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TestDataServiceApiResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the test.</p>
         */
        @NameInMap("TestId")
        public String testId;

        public static TestDataServiceApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestDataServiceApiResponseBodyData self = new TestDataServiceApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestDataServiceApiResponseBodyData setTestId(String testId) {
            this.testId = testId;
            return this;
        }
        public String getTestId() {
            return this.testId;
        }

    }

}
