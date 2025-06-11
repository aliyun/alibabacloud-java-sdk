// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeCardVerifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF03****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeCardVerifyResponseBodyResultObject resultObject;

    public static DescribeCardVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCardVerifyResponseBody self = new DescribeCardVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCardVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCardVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCardVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCardVerifyResponseBody setResultObject(DescribeCardVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeCardVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeCardVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("CardInfo")
        public String cardInfo;

        @NameInMap("FaceDetail")
        public String faceDetail;

        @NameInMap("OcrCardInfo")
        public String ocrCardInfo;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;certUrl&quot;: &quot;<a href="https://cn-shanghai-aliyun-nmeta.cn-shanghai.oss.aliyuncs.com/verify/xxxxxxx/xxxxxxxxxx_ocridface_dbf2_normal.jpeg">https://cn-shanghai-aliyun-nmeta.cn-shanghai.oss.aliyuncs.com/verify/xxxxxxx/xxxxxxxxxx_ocridface_dbf2_normal.jpeg</a>&quot;,
         *     &quot;certNationalUrl&quot;: &quot;<a href="https://cn-shanghai-aliyun-nmeta.cn-shanghai.oss.aliyuncs.com/verify/xxxxxxxxxx/xxxxxxxxxxx_ocridback_e8a3_normal.jpeg">https://cn-shanghai-aliyun-nmeta.cn-shanghai.oss.aliyuncs.com/verify/xxxxxxxxxx/xxxxxxxxxxx_ocridback_e8a3_normal.jpeg</a>&quot;
         * }</p>
         */
        @NameInMap("PictureInfo")
        public String pictureInfo;

        public static DescribeCardVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeCardVerifyResponseBodyResultObject self = new DescribeCardVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeCardVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public DescribeCardVerifyResponseBodyResultObject setCardInfo(String cardInfo) {
            this.cardInfo = cardInfo;
            return this;
        }
        public String getCardInfo() {
            return this.cardInfo;
        }

        public DescribeCardVerifyResponseBodyResultObject setFaceDetail(String faceDetail) {
            this.faceDetail = faceDetail;
            return this;
        }
        public String getFaceDetail() {
            return this.faceDetail;
        }

        public DescribeCardVerifyResponseBodyResultObject setOcrCardInfo(String ocrCardInfo) {
            this.ocrCardInfo = ocrCardInfo;
            return this;
        }
        public String getOcrCardInfo() {
            return this.ocrCardInfo;
        }

        public DescribeCardVerifyResponseBodyResultObject setPictureInfo(String pictureInfo) {
            this.pictureInfo = pictureInfo;
            return this;
        }
        public String getPictureInfo() {
            return this.pictureInfo;
        }

    }

}
