// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListInstancesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>0FC8BA40-C712-5FFD-9AA5-24C8F47F86E9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setData(java.util.List<ListInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListInstancesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>projectAbc</p>
         */
        @NameInMap("name")
        public String name;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
