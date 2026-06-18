// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceCapabilityResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data list.</p>
     */
    @NameInMap("Data")
    public GetSkillGroupServiceCapabilityResponseBodyData data;

    /**
     * <p>Status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API invocation succeeded. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetSkillGroupServiceCapabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceCapabilityResponseBody self = new GetSkillGroupServiceCapabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceCapabilityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupServiceCapabilityResponseBody setData(GetSkillGroupServiceCapabilityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupServiceCapabilityResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupServiceCapabilityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupServiceCapabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupServiceCapabilityResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupServiceCapabilityResponseBodyData extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>A JSON string of type List<Map>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;tenant_id&quot;: &quot;905&quot;,
         *       &quot;tenant_name&quot;: &quot;非单元测试化BU&quot;,
         *       &quot;group_name&quot;: &quot;-1&quot;,
         *       &quot;department_id&quot;: &quot;-1&quot;,
         *       &quot;department_name&quot;: &quot;-1&quot;,
         *       &quot;svc_online_cnt&quot;: 0,
         *       &quot;svc_ask_offline_servicer_num&quot;: 0,
         *       &quot;date_id&quot;: &quot;20210326&quot;,
         *       &quot;group_id&quot;: &quot;-1&quot;,
         *       &quot;svc_rest_cnt&quot;: 0,
         *       &quot;servicer_rest_cnt&quot;: 234,
         *       &quot;svc_offline_cnt&quot;: 0,
         *       &quot;svc_no_client_cnt&quot;: 0,
         *       &quot;svc_ask_rest_servicer_num&quot;: 0
         * }</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalNum")
        public Long totalNum;

        public static GetSkillGroupServiceCapabilityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupServiceCapabilityResponseBodyData self = new GetSkillGroupServiceCapabilityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupServiceCapabilityResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupServiceCapabilityResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupServiceCapabilityResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupServiceCapabilityResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
