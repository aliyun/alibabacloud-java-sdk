// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFlashSmsApplicationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListFlashSmsApplicationsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>7BEEA660-A45A-45E3-98CC-AFC65E715C23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFlashSmsApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsApplicationsResponseBody self = new ListFlashSmsApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsApplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlashSmsApplicationsResponseBody setData(ListFlashSmsApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFlashSmsApplicationsResponseBodyData getData() {
        return this.data;
    }

    public ListFlashSmsApplicationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFlashSmsApplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlashSmsApplicationsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListFlashSmsApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlashSmsApplicationsResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>71b396fa-***********-bd80e070b7c0</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Uincall</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;user&quot;:&quot;600******_dev&quot;,&quot;pwd&quot;:&quot;85abf3****<strong><strong><strong>f494e&quot;,&quot;account&quot;:&quot;6004</strong></strong></strong>&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFlashSmsApplicationsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsApplicationsResponseBodyDataList self = new ListFlashSmsApplicationsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsApplicationsResponseBodyDataList setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListFlashSmsApplicationsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListFlashSmsApplicationsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlashSmsApplicationsResponseBodyDataList setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public ListFlashSmsApplicationsResponseBodyDataList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFlashSmsApplicationsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListFlashSmsApplicationsResponseBodyDataList> list;

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
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFlashSmsApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsApplicationsResponseBodyData self = new ListFlashSmsApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsApplicationsResponseBodyData setList(java.util.List<ListFlashSmsApplicationsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListFlashSmsApplicationsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListFlashSmsApplicationsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFlashSmsApplicationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFlashSmsApplicationsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
