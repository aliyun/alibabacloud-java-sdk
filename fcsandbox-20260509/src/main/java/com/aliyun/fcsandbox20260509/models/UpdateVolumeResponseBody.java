// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateVolumeResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7ADFF8D8-D4BA-5F79-AD49-DDABFEA59B6C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The storage configuration.</p>
     */
    @NameInMap("volume")
    public E2BVolume volume;

    public static UpdateVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVolumeResponseBody self = new UpdateVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVolumeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateVolumeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVolumeResponseBody setVolume(E2BVolume volume) {
        this.volume = volume;
        return this;
    }
    public E2BVolume getVolume() {
        return this.volume;
    }

}
