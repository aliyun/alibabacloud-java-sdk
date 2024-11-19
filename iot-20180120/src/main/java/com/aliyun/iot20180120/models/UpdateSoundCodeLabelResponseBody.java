// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeLabelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.soundcodeservice.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>sound code service has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateSoundCodeLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSoundCodeLabelResponseBody self = new UpdateSoundCodeLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSoundCodeLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSoundCodeLabelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateSoundCodeLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSoundCodeLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
