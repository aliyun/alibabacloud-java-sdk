// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class EnhanceImageColorResponseBody extends TeaModel {
    @NameInMap("Data")
    public EnhanceImageColorResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2F306ABD-5BC3-4FA0-89CF-0DED5B3654EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnhanceImageColorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnhanceImageColorResponseBody self = new EnhanceImageColorResponseBody();
        return TeaModel.build(map, self);
    }

    public EnhanceImageColorResponseBody setData(EnhanceImageColorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnhanceImageColorResponseBodyData getData() {
        return this.data;
    }

    public EnhanceImageColorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnhanceImageColorResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/image-recolor/2020-06-23-10/24%3A14-3cf26e84-a5d2-49b0-8332-0e139e20c49e.png?Expires=1592909654&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=fHrYvitvm0qZJ9nrWYa%2Fjd4pQS">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/image-recolor/2020-06-23-10/24%3A14-3cf26e84-a5d2-49b0-8332-0e139e20c49e.png?Expires=1592909654&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=fHrYvitvm0qZJ9nrWYa%2Fjd4pQS</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static EnhanceImageColorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnhanceImageColorResponseBodyData self = new EnhanceImageColorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnhanceImageColorResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
