// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class MakeDoubleCallResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public MakeDoubleCallResponseBodyData data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
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
     * <p>Indicates whether the API call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MakeDoubleCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MakeDoubleCallResponseBody self = new MakeDoubleCallResponseBody();
        return TeaModel.build(map, self);
    }

    public MakeDoubleCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MakeDoubleCallResponseBody setData(MakeDoubleCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MakeDoubleCallResponseBodyData getData() {
        return this.data;
    }

    public MakeDoubleCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MakeDoubleCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MakeDoubleCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MakeDoubleCallResponseBodyData extends TeaModel {
        /**
         * <p>Session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68255155365620598</p>
         */
        @NameInMap("Acid")
        public String acid;

        public static MakeDoubleCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MakeDoubleCallResponseBodyData self = new MakeDoubleCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MakeDoubleCallResponseBodyData setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

    }

}
