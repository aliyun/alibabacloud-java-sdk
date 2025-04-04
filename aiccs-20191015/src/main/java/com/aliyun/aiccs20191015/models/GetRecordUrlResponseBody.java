// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRecordUrlResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetRecordUrlResponseBodyData data;

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

    public static GetRecordUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordUrlResponseBody self = new GetRecordUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordUrlResponseBody setData(GetRecordUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRecordUrlResponseBodyData getData() {
        return this.data;
    }

    public GetRecordUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRecordUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecordUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRecordUrlResponseBodyData extends TeaModel {
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

        public static GetRecordUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRecordUrlResponseBodyData self = new GetRecordUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRecordUrlResponseBodyData setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public GetRecordUrlResponseBodyData setOssLink(String ossLink) {
            this.ossLink = ossLink;
            return this;
        }
        public String getOssLink() {
            return this.ossLink;
        }

    }

}
