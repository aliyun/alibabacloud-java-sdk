// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UpdateQaLibraryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public UpdateQaLibraryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EF4B5C9B-3BC8-5171-A47B-4C5CF3DC3258</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static UpdateQaLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQaLibraryResponseBody self = new UpdateQaLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQaLibraryResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public UpdateQaLibraryResponseBody setData(UpdateQaLibraryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateQaLibraryResponseBodyData getData() {
        return this.data;
    }

    public UpdateQaLibraryResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public UpdateQaLibraryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public UpdateQaLibraryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateQaLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateQaLibraryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateQaLibraryResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class UpdateQaLibraryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6jh378d</p>
         */
        @NameInMap("qaLibraryId")
        public String qaLibraryId;

        public static UpdateQaLibraryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateQaLibraryResponseBodyData self = new UpdateQaLibraryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateQaLibraryResponseBodyData setQaLibraryId(String qaLibraryId) {
            this.qaLibraryId = qaLibraryId;
            return this;
        }
        public String getQaLibraryId() {
            return this.qaLibraryId;
        }

    }

}
