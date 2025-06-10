// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TargetVolumeSegmentResponseBody extends TeaModel {
    @NameInMap("Data")
    public TargetVolumeSegmentResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6cc7232e-d38b-4dda-b86d-6e0e31704fa1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TargetVolumeSegmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TargetVolumeSegmentResponseBody self = new TargetVolumeSegmentResponseBody();
        return TeaModel.build(map, self);
    }

    public TargetVolumeSegmentResponseBody setData(TargetVolumeSegmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TargetVolumeSegmentResponseBodyData getData() {
        return this.data;
    }

    public TargetVolumeSegmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TargetVolumeSegmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TargetVolumeSegmentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-med-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/seg-organ-ct/2023-01-31/13%3A59%3A57/286304994262646784.nii.gz?Expires=1675146629&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=L7jGtdydjfaFxQQCwqe4q4hlHz">http://vibktprfx-prod-prod-med-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/seg-organ-ct/2023-01-31/13%3A59%3A57/286304994262646784.nii.gz?Expires=1675146629&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=L7jGtdydjfaFxQQCwqe4q4hlHz</a>****</p>
         */
        @NameInMap("ResultURL")
        public String resultURL;

        public static TargetVolumeSegmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TargetVolumeSegmentResponseBodyData self = new TargetVolumeSegmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TargetVolumeSegmentResponseBodyData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

    }

}
