// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ChangeParseSettingResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data fields.</p>
     */
    @NameInMap("Data")
    public ChangeParseSettingResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BA8ADD9-53D6-53F0-918F-A1E776AD230E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ChangeParseSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeParseSettingResponseBody self = new ChangeParseSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeParseSettingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeParseSettingResponseBody setData(ChangeParseSettingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeParseSettingResponseBodyData getData() {
        return this.data;
    }

    public ChangeParseSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeParseSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeParseSettingResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ChangeParseSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeParseSettingResponseBodyData extends TeaModel {
        /**
         * <p>The result of the modification.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChangeResult")
        public Boolean changeResult;

        public static ChangeParseSettingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeParseSettingResponseBodyData self = new ChangeParseSettingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeParseSettingResponseBodyData setChangeResult(Boolean changeResult) {
            this.changeResult = changeResult;
            return this;
        }
        public Boolean getChangeResult() {
            return this.changeResult;
        }

    }

}
