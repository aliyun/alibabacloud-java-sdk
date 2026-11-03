// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeCardVerifyResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success, and other values indicate failure.
     * Important</p>
     * <ul>
     * <li>This parameter indicates whether the operation is called correctly. For more information about return codes, see Error codes.</li>
     * <li>To view the business verification result, check the fields in ResultObject.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message returned for the operation call.
     * Important</p>
     * <ul>
     * <li>This parameter only indicates whether an exception occurs during the operation call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF03****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result object.</p>
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
         * <p>The identity verification result. Valid values:</p>
         * <ul>
         * <li>1: Consistent.</li>
         * <li>2: Inconsistent.</li>
         * <li>3: No record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The ID card information submitted for verification.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;address&quot;:&quot;No. 969 West Wenyi Road, Yuhang District, Hangzhou City, Zhejiang Province&quot;,&quot;birthDate&quot;:&quot;19901226&quot;,&quot;certName&quot;:&quot;Zhang San&quot;,&quot;certNo&quot;:&quot;1234561990122*****&quot;,&quot;nationality&quot;:&quot;Han&quot;,&quot;authority&quot;:&quot;xxx Public Security Bureau&quot;,&quot;startDate&quot;:&quot;20201130&quot;,&quot;endDate&quot;:&quot;20301130&quot;}</p>
         */
        @NameInMap("CardInfo")
        public String cardInfo;

        /**
         * <p>The image comparison score.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *  &quot;verifyScore&quot;: 50.28594166529785
         * }</p>
         */
        @NameInMap("FaceDetail")
        public String faceDetail;

        /**
         * <p>The ID card information read by OCR.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;address&quot;:&quot;No. 969 West Wenyi Road, Yuhang District, Hangzhou City, Zhejiang Province&quot;,&quot;birthDate&quot;:&quot;19901226&quot;,&quot;certName&quot;:&quot;Zhang San&quot;,&quot;certNo&quot;:&quot;1234561990122*****&quot;,&quot;nationality&quot;:&quot;Han&quot;,&quot;authority&quot;:&quot;xxx Public Security Bureau&quot;,&quot;startDate&quot;:&quot;20201130&quot;,&quot;endDate&quot;:&quot;20301130&quot;}</p>
         */
        @NameInMap("OcrCardInfo")
        public String ocrCardInfo;

        /**
         * <p>The URLs of the returned photos.</p>
         * <ul>
         * <li>certUrl: Front side.</li>
         * <li>certNationalUrl: National emblem side.</li>
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
