// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSmsMetadataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSmsMetadataResponseBodyData data;

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
     * <p>8707EB29-BAED-4302-B999-40BA61877437</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSmsMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmsMetadataResponseBody self = new ListSmsMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmsMetadataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSmsMetadataResponseBody setData(ListSmsMetadataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSmsMetadataResponseBodyData getData() {
        return this.data;
    }

    public ListSmsMetadataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSmsMetadataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSmsMetadataResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListSmsMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSmsMetadataResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>15772400000****</p>
         */
        @NameInMap("AliyunUid")
        public Long aliyunUid;

        @NameInMap("Description")
        public String description;

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
         * <p>MISSED_CALL_NOTIFICATION</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        @NameInMap("SignName")
        public String signName;

        /**
         * <strong>example:</strong>
         * <p>5ffc1c9a-4d3d-4019-*****-73255fb01d1c</p>
         */
        @NameInMap("SmsMetadataId")
        public String smsMetadataId;

        /**
         * <strong>example:</strong>
         * <p>SMS_468xxxx298</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static ListSmsMetadataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSmsMetadataResponseBodyDataList self = new ListSmsMetadataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListSmsMetadataResponseBodyDataList setAliyunUid(Long aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        public ListSmsMetadataResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSmsMetadataResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSmsMetadataResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSmsMetadataResponseBodyDataList setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public ListSmsMetadataResponseBodyDataList setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public ListSmsMetadataResponseBodyDataList setSmsMetadataId(String smsMetadataId) {
            this.smsMetadataId = smsMetadataId;
            return this;
        }
        public String getSmsMetadataId() {
            return this.smsMetadataId;
        }

        public ListSmsMetadataResponseBodyDataList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class ListSmsMetadataResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListSmsMetadataResponseBodyDataList> list;

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
         * <p>200</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSmsMetadataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSmsMetadataResponseBodyData self = new ListSmsMetadataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSmsMetadataResponseBodyData setList(java.util.List<ListSmsMetadataResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListSmsMetadataResponseBodyDataList> getList() {
            return this.list;
        }

        public ListSmsMetadataResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSmsMetadataResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSmsMetadataResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
