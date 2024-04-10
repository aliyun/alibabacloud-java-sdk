// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class EnableWhatsappROIMetricResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The value OK indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableWhatsappROIMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableWhatsappROIMetricResponseBody self = new EnableWhatsappROIMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableWhatsappROIMetricResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public EnableWhatsappROIMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableWhatsappROIMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableWhatsappROIMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
