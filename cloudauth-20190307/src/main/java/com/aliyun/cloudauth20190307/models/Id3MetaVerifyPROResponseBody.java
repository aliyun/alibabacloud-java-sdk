// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyPROResponseBody extends TeaModel {
    /**
     * <p>The response code. <strong>200</strong> indicates that the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message of the API call.</p>
     * <blockquote>
     * <p>Notice: This parameter only indicates whether the API call is abnormal.</p>
     * </blockquote>
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
     * <p>2FA2C773-47DB-4156-B1EE-5B047321A939</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("ResultObject")
    public Id3MetaVerifyPROResponseBodyResultObject resultObject;

    public static Id3MetaVerifyPROResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Id3MetaVerifyPROResponseBody self = new Id3MetaVerifyPROResponseBody();
        return TeaModel.build(map, self);
    }

    public Id3MetaVerifyPROResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Id3MetaVerifyPROResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Id3MetaVerifyPROResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Id3MetaVerifyPROResponseBody setResultObject(Id3MetaVerifyPROResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Id3MetaVerifyPROResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Id3MetaVerifyPROResponseBodyResultObject extends TeaModel {
        /**
         * <p>The authoritative source verification result. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Verification is consistent (billable).</li>
         * <li><strong>2</strong>: Verification is inconsistent (billable).</li>
         * <li><strong>3</strong>: No record found (not billable).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <ul>
         * <li><p><strong>verifyScore</strong>: The face comparison score. Value range: 0 to 1000. A higher score indicates a higher probability of the same face. A score &gt;= 700.0 confirms the same person.</p>
         * </li>
         * <li><p><strong>faceAttack</strong>: Returned when liveness detection is enabled (does not participate in the verification result decision).</p>
         * </li>
         * <li><p><strong>invokeChannel</strong>: The identifier of the actual invocation channel. 1: authoritative source. 0: comprehensive source.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *  &quot;verifyScore&quot;: 810.28,
         * &quot;faceAttack&quot;:&quot;N&quot;,
         * &quot;invokeChannel&quot;: 1
         * }</p>
         */
        @NameInMap("FaceDetail")
        public String faceDetail;

        /**
         * <p>Indicates whether the whitelist is hit: <strong>Y</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("HitWhitelist")
        public String hitWhitelist;

        /**
         * <p>The authoritative source verification details. Valid values:</p>
         * <ul>
         * <li><p><strong>101</strong>: Authentication passed.</p>
         * </li>
         * <li><p><strong>201</strong>: Authentication failed. The name does not match the ID card number.</p>
         * </li>
         * <li><p><strong>202</strong>: Authentication failed. Suspected to be the person.</p>
         * </li>
         * <li><p><strong>203</strong>: Authentication failed. No photo in the database.</p>
         * </li>
         * <li><p><strong>204</strong>: Authentication failed. Not the same person.</p>
         * </li>
         * <li><p><strong>205</strong>: Authentication failed. Modeling of the image to be compared failed.</p>
         * </li>
         * <li><p><strong>206</strong>: Authentication failed. The image format is incorrect.</p>
         * </li>
         * <li><p><strong>207</strong>: Authentication failed. The uploaded image is too small. Upload the image again.</p>
         * </li>
         * <li><p><strong>208</strong>: Authentication failed. The quality of the uploaded portrait photo is poor. Upload the photo again.</p>
         * </li>
         * <li><p><strong>301</strong>: No record found. The ID number does not exist in the database.</p>
         * </li>
         * <li><p><strong>302</strong>: No record found. Verification is not possible.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static Id3MetaVerifyPROResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Id3MetaVerifyPROResponseBodyResultObject self = new Id3MetaVerifyPROResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Id3MetaVerifyPROResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Id3MetaVerifyPROResponseBodyResultObject setFaceDetail(String faceDetail) {
            this.faceDetail = faceDetail;
            return this;
        }
        public String getFaceDetail() {
            return this.faceDetail;
        }

        public Id3MetaVerifyPROResponseBodyResultObject setHitWhitelist(String hitWhitelist) {
            this.hitWhitelist = hitWhitelist;
            return this;
        }
        public String getHitWhitelist() {
            return this.hitWhitelist;
        }

        public Id3MetaVerifyPROResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
