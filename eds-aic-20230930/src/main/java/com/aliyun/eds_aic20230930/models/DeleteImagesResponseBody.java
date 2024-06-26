// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteImagesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteImagesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>4610632D-D661-5982-B3D7-5D3FD183F595</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagesResponseBody self = new DeleteImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImagesResponseBody setData(DeleteImagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteImagesResponseBodyData getData() {
        return this.data;
    }

    public DeleteImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteImagesResponseBodyData extends TeaModel {
        @NameInMap("FailDeleteImageIds")
        public java.util.List<String> failDeleteImageIds;

        @NameInMap("SuccessDeleteImageIds")
        public java.util.List<String> successDeleteImageIds;

        public static DeleteImagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteImagesResponseBodyData self = new DeleteImagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteImagesResponseBodyData setFailDeleteImageIds(java.util.List<String> failDeleteImageIds) {
            this.failDeleteImageIds = failDeleteImageIds;
            return this;
        }
        public java.util.List<String> getFailDeleteImageIds() {
            return this.failDeleteImageIds;
        }

        public DeleteImagesResponseBodyData setSuccessDeleteImageIds(java.util.List<String> successDeleteImageIds) {
            this.successDeleteImageIds = successDeleteImageIds;
            return this;
        }
        public java.util.List<String> getSuccessDeleteImageIds() {
            return this.successDeleteImageIds;
        }

    }

}
