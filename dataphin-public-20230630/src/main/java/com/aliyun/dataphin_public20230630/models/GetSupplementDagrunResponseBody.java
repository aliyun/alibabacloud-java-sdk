// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSupplementDagrunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("DagrunList")
    public java.util.List<GetSupplementDagrunResponseBodyDagrunList> dagrunList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSupplementDagrunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupplementDagrunResponseBody self = new GetSupplementDagrunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupplementDagrunResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSupplementDagrunResponseBody setDagrunList(java.util.List<GetSupplementDagrunResponseBodyDagrunList> dagrunList) {
        this.dagrunList = dagrunList;
        return this;
    }
    public java.util.List<GetSupplementDagrunResponseBodyDagrunList> getDagrunList() {
        return this.dagrunList;
    }

    public GetSupplementDagrunResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSupplementDagrunResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSupplementDagrunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupplementDagrunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSupplementDagrunResponseBodyDagrunList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-04-01</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>1717081789000</p>
         */
        @NameInMap("EndExecuteTime")
        public Long endExecuteTime;

        /**
         * <p>Dagrun ID</p>
         * 
         * <strong>example:</strong>
         * <p>dr_2242792_14542</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1717081729000</p>
         */
        @NameInMap("StartExecuteTime")
        public Long startExecuteTime;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>f_8241792_20201202_2099680</p>
         */
        @NameInMap("SupplementId")
        public String supplementId;

        public static GetSupplementDagrunResponseBodyDagrunList build(java.util.Map<String, ?> map) throws Exception {
            GetSupplementDagrunResponseBodyDagrunList self = new GetSupplementDagrunResponseBodyDagrunList();
            return TeaModel.build(map, self);
        }

        public GetSupplementDagrunResponseBodyDagrunList setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public GetSupplementDagrunResponseBodyDagrunList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetSupplementDagrunResponseBodyDagrunList setEndExecuteTime(Long endExecuteTime) {
            this.endExecuteTime = endExecuteTime;
            return this;
        }
        public Long getEndExecuteTime() {
            return this.endExecuteTime;
        }

        public GetSupplementDagrunResponseBodyDagrunList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSupplementDagrunResponseBodyDagrunList setStartExecuteTime(Long startExecuteTime) {
            this.startExecuteTime = startExecuteTime;
            return this;
        }
        public Long getStartExecuteTime() {
            return this.startExecuteTime;
        }

        public GetSupplementDagrunResponseBodyDagrunList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSupplementDagrunResponseBodyDagrunList setSupplementId(String supplementId) {
            this.supplementId = supplementId;
            return this;
        }
        public String getSupplementId() {
            return this.supplementId;
        }

    }

}
