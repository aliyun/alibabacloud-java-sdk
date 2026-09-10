// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlConversionProgressResponseBody extends TeaModel {
    /**
     * <p>The data body returned by the operation. For the field structure, see the child field descriptions.</p>
     */
    @NameInMap("data")
    public GetSqlConversionProgressResponseBodyData data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetSqlConversionProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConversionProgressResponseBody self = new GetSqlConversionProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlConversionProgressResponseBody setData(GetSqlConversionProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSqlConversionProgressResponseBodyData getData() {
        return this.data;
    }

    public GetSqlConversionProgressResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetSqlConversionProgressResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetSqlConversionProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlConversionProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSqlConversionProgressResponseBodyData extends TeaModel {
        /**
         * <p>The number of failed scripts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fail")
        public Long fail;

        /**
         * <p>The number of completed scripts.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("finish")
        public Long finish;

        /**
         * <p>The completion percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>66.67</p>
         */
        @NameInMap("percent")
        public Double percent;

        /**
         * <p>The number of scripts being converted.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("running")
        public Long running;

        /**
         * <p>The total number of scripts.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("total")
        public Long total;

        public static GetSqlConversionProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSqlConversionProgressResponseBodyData self = new GetSqlConversionProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSqlConversionProgressResponseBodyData setFail(Long fail) {
            this.fail = fail;
            return this;
        }
        public Long getFail() {
            return this.fail;
        }

        public GetSqlConversionProgressResponseBodyData setFinish(Long finish) {
            this.finish = finish;
            return this;
        }
        public Long getFinish() {
            return this.finish;
        }

        public GetSqlConversionProgressResponseBodyData setPercent(Double percent) {
            this.percent = percent;
            return this;
        }
        public Double getPercent() {
            return this.percent;
        }

        public GetSqlConversionProgressResponseBodyData setRunning(Long running) {
            this.running = running;
            return this;
        }
        public Long getRunning() {
            return this.running;
        }

        public GetSqlConversionProgressResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
