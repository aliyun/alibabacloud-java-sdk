// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentServiceStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentServiceStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAgentServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentServiceStatusResponseBody self = new GetAgentServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentServiceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentServiceStatusResponseBody setData(GetAgentServiceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentServiceStatusResponseBodyData getData() {
        return this.data;
    }

    public GetAgentServiceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentServiceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentServiceStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>{&quot;online_40s_transfer_ready_cnt&quot;:81,&quot;minute_id&quot;:&quot;-1&quot;,&quot;online_unsatis_cnt&quot;:0,&quot;online_simple_cnt&quot;:0,&quot;average_queue_time&quot;:-1,&quot;service_pickup&quot;:&quot;2086&quot;,&quot;total_waiting_time&quot;:&quot;981&quot;,&quot;online_service_time_len&quot;:58208,&quot;online_direct_give_up_len&quot;:0,&quot;break_ratio&quot;:&quot;2%&quot;}</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalNum")
        public Long totalNum;

        public static GetAgentServiceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentServiceStatusResponseBodyData self = new GetAgentServiceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentServiceStatusResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetAgentServiceStatusResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetAgentServiceStatusResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetAgentServiceStatusResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
