// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderPayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("module")
    public Boolean module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
     * <p>210e842b16611337974412836dae27</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelOrderPayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderPayResponseBody self = new HotelOrderPayResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderPayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelOrderPayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderPayResponseBody setModule(Boolean module) {
        this.module = module;
        return this;
    }
    public Boolean getModule() {
        return this.module;
    }

    public HotelOrderPayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderPayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderPayResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
