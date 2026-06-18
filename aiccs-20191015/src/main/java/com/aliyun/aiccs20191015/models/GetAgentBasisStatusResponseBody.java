// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentBasisStatusResponseBody extends TeaModel {
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
    public GetAgentBasisStatusResponseBodyData data;

    /**
     * <p>Status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
     * <p>Indicates whether the API was invoked successfully. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.  </li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetAgentBasisStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBasisStatusResponseBody self = new GetAgentBasisStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentBasisStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentBasisStatusResponseBody setData(GetAgentBasisStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentBasisStatusResponseBodyData getData() {
        return this.data;
    }

    public GetAgentBasisStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentBasisStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentBasisStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAgentBasisStatusResponseBodyData extends TeaModel {
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
         * <p>The information is a JSON string of the List<Map> type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tenant_id&quot;:&quot;905&quot;,&quot;servicer_id&quot;:&quot;73****&quot;,&quot;tenant_name&quot;:&quot;测试&quot;,&quot;recordgmtmodified&quot;:&quot;2021-04-01 11:36:50&quot;,&quot;pk_id&quot;:&quot;7320372021****&quot;,&quot;statusstarttime&quot;:&quot;2021-04-01 11:36:50&quot;,&quot;recordgmtcreate&quot;:&quot;2021-04-01 10:06:24&quot;,&quot;department_id&quot;:&quot;94****&quot;,&quot;department_name&quot;:&quot;测试技能组&quot;,&quot;lstlogintime&quot;:&quot;2021-04-01 10:06:24&quot;,&quot;date_id&quot;:&quot;20210401&quot;,&quot;triggerreason&quot;:&quot;3&quot;,&quot;servicer_status&quot;:&quot;D&quot;,&quot;assignstatus&quot;:&quot;1&quot;,&quot;servicerreal_name&quot;:&quot;xx&quot;,&quot;servicerstatusname&quot;:&quot;签出&quot;,&quot;fstlogintime&quot;:&quot;2021-04-01 10:06:24&quot;,&quot;servicer_name&quot;:&quot;xx&quot;}</p>
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
        public Integer totalNum;

        public static GetAgentBasisStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentBasisStatusResponseBodyData self = new GetAgentBasisStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentBasisStatusResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetAgentBasisStatusResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAgentBasisStatusResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetAgentBasisStatusResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
