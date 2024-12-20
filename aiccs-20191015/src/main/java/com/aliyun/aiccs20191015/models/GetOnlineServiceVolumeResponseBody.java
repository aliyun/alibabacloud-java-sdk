// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineServiceVolumeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOnlineServiceVolumeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
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
    public String success;

    public static GetOnlineServiceVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineServiceVolumeResponseBody self = new GetOnlineServiceVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOnlineServiceVolumeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOnlineServiceVolumeResponseBody setData(GetOnlineServiceVolumeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOnlineServiceVolumeResponseBodyData getData() {
        return this.data;
    }

    public GetOnlineServiceVolumeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOnlineServiceVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOnlineServiceVolumeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetOnlineServiceVolumeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>{&quot;tenant_id&quot;:&quot;905&quot;,&quot;online_40s_transfer_ready_cnt&quot;:109,&quot;minute_id&quot;:&quot;-1&quot;,&quot;wait_time_len&quot;:1215,&quot;pickup_rate&quot;:&quot;63.09%&quot;,&quot;thirty_seconds_to_pickUp&quot;:&quot;2560&quot;,&quot;date_id&quot;:&quot;-1&quot;,&quot;online_over_out_cnt&quot;:0,&quot;online_20s_transfer_ready_cnt&quot;:109,&quot;thirty_seconds_response_rate&quot;:&quot;63.09%&quot;,&quot;abandonment_rate&quot;:&quot;63.09%&quot;,&quot;service_time_len&quot;:68378,&quot;service_pickup&quot;:&quot;2560&quot;,&quot;hour_id&quot;:&quot;-1&quot;,&quot;online_10s_transfer_ready_cnt&quot;:109}</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetOnlineServiceVolumeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOnlineServiceVolumeResponseBodyData self = new GetOnlineServiceVolumeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOnlineServiceVolumeResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetOnlineServiceVolumeResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetOnlineServiceVolumeResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetOnlineServiceVolumeResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
