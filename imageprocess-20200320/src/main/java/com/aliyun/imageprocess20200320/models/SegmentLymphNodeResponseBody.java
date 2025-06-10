// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentLymphNodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentLymphNodeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B48DECE6-29FE-1967-92F1-2E072873851A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentLymphNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentLymphNodeResponseBody self = new SegmentLymphNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentLymphNodeResponseBody setData(SegmentLymphNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentLymphNodeResponseBodyData getData() {
        return this.data;
    }

    public SegmentLymphNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SegmentLymphNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentLymphNodeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-med-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/seg-organ-ct/2023-03-06/18%3A03%3A28/286574099408093190.nii.gz?Expires=1678098808&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=jsPwP7rg4orZQFC6USE3JUOJcS">http://vibktprfx-prod-prod-med-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/seg-organ-ct/2023-03-06/18%3A03%3A28/286574099408093190.nii.gz?Expires=1678098808&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=jsPwP7rg4orZQFC6USE3JUOJcS</a>****</p>
         */
        @NameInMap("ResultURL")
        public String resultURL;

        public static SegmentLymphNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentLymphNodeResponseBodyData self = new SegmentLymphNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentLymphNodeResponseBodyData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

    }

}
