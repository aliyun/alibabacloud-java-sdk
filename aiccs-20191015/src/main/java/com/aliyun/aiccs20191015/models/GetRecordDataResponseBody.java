// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRecordDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRecordDataResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRecordDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordDataResponseBody self = new GetRecordDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRecordDataResponseBody setData(GetRecordDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRecordDataResponseBodyData getData() {
        return this.data;
    }

    public GetRecordDataResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRecordDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRecordDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecordDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRecordDataResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1001067****</p>
         */
        @NameInMap("Acid")
        public String acid;

        /**
         * <strong>example:</strong>
         * <p><a href="http://aliccrec-shvpc.oss-cn-shanghai.aliyuncs.com/accrec_tmp/10010679716-12-01-56.wav">http://aliccrec-shvpc.oss-cn-shanghai.aliyuncs.com/accrec_tmp/10010679716-12-01-56.wav</a>?***</p>
         */
        @NameInMap("OssLink")
        public String ossLink;

        public static GetRecordDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRecordDataResponseBodyData self = new GetRecordDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRecordDataResponseBodyData setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public GetRecordDataResponseBodyData setOssLink(String ossLink) {
            this.ossLink = ossLink;
            return this;
        }
        public String getOssLink() {
            return this.ossLink;
        }

    }

}
