// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ChangeSkyResponseBody extends TeaModel {
    @NameInMap("Data")
    public ChangeSkyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F9D60817-EC5A-4BAC-9092-4AD42220CFA8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeSkyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeSkyResponseBody self = new ChangeSkyResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeSkyResponseBody setData(ChangeSkyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeSkyResponseBodyData getData() {
        return this.data;
    }

    public ChangeSkyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeSkyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_skySegmentator/2020-7-24/invi_skySegmentator_015955791588111000000_5pn2QM.jpg?Expires=1595580958&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=Sq4po8h3WAj%2BBFrCgTP3ghlXn4">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_skySegmentator/2020-7-24/invi_skySegmentator_015955791588111000000_5pn2QM.jpg?Expires=1595580958&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=Sq4po8h3WAj%2BBFrCgTP3ghlXn4</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static ChangeSkyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeSkyResponseBodyData self = new ChangeSkyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeSkyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
