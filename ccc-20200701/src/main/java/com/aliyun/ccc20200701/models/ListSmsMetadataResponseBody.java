// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSmsMetadataResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public ListSmsMetadataResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of incorrect parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15772400000****</p>
         */
        @NameInMap("AliyunUid")
        public Long aliyunUid;

        /**
         * <p>The description of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>漏话短信配置</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>漏话短信提醒</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The scenario type.</p>
         * 
         * <strong>example:</strong>
         * <p>MISSED_CALL_NOTIFICATION</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <p>The name of the SMS signature.</p>
         * 
         * <strong>example:</strong>
         * <p>云呼叫中心</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>The ID of the SMS configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>5ffc1c9a-4d3d-4019-*****-73255fb01d1c</p>
         */
        @NameInMap("SmsMetadataId")
        public String smsMetadataId;

        /**
         * <p>The template code.</p>
         * 
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
        /**
         * <p>The list of SMS configurations.</p>
         */
        @NameInMap("List")
        public java.util.List<ListSmsMetadataResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
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
