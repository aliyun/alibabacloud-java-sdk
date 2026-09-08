// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveWebRtcInfoResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF1C21B9-2D49-4B54-880F-FBE248C16903</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of rows returned upon data storage, indicating how many records were successfully written. If this value is not 1, an abnormal condition may have occurred and requires attention.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RowCount")
    public Long rowCount;

    /**
     * <p>Indicates whether the operation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The time when the information was stored, formatted as a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1647262108395</p>
     */
    @NameInMap("TimeStamp")
    public Long timeStamp;

    public static SaveWebRtcInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveWebRtcInfoResponseBody self = new SaveWebRtcInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveWebRtcInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveWebRtcInfoResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveWebRtcInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveWebRtcInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveWebRtcInfoResponseBody setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public SaveWebRtcInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveWebRtcInfoResponseBody setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

}
