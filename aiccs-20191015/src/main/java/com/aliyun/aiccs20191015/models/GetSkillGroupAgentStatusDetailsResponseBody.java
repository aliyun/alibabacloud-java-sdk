// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupAgentStatusDetailsResponseBody extends TeaModel {
    /**
     * <p>The status code. A return value of 200 indicates that the request succeeded.</p>
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
    public GetSkillGroupAgentStatusDetailsResponseBodyData data;

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
     * <p>Indicates whether the API call succeeded. Valid values:</p>
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

    public static GetSkillGroupAgentStatusDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAgentStatusDetailsResponseBody self = new GetSkillGroupAgentStatusDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setData(GetSkillGroupAgentStatusDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupAgentStatusDetailsResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupAgentStatusDetailsResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>A JSON string of type List<Map>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tenant_id&quot;: &quot;905&quot;, &quot;tenant_name&quot;: &quot;非单元测试化BU&quot;, &quot;department_id&quot;: &quot;-1&quot;, &quot;svc_avai_capacity&quot;: 7,      &quot;svc_current_capacity&quot;: 0, &quot;department_name&quot;: &quot;-1&quot;,  &quot;svc_online_cnt&quot;: 3, &quot;svc_ask_offline_servicer_num&quot;: 0,  &quot;date_id&quot;: &quot;20210401&quot;,  &quot;svc_max_capacity&quot;: 7, &quot;svc_rest_cnt&quot;: 0, &quot;current_speci_ability_num&quot;: 0, &quot;servicer_rest_cnt&quot;: 122, &quot;max_speci_ability_num&quot;: 3,      &quot;svc_offline_cnt&quot;: 0,  &quot;svc_no_client_cnt&quot;: 3, &quot;svc_ask_rest_servicer_num&quot;: 0}</p>
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

        public static GetSkillGroupAgentStatusDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupAgentStatusDetailsResponseBodyData self = new GetSkillGroupAgentStatusDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
