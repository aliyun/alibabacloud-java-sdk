// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeCardVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 indicates success, all others indicate failure.
     * Important</p>
     * <ul>
     * <li>This parameter indicates whether the interface was called correctly. For detailed return code explanations, please refer to the error codes.</li>
     * <li>Please check the business verification results through the fields in ResultObject.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Interface call return message.
     * Important</p>
     * <ul>
     * <li>This parameter only indicates whether there was an exception with the interface.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF03****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object.</p>
     */
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
         * <p>Identity verification result:</p>
         * <ul>
         * <li>1: Consistent</li>
         * <li>2: Inconsistent</li>
         * <li>3: No Record Found</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Submitted ID card information for verification.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;address&quot;:&quot;浙江省杭州市余杭区文一西路969号&quot;,&quot;birthDate&quot;:&quot;19901226&quot;,&quot;certName&quot;:&quot;张三&quot;,&quot;certNo&quot;:&quot;1234561990122*****&quot;,&quot;nationality&quot;:&quot;汉&quot;,&quot;authority&quot;:&quot;xxx公安局&quot;,&quot;startDate&quot;:&quot;20201130&quot;,&quot;endDate&quot;:&quot;20301130&quot;}</p>
         */
        @NameInMap("CardInfo")
        public String cardInfo;

        /**
         * <p>Image comparison score.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *  &quot;verifyScore&quot;: 50.28594166529785
         * }</p>
         */
        @NameInMap("FaceDetail")
        public String faceDetail;

        /**
         * <p>ID card information read by OCR.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;address&quot;:&quot;浙江省杭州市余杭区文一西路969号&quot;,&quot;birthDate&quot;:&quot;19901226&quot;,&quot;certName&quot;:&quot;张三&quot;,&quot;certNo&quot;:&quot;1234561990122*****&quot;,&quot;nationality&quot;:&quot;汉&quot;,&quot;authority&quot;:&quot;xxx公安局&quot;,&quot;startDate&quot;:&quot;20201130&quot;,&quot;endDate&quot;:&quot;20301130&quot;}</p>
         */
        @NameInMap("OcrCardInfo")
        public String ocrCardInfo;

        /**
         * <p>Returned photo URLs.</p>
         * <ul>
         * <li>certUrl  Front side</li>
         * <li>certNationalUrl  National emblem side</li>
         * </ul>
         * 
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
