// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateVolumeResponseBody extends TeaModel {
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
     * <p>B5AD8B54-4358-5F5B-ACAA-52F2016459C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The storage configuration.</p>
     */
    @NameInMap("volume")
    public E2BVolume volume;

    public static CreateVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVolumeResponseBody self = new CreateVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVolumeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVolumeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVolumeResponseBody setVolume(E2BVolume volume) {
        this.volume = volume;
        return this;
    }
    public E2BVolume getVolume() {
        return this.volume;
    }

}
