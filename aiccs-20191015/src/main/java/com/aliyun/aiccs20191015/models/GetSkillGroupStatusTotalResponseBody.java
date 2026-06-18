// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupStatusTotalResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates that the Request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of data.</p>
     */
    @NameInMap("Data")
    public GetSkillGroupStatusTotalResponseBodyData data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
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
     * <p>Indicates whether the API invoke succeeded. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetSkillGroupStatusTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupStatusTotalResponseBody self = new GetSkillGroupStatusTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupStatusTotalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupStatusTotalResponseBody setData(GetSkillGroupStatusTotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupStatusTotalResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupStatusTotalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupStatusTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupStatusTotalResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupStatusTotalResponseBodyData extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>Information as a JSON string of type List<Map>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;minute_id&quot;:&quot;-1&quot;,&quot;call_out_intervene_servicer_cnt&quot;:26,&quot;call_out_servicer_cnt&quot;:35,&quot;call_out_intervene_60s_cnt&quot;:155,&quot;servicer_real_name&quot;:&quot;--&quot;,&quot;call_in_sep_normal_cnt&quot;:0,&quot;call_out_intervene_30s_cnt&quot;:235,&quot;servicer_id&quot;:&quot;-1&quot;,&quot;tenant_name&quot;:&quot;非单元测试化BU&quot;,&quot;call_out_sep_sat_cnt&quot;:1}</p>
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

        public static GetSkillGroupStatusTotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupStatusTotalResponseBodyData self = new GetSkillGroupStatusTotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupStatusTotalResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupStatusTotalResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupStatusTotalResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupStatusTotalResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
