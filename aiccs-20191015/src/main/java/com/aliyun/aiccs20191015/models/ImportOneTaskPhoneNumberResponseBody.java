// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ImportOneTaskPhoneNumberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ImportOneTaskPhoneNumberResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D6A51251-F7C4-596A-9F45-3C3219A5450D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImportOneTaskPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportOneTaskPhoneNumberResponseBody self = new ImportOneTaskPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportOneTaskPhoneNumberResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ImportOneTaskPhoneNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportOneTaskPhoneNumberResponseBody setData(ImportOneTaskPhoneNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportOneTaskPhoneNumberResponseBodyData getData() {
        return this.data;
    }

    public ImportOneTaskPhoneNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportOneTaskPhoneNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportOneTaskPhoneNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportOneTaskPhoneNumberResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>92304322323*****</p>
         */
        @NameInMap("DetailId")
        public Long detailId;

        public static ImportOneTaskPhoneNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportOneTaskPhoneNumberResponseBodyData self = new ImportOneTaskPhoneNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportOneTaskPhoneNumberResponseBodyData setDetailId(Long detailId) {
            this.detailId = detailId;
            return this;
        }
        public Long getDetailId() {
            return this.detailId;
        }

    }

}
