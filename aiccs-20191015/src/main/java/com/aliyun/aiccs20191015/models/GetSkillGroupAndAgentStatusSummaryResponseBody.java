// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupAndAgentStatusSummaryResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public GetSkillGroupAndAgentStatusSummaryResponseBodyData data;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Success.</li>
     * <li><strong>false</strong>: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetSkillGroupAndAgentStatusSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAndAgentStatusSummaryResponseBody self = new GetSkillGroupAndAgentStatusSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setData(GetSkillGroupAndAgentStatusSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupAndAgentStatusSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupAndAgentStatusSummaryResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The JSON string of the List<Map> type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tenant_id&quot;:&quot;905&quot;,&quot;n_resttype_now&quot;:0,&quot;tenant_name&quot;:&quot;Non-unit testing BU&quot;,&quot;n_resttype1_now&quot;:0,&quot;group_name&quot;:&quot;-1&quot;,&quot;department_id&quot;:&quot;-1&quot;,&quot;department_name&quot;:&quot;-1&quot;,&quot;n_resttype98_now&quot;:0,&quot;n_online_now&quot;:0,&quot;date_id&quot;:&quot;20210401&quot;,&quot;n_resttype3_now&quot;:0,&quot;n_resttype5_now&quot;:0,&quot;n_busy_now&quot;:0,&quot;n_resttype2_now&quot;:0,&quot;group_id&quot;:&quot;-1&quot;,&quot;n_idle_now&quot;:0,&quot;n_resttype4_now&quot;:0,&quot;n_ack_now&quot;:0,&quot;n_resttype99_now&quot;:0}</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetSkillGroupAndAgentStatusSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupAndAgentStatusSummaryResponseBodyData self = new GetSkillGroupAndAgentStatusSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupAndAgentStatusSummaryResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupAndAgentStatusSummaryResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupAndAgentStatusSummaryResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupAndAgentStatusSummaryResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
