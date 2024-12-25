// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateDialogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public CreateDialogResponseBodyData data;

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
     * <p>003D019A-1BB3-53EC-A0D2-CE76DA5D73B1</p>
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
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("time")
    public String time;

    public static CreateDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDialogResponseBody self = new CreateDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDialogResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public CreateDialogResponseBody setData(CreateDialogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDialogResponseBodyData getData() {
        return this.data;
    }

    public CreateDialogResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateDialogResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateDialogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDialogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDialogResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class CreateDialogResponseBodyData extends TeaModel {
        @NameInMap("openingRemarks")
        public String openingRemarks;

        /**
         * <strong>example:</strong>
         * <p>1728545917713234</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static CreateDialogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDialogResponseBodyData self = new CreateDialogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDialogResponseBodyData setOpeningRemarks(String openingRemarks) {
            this.openingRemarks = openingRemarks;
            return this;
        }
        public String getOpeningRemarks() {
            return this.openingRemarks;
        }

        public CreateDialogResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
